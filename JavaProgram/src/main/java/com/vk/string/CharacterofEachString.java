package com.vk.string;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CharacterofEachString {
//Count the Occurrences of Each Character in String
	
	public static void main(String[] args) {
		Java8MapMergeMethod("Vishal Khandelwal");
		Java8StreamCollectorMethod("Spring Boot Developer");
		hashMapForLoopMethod("Spring Rest Api");
		hashMapForEachMethod("Full Stack Developer");
		hashForLoop("Angular Developer");
		
		String input = "aaaabbccAAdd";
		char search = 'a';             // Character to search is 'a'.		  
		int result = recursionMethod(input,search,0); //start index 0 for  start of string.		  
		System.out.println("The Character '"+search+"' appears "+result+" times.");
		
		singleCountJava8CharsMethod(input,search);
		singleCountJava8CodePointsMethod(input, search);
		singleCountForLoopMethod(input, search);
		replaceMethod(input, search);
		regexMethod(input, search);
	}
	
	
	//foreach with Java 8 Map.merge()
	public static void Java8MapMergeMethod(String string) {
		String s = string;
		Map<Character, Integer> freqs = new HashMap<>();
		for (char c : s.toCharArray()) {
		    freqs.merge(c,                  // key = char
		                1,                  // value to merge
		                Integer::sum);      // counting
		}
		System.out.println("Frequencies:\n" + freqs);
		System.out.println("a = "+freqs.get('a'));
	}
	
	//Java 8 Stream and Collector
	public static void Java8StreamCollectorMethod(String string) {
		Map<Character, Integer> frequencies = string.chars().boxed()
		        .collect(Collectors.toMap(
		                // key = char
		                k -> Character.valueOf((char) k.intValue()),
		                v -> 1,         // 1 occurence
		                Integer::sum)); // counting
		System.out.println("Frequencies:\n" + frequencies);
		System.out.println("o = "+frequencies.get('o'));
	}
	
	//count character using hashmap
	public static void hashMapForLoopMethod(String string) {
	      String str = string;
	      HashMap <Character, Integer> hMap = new HashMap<>();
	      for (int i = str.length() - 1; i >= 0; i--) {
	         if (hMap.containsKey(str.charAt(i))) {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	         } else {
	            hMap.put(str.charAt(i),1);
	         }
	      }
	      System.out.println(hMap);
	      System.out.println("i = "+hMap.get('i'));
	   }
	
	// Java prorgam to count frequencies of
	// characters in string using Hashmap
	public static void hashMapForEachMethod(String inputString)
    {
        // Creating a HashMap containing char
        // as a key and occurrences as  a value
        HashMap<Character, Integer> charCountMap
            = new HashMap<Character, Integer>();
  
        // Converting given string to char array
  
        char[] strArray = inputString.toCharArray();
  
        // checking each char of strArray
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
  
                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
  
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
  
        System.out.println(charCountMap);
    }
	
	public static void hashForLoop(String string) {
		String input = string;
		
		Map<Character,Integer> hash = new HashMap<Character,Integer>();
		  
		  for(int i=0;i<input.length();i++)
		  {
		      if(hash.containsKey(input.charAt(i)))
		      hash.put(input.charAt(i), hash.get(input.charAt(i))+1);
		      
		      else
		      hash.put(input.charAt(i), 1);
		  }
		  System.out.println(hash);
	}
	
	//count occurence using recursion
	public static int recursionMethod(String str, char search, int index)
	  {
	      if(index >= str.length())
	      return 0;
	      
	      int count=0;
	      
	      if(str.charAt(index) == search)
	      count++;
	      
	      return count + recursionMethod(str,search,index+1);
	  }
	
	// chars() method return integer representation of codepoint values of the character stream
	public static void singleCountJava8CharsMethod(String string,Character character) {
		long count = string.chars().filter(ch -> ch == character).count();
		System.out.println("The Character '"+character+"' appears "+count+" times.");
	}
	
	// codePoints() just return the actual codepoint or Unicode values of the stream.
	public static void singleCountJava8CodePointsMethod(String string,Character character) {
		long count = string.codePoints().filter(ch -> ch == character).count();
		System.out.println("The Character '"+character+"' appears "+count+" times.");
	}
	
	//basic for loop method
	public static void singleCountForLoopMethod(String string,Character character) {
		int counter = 0;
	    for (int i = 0; i < string.length(); i++)
	    {
	        if (string.charAt(i) == character) {
	            counter++;
	        }
	    }
		System.out.println("The Character '"+character+"' appears "+counter+" times.");
	}
	
	//count character using replace method
	public static void replaceMethod(String string,Character character) {		
		int count = string.length() - string.replace(String.valueOf(character), "").length();
		System.out.println("The Character '"+character+"' appears "+count+" times.");
	}
	
	//count character using regex method
	public static void regexMethod(String string,Character character) {		
		Matcher matcher = Pattern.compile(String.valueOf(character)).matcher(string);

		int counter = 0;
		while (matcher.find()) {
			counter++;
		}
		System.out.println("The Character '" + character + "' appears " + counter + " times.");
	}
	   
}

