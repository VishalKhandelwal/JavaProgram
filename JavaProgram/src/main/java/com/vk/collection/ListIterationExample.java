package com.vk.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterationExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C");

		
		//---------IterateListUsingForLoop--------//
		for (int i = 0; i < list.size(); i++) {
		    String item = list.get(i);
		    System.out.println(item);
		}
		//---------IterateListUsingEnhancedForLoop--------//
		for (String item : list) {
		    System.out.println(item);
		}
		//---------IterateListUsingIterator--------//
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
		//---------IterateListUsingWhileLoop--------//
		int num = 0;

		while (list.size()>num) {			
			System.out.println(list.get(num));
			num++;
		}
		//---------IterateListUsingLambdaExpression--------//
		list.forEach(item -> System.out.println(item));
		//---------IterateListUsingMethodReferenceOperator--------//
		list.forEach(System.out::println);
	}
}
