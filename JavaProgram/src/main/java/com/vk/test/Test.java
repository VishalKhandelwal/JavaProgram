package com.vk.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
 public static void main(String[] args) {
	LocalDate endDate = LocalDate.now();
	LocalDate startDate = LocalDate.parse("2020-01-22");
	//System.out.println(endDate+"\n"+startDate);
	
	
	for(LocalDate date=startDate; date.isBefore(endDate);date = date.plusDays(1))
	{
		System.out.println(date.format(DateTimeFormatter.ofPattern("M/d/yy")));
	}
}
}
