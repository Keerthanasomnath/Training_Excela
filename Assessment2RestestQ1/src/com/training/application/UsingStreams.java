package com.training.application;

import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import com.training.data.DataForTable;





public class UsingStreams {
	public static void useDistinct(List<DataForTable> dataList) {
		 dataList.stream().distinct().forEach(System.out::println);
		}
		
		public static void collectToSet(List<DataForTable> dataList) {
			Set<DataForTable> dataSet = dataList.stream().filter(e->e.getPopulation()>500).collect(toSet());
		}
		
		public static void count(List<DataForTable>dataList) {
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
		
		
public static void main(String []args) {
	
	
	 DataForTable row1 = new DataForTable ("Kanasas city","USA",50100957);
	 DataForTable row2 = new DataForTable ("chennai","India",7090000);
	 DataForTable row3 = new DataForTable ("Los Angles","USA",3970000);
	 DataForTable row4 = new DataForTable("Katmandu","Nepal",1000000);
	 DataForTable row5 = new DataForTable ("Kolkata","India",14900000);
	 DataForTable row6 = new DataForTable ("Denver","USA",706000);
	    
		List<DataForTable> dataList = Arrays.asList(row1,row2,row3,row4,row5,row6);
		
		
		
	int key = 1;
		switch (key) {
	    case 1:
		useDistinct(dataList);
	     break;
	       case 2:
			collectToSet(dataList);
			break;
	       case 3:
		count(dataList);	
	       default:
			break;
		}
		
	}

		
	}

