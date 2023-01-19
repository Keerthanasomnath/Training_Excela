package com.training;

import java.util.ArrayList;
import java.util.List;



public class DataServices implements CrudRepository<Data> {
	
	private ArrayList<Data> DataList;

	@Override
	public int add(Data obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Data> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Data findByPlace(String country) {
		Data result=null;
		for(Data eachData:DataList) {
			if(country==eachData.getPlace()) {
				result=eachData;
			}
		}
		return result;
	}

}
