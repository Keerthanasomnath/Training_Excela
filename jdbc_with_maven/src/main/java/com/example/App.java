package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import com.example.demo.ProductService;
import com.example.entity.Member;
import com.example.entity.MemberRepository;
import com.example.util.ConnectionFactory;
import com.example.util.Product;




public class App 
{
	public static void member() {
//		 Connection con;
//        con = ConnectionFactory.getOracleConnection();
////con = DriverManager.getConnection
////					("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
//         //System.out.println(con);
//MemberRepository service= new MemberRepository(con);
//Member obj =new Member(860,"shree","pune",LocalDate.of(24, 4, 12),"Lifetime",3500,5,700);
//System.out.println(service.add(obj));
//service.findAll().forEach(System.out::println);
//
////System.out.println(service.remove(4));

	
	} 
	public static void product() {
		Connection con1;
        con1 = ConnectionFactory.getOracleConnection();
        System.out.println(con1);
        ProductService serv = new ProductService(con1);
//        Product prod = new Product(226, "UPS", 99990);
//        int add= serv.addProduct(prod);
//        System.out.println("Added: "+add);
              serv.findAll().forEach(System.out::println);
              Product kathil = new Product(990,"kaju kathi",55.00);
              Product jamun = new Product(991,"jamun",990);
              
        
	}
    public static void main( String[] args ) {
         product();
}
}
