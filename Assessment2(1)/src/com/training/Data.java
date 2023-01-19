package com.training;

import java.util.Comparator;

public class Data implements Comparable<Data> {

	private String place;
	private String country;
	private int population;
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(String place, String country, int population) {
		super();
		this.place = place;
		this.country = country;
		this.population = population;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Data [place=" + place + ", country=" + country + ", population=" + population + "]";
	}

	@Override
	public int compareTo(Data o) {
		if(o.population>this.population)return 1;
		if(o.population<this.population)return -1;
		return 0;
	}
	
	
}
