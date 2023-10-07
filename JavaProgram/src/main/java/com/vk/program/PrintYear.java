package com.vk.program;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class PrintYear {

	//How to print Year Without Get Year Method
	public static void main(String[] args) {
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);
		
		int year1 = Year.now().getValue();
		System.out.println(year1);
		
		Date date = new Date();
		int year2 = Integer.parseInt(new SimpleDateFormat("yyyy").format(date));
		System.out.println(year2);
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy");  
		String year3 = ldt.format(format);
		System.out.println(year3);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.getYear());
	}
}
