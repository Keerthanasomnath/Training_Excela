package com.example.model;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.ifaces.CrudRepository;



public class LoanServices implements CrudRepository<LoanApplication>{

	private Connection con1;
	
	public LoanServices(Connection con1) {
		super();
		this.con1=con1;
	}

	public int add(LoanApplication obj) {
		int n=0;
		String sql1="insert into CustomerAniKeerthu2000 values(?,?,?,?)";
		String sqlAdd = "Insert into LoanApplicationAniKeerthu2000 values(?,?,?)";
		

		try(PreparedStatement pstmt = con1.prepareStatement(sqlAdd);
				PreparedStatement pstmt2=con1.prepareStatement(sql1)){

			
			pstmt.setInt(1, obj.getCustomer().getCustomerId());
			pstmt.setString(2, obj.getCustomer().getCustomerName());
			pstmt.setLong(3, obj.getCustomer().getPhoneNumber());
			pstmt.setDouble(4, obj.getCustomer().getCreditScore());
			
			pstmt2.setInt(1, obj.getApplicationNumber());
			pstmt2.setInt(2, obj.getCustomer().getCustomerId());
			pstmt2.setDouble(3, obj.getLoanAmount());
			
			pstmt2.executeUpdate();

			
		n = pstmt.executeUpdate();

	}catch(SQLException e){
		e.printStackTrace();
	}
		return n;

	}

	public List<LoanApplication> findAll() {
		
		List<LoanApplication> loanList=new ArrayList<LoanApplication>();

		String sql = "SELECT * from CustomerAniKeerthu2000 a JOIN LoanApplicationAniKeerthu2000 b on a.Customer_Id = b.Customer_Id";
				try(PreparedStatement pstmt=con1.prepareStatement(sql)){
				
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()) {
					
					int customerId=rs.getInt("customer_id");
					String customerName=rs.getString("customer_name");
					int phoneNumber=rs.getInt("mobilenumber");
					double creditScore=rs.getDouble("creditscore");
					int applicationNumber=rs.getInt("applicationnum_id");
					double loanAmount=rs.getDouble("loanamount");
					
					Customer customer=new Customer(customerId,customerName,phoneNumber,creditScore);
					LoanApplication prod=new LoanApplication(applicationNumber,customer,loanAmount);
					loanList.add(prod);
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return loanList;
			
}

	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LoanApplication findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(int Id, LoanApplication member) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}