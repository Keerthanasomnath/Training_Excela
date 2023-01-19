package com.training;

import java.util.List;
import java.sql.*;

public interface CrudRepository<T> {
	public int add(T obj);
	public List<T> findAll();
	public T findByPlace(String country);


}
