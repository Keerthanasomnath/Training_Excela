package com.training.data;

import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.CrudRepository;

public class DataForTableServices implements CrudRepository<DataForTable> {

		
		private ArrayList<DataForTable>DataList;

		@Override
		public boolean add(DataForTable obj) {
			// TODO Auto-generated method stub
			return DataList.add(obj);
		}

		@Override
		public List<DataForTable> findAll() {
			// TODO Auto-generated method stub
			return this.DataList;
		}

		@Override
		public DataForTable findByPlace(String country) {
			DataForTable result=null;
			for(DataForTable eachData:DataList) {
				if(country==eachData.getPlace()) {
					result=eachData;
				}
			}
			return result;
		}

	}

