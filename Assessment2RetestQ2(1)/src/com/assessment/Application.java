package com.assessment;

import static java.util.stream.Collectors.toList;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
		
		List<DataForTable> tableList =StreamList.getStreamTable();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter place to find its country");
		String a=sc.next();
		//Function<STable,String> mapc =e->e.getCountry();
		//Predicate<STable> place =r->r.getPlace().equals(a);
		List<String> tableName = tableList.stream().filter(r->r.getPlace().equals(a)).map(e->e.getCountry()).collect(toList());
		tableName.forEach(System.out::println);
		
		System.out.println("Enter country name to get population");
		String b = sc.next();
		
		Predicate<DataForTable> pop = r->r.getCountry().equals(b);
		Function<DataForTable,Long> map =e->e.getPopulation();
		List<Long> tablepop = tableList.stream().filter(pop).map(map).collect(toList());
		tablepop.forEach(System.out::println);

		System.out.println("Enter country to find its count");
		String c = sc.next();
		long list =tableList.stream().filter(e->e.getCountry().equals(c)).count();
		System.out.println(c +" "+list);
		sc.close();
	}
}

class DataForTable {
	
	private String country;
	private String place;
	private long population;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public DataForTable(String country, String place, long population) {
		super();
		this.country = country;
		this.place = place;
		this.population = population;
	}
	
	public DataForTable() {
		super();
		
	}
	
}

class StreamList {
	
	public static List<DataForTable> getStreamTable(){
		
		DataForTable country1 = new DataForTable("USA","Kansas City",501927);
		DataForTable country2 = new DataForTable("India","Chennai",7090000);
		DataForTable country3 = new DataForTable("USA","Los Angles",3970000);
		DataForTable country4 = new DataForTable("Nepal","Kathmandu",1000000);
		DataForTable country5 = new DataForTable("India","Kolkata",14900000);
		DataForTable country6 = new DataForTable("USA","Kansas City",706000);
		
		ArrayList<DataForTable> strmsList = new ArrayList<DataForTable>();
		
		strmsList.add(country1);
		strmsList.add(country2);
		strmsList.add(country3);
		strmsList.add(country4);
		strmsList.add(country5);
		strmsList.add(country6);
		
		return strmsList;
	}

}