package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import com.example.entity.Member;
import com.example.entity.MemberRepository;
import com.example.util.ConnectionFactory;




public class App 
{
    public static void main( String[] args ) {
         Connection con;
con = ConnectionFactory.getOracleConnection();
//			con = DriverManager.getConnection
//					("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
          System.out.println(con);
MemberRepository service= new MemberRepository(con);
service.findAll().forEach(System.out::println);
Member obj =new Member(007,"shree","pune",LocalDate.of(24, 4, 12),"Lifetime",3500,5,700);
System.out.println(service.add(obj));
//System.out.println(service.remove(4));
}
}
