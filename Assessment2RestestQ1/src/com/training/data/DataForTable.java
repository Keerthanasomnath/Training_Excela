package com.training.data;


public class DataForTable {

	private String place;
	private String country;
	private int population;
	
	public DataForTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataForTable(String place, String country, int population) {
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
		return "DataForTable [place=" + place + ", country=" + country + ", population=" + population + "]";
	}

	public int compareTo(DataForTable o) {
		if(o.population>this.population)return 1;
		if(o.population<this.population)return -1;
		return 0;
	}
	
}
