package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import com.example.demo.ProductService;
import com.example.entity.Product;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			System.out.println(con);
			ProductService service= new ProductService(con);
			
//			Product toAdd = new Product(300,"Gene",80);
//			
//			int rowAdded = service.addProduct(toAdd);
//			System.out.println("Row Added:="+rowAdded);
//			
//			service.findAll().forEach(System.out::println);
//			
			 Optional<Product> found = service.findById(30);
		
			if(found.isPresent()) {
				System.out.println(found.get());
			}else {
				System.out.println("Product with given ID is not present");
			}
			
		   int rowsUpdated  =service.updatePriceByName("TV", 56000);
		   System.out.println("Rows Updated :="+rowsUpdated);
		   
			
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
