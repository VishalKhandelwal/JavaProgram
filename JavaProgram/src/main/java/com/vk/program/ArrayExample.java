package com.vk.program;

import java.util.Arrays;

/**
 * Write a java program where input array like this int a[] = {1,2,3,4,5,6};
 * and output like this int b[] = {21,20,18,15,11,6};
 * 
 * @author Vishal
 *
 */
public class ArrayExample {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int b[] = new int[a.length];
		
		for(int i=0;i<b.length;i++) {
			for(int j=i;j<a.length;j++) {
				b[i] += a[j];
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
