package com.example.entity;

import java.util.ArrayList;

import java.util.List;
import java.sql.*;
import java.time.LocalDate;

import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository<Member> {

	private Connection con;
		
	public MemberRepository(Connection con) {
		super();
		this.con=con;
		// TODO Auto-generated constructor stub
	}

	public int add(Member obj) {
		int n=0;
		String sqlAdd = "Insert into MembersAniKeerthu2000 values(?,?,?,?,?,?,?,?)";

		try(PreparedStatement pstmt = con.prepareStatement(sqlAdd)){

			
			pstmt.setInt(1,obj.getMemberId());
			pstmt.setString(2,obj.getMemberName());
			pstmt.setString(3,obj.getMemberAddress());
			pstmt.setDate(4,Date.valueOf(obj.getAccountOpenDate()));
			pstmt.setString(5,obj.getMemberShipType());
			pstmt.setDouble(6,obj.getFeesPaid());
			pstmt.setInt(7,obj.getMaxBooksAllowed());	
			pstmt.setDouble(8,obj.getPenaltyAmount());
			
		n = pstmt.executeUpdate();

	}catch(SQLException e){
		e.printStackTrace();
	}
		return n;
	}
		
	public List<Member> findAll() {
		List<Member> memberList = new ArrayList<Member>();
		String sql = "Select * from MembersAniKeerthu2000";
		
		try(PreparedStatement pstmt =con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
			
				int memberId = rs.getInt("Member_Id");
				String memberName = rs.getString("Member_Name");
				String memberAddress = rs.getString("Member_address");
				LocalDate accountOpenDate=rs.getDate("Acc_Open_Date").toLocalDate();
				String memberShipType = rs.getString("Membership_type");
				double feesPaid = rs.getInt("Fees_paid");
				int maxBooksAllowed = rs.getInt("Max_Books_Allowed");	
				double penaltyAmount = rs.getDouble("Penalty_Amount");
				
				Member obj= new Member(memberId, memberName, memberAddress, accountOpenDate, memberShipType, feesPaid, maxBooksAllowed, penaltyAmount);
				memberList.add(obj);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return memberList;
	}

	public int remove(int id) {
		String sql = "delete from MembersAniKeerthu2000  where Member_Id =?";
	       int rowDeleted =0;

	try (PreparedStatement pstmt = con.prepareStatement(sql)) {
	      pstmt.setInt(1,id);
	             rowDeleted = pstmt.executeUpdate();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	      return rowDeleted;
	 
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
