package com.example;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.demo.ProductService;
import com.example.model.LoanServices;
import com.example.util.ConnectionFactory;
import com.example.util.Product;

public class App 
{
    public static void main( String[] args )
    {
//    	Connection con;
//  con = ConnectionFactory.getOracleConnection();
//try {
//	con = DriverManager.getConnection
//					("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
//	System.out.println(con);
//	
//} catch (SQLException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
    	Connection con1;
        con1 = ConnectionFactory.getOracleConnection();
        System.out.println(con1);
        LoanServices serv = new LoanServices(con1);
        serv.findAll().forEach(System.out::println);
        
         prod = new Product(226, "UPS", 99990);
        int add= serv.addProduct(prod);
        

    }
}
