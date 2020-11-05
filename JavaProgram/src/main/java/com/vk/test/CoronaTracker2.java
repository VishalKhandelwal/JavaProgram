package com.vk.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CoronaTracker2 {
	
	 private static String VIRUS_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

	    	
	public static void main(String[] args) throws Exception {
		 
		 HashMap<String, List<String>> listcountry = new HashMap<>();
		 int count =1;
		StringReader csvBodyReader = new StringReader(getUrlContents(VIRUS_DATA_URL));
       // System.out.println(csvBodyReader);
		String country;
		List<String> allCases;
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);
        for (CSVRecord record : records) {
            
            country = record.get("Country/Region");           
          
            allCases = new ArrayList<>();
            
            LocalDate endDate = LocalDate.now();
        	LocalDate startDate = LocalDate.parse("2020-03-22");
        	//System.out.println(endDate+"\n"+startDate);
        	
        	
        	for(LocalDate date=startDate; date.isBefore(endDate);date = date.plusDays(1))
        	{
        		
        		allCases.add(record.get(date.format(DateTimeFormatter.ofPattern("M/d/yy"))));
        	}
            
            System.out.println(count);
            //System.out.println(newStats);
            listcountry.put(country, allCases);
            count++;
        }        
       listcountry.forEach((K,V) -> System.out.println(K+":"+V));
	}
	
	private static String getUrlContents(String theUrl)
	  {
	    StringBuilder content = new StringBuilder();

	    // many of these calls can throw exceptions, so i've just
	    // wrapped them all in one try/catch statement.
	    try
	    {
	      // create a url object
	      URL url = new URL(theUrl);

	      // create a urlconnection object
	      URLConnection urlConnection = url.openConnection();

	      // wrap the urlconnection in a bufferedreader
	      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

	      String line;

	      // read from the urlconnection via the bufferedreader
	      while ((line = bufferedReader.readLine()) != null)
	      {
	        content.append(line + "\n");
	      }
	      bufferedReader.close();
	    }
	    catch(Exception e)
	    {
	      e.printStackTrace();
	    }
	    return content.toString();
	  }

}
