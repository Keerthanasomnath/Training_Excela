package com.training.streams;

import static java.util.stream.Collectors.toMap;

import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.training.Data;


public class UsingStreams {
	public static void useDistinct(List<Data> dataList) {
		 dataList.stream().distinct().forEach(System.out::println);
		}
		
		public static void collectToSet(List<Data> dataList) {
			Set<Data> dataSet = dataList.stream().filter(e->e.getCountry()=="USA").collect(toSet());
		}
		public static void collectToMap(List<Data>dataList) {
//			Set<Book> bookSet1 = bookList.stream().collect(toSet());
			
 Map<Integer,String> values = dataList.stream().
					filter(e->e.getPopulation()>500000).distinct().collect(toMap(Data::getPopulation,Data::getCountry));
			
			values.forEach((key,value) -> System.out.println(key+ "," +value));
		}
		
		public static void count(List<Data>dataList) {
			long  count = dataList.stream().
					filter(e->e.getCountry().contains("USA")).count();
			System.out.println("Count of  USA  " +count);
		
			
			long  count1 = dataList.stream().
					filter(e->e.getCountry().contains("India")).count();
			System.out.println("Count of  India  " +count1);
			
			
			long  count2 = dataList.stream().
					filter(e->e.getCountry().contains("Nepal")).count();
			System.out.println("Count of  Nepal  " +count2);
			
			
		}
		
		

public static void main(String[]args) {
	
    Data row1 = new Data ("Kanasas city","USA",50100957);
    Data row2 = new Data ("chennai","India",7090000);
    Data row3 = new Data ("Los Angles","USA",3970000);
    Data row4 = new Data ("Katmandu","Nepal",1000000);
    Data row5 = new Data ("Kolkata","India",14900000);
    Data row6 = new Data ("Denver","USA",706000);
    
	List<Data> dataList = Arrays.asList(row1,row2,row3,row4,row5,row6);
	
	
	
int key = 3;
	switch (key) {
    case 1:
	useDistinct(dataList);
     break;
       case 2:
		collectToMap(dataList);;
		break;
       case 3:
	count(dataList);	
       default:
		break;
	}
	
}
	
}

