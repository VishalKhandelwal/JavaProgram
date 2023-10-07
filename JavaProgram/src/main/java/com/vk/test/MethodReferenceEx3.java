package com.vk.test;
 
import java.util.ArrayList;
import java.util.List;
 
/***** Reference To An Instance Method Of An Arbitrary Object Of A Particular Type *****/
public class MethodReferenceEx3 {
 
    public static void main(String[] args) {
 
        List<String> weeks = new ArrayList<String>();
        weeks.add("Monday");
        weeks.add("Tuesday");
        weeks.add("Wednesday");
        weeks.add("Thursday");
        weeks.add("Friday");
        weeks.add("Saturday");
        weeks.add("Sunday");
 
        /**** Using Lambda Expression ****/
        System.out.println("--------------------Using Lambda Expression----------------------");
        weeks.stream().map((s)-> s.toUpperCase()).forEach((s)->System.out.println(s));
 
        /**** Using Method Reference ****/
        System.out.println("\n---------------------Using Method Reference---------------------");
        weeks.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}