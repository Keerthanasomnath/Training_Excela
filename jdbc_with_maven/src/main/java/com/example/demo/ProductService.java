package com.example.demo;
import java.sql.*;
import java.util.*;
import com.example.entity.*;
import com.example.util.Product;

public class ProductService {

	private Connection con;
	

	public ProductService(Connection con) {
		super();
		this.con = con;
	}
	
	public int updatePriceByName(String ProductName ,double newPrice) {
		int rowsUpdated = 0;
		String sql = "UPDATE KEEANISOMPRODUCT set PRICE = ? where PRODUCT_NAME = ?";
		try (PreparedStatement pstmt =con.prepareStatement(sql)) {
			
			pstmt.setDouble(1,newPrice);
			pstmt.setString(2,ProductName);
		           
		      rowsUpdated = pstmt.executeUpdate();
		      
		} catch (SQLException e) {
		e.printStackTrace();
		}
		   

		return rowsUpdated;
	}
	
	public int deleteByInt(int id) {
		int rowsDeleted = 0;
		String sql = "DELETE FROM KEEANISOMPRODUCT where PRODUCT_ID =?";
		try (PreparedStatement pstmt =con.prepareStatement(sql)) {
			pstmt.setInt(1,id);
		           
		      rowsDeleted = pstmt.executeUpdate();
		      
		} catch (SQLException e) {
		e.printStackTrace();
		}
		      return rowsDeleted;
		 }

	
    public Optional <Product>findById(int ID){
    	Optional <Product> obj = Optional.empty();
    	String sql = "select * from KEEANISOMPRODUCT where PRODUCT_ID=?";

 try (PreparedStatement pstmt = con.prepareStatement(sql)) {

 pstmt.setInt(1,ID);

 ResultSet rs = pstmt.executeQuery();
      if(rs.next()) {
	 
	 int  PRODUCT_ID = rs.getInt("PRODUCT_ID");
	String productName = rs.getString("PRODUCT_NAME");
	double amount = rs.getDouble("PRICE");
	
	Product prod = new Product(PRODUCT_ID,productName,amount);
	obj= Optional.of(prod);
	

      }
	} catch (SQLException e) {
	e.printStackTrace();
	}
    	return obj;
    }
	
	
	
	public int addProduct(Product product) {
		int rowAdded = 0;
		String sql = "insert into KEEANISOMPRODUCT values(?,?,?)";
           try(PreparedStatement pstmt =con.prepareStatement(sql)){
			pstmt.setInt(1,product.getProductId());
			pstmt.setString(2,product.getProductName());	 
			pstmt.setDouble(3,product.getPrice());
			rowAdded = pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rowAdded;
		
	}

	
	public List<Product> findAll(){
		List<Product> productList = new ArrayList<Product>();
		String sql = "Select * from KEEANISOMPRODUCT";
		try(PreparedStatement pstmt =con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int productId = rs.getInt("PRODUCT_ID");
				String productName = rs.getString("PRODUCT_NAME");
				double price = rs.getDouble("PRICE");
				
				Product prod = new Product(productId,productName,price);
				
				productList.add(prod);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return productList;
	}
	
}
