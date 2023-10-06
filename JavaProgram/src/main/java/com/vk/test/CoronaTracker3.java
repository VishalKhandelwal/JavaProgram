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
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CoronaTracker3 {
	
	 private static String VIRUS_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

	    private static  List<LocationStats> allStats = new ArrayList<>();
	    public static  List<LocationStats> getAllStats() {
	        return allStats;
	    }
	
	public static void main(String[] args) throws Exception {
		 List<LocationStats> newStats = new ArrayList<>();
		 int count =1;
		StringReader csvBodyReader = new StringReader(getUrlContents(VIRUS_DATA_URL));
       // System.out.println(csvBodyReader);
		CSVParser records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);
        for (CSVRecord record : records) {
            LocationStats locationStat = new LocationStats();
            locationStat.setsNo(count);
            locationStat.setState(record.get("Province/State"));
            locationStat.setCountry(record.get("Country/Region"));
            int latestCases = Integer.parseInt(record.get(record.size() - 1));
            int prevDayCases = Integer.parseInt(record.get(record.size() - 2));
            locationStat.setLatestTotalCases(latestCases);
            locationStat.setDiffFromPrevDay(latestCases - prevDayCases);
            List<String> allCases = new ArrayList<>();
            
            LocalDate endDate = LocalDate.now();
        	LocalDate startDate = LocalDate.parse("2020-03-22");
        	//System.out.println(endDate+"\n"+startDate);
        	
        	
        	for(LocalDate date=startDate; date.isBefore(endDate);date = date.plusDays(1))
        	{
        		//System.out.println(date.format(DateTimeFormatter.ofPattern("M/d/yy"))+"\t"+record.get(date.format(DateTimeFormatter.ofPattern("M/d/yy"))));
        		allCases.add(record.get(date.format(DateTimeFormatter.ofPattern("M/d/yy"))));
        	}
            
            locationStat.setAllcases(allCases.toString());
            newStats.add(locationStat);
            //System.out.println(newStats);
            count++;
        }
        
        //System.out.println(newStats);
        newStats.forEach(System.out::println);
        //this.allStats = newStats;
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
