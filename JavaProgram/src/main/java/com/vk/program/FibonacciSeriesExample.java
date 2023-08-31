package com.vk.program;

import java.util.stream.Stream;

public class FibonacciSeriesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 basic(); 
		 System.out.println("recursion");
		 //using recursion
		 int count=10;    
		  System.out.print(n1+" "+n2);//printing 0 and 1    
		  printFibonacciUsingRecursion(count-2);//n-2 because 2 numbers are already printed  
		  
		  //java8
		  System.out.println("java8");
		  java8Stream();
	}

	public static void basic() {
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }
	}
	
	
	//using Recursion
	static int n1=0,n2=1,n3=0;
	 static void printFibonacciUsingRecursion(int count){   
		 
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacciUsingRecursion(count-1);    
	     }    
	 }    

	 //using java 8
	 public static void java8Stream() {
	 Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
		.limit(10)
		.map(t -> t[0])
		.forEach(x -> System.out.print(x+" "));
	 }
}
