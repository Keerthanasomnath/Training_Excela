package com.training.ifaces;

import java.util.List;

import com.training.data.DataForTable;

public interface CrudRepository<T> {

	public List<T> findAll();

	boolean add(DataForTable obj);

	DataForTable findByPlace(String country);
}
