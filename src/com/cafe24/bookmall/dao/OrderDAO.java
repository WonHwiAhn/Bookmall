package com.cafe24.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cafe24.bookmall.vo.OrderVO;

public class OrderDAO{
	public List<OrderVO> getList(){
		List<OrderVO> list = new ArrayList<OrderVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			
			String sql = "select no, totalprice, destination, customer_no, order_no, order_date from buy";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				OrderVO vo = new OrderVO();
				
				vo.setNo(rs.getLong(1));
				vo.setPrice(rs.getInt(2));
				vo.setAddress(rs.getString(3));
				vo.setCustomerNo(rs.getLong(4));
				vo.setOrderNo(rs.getString(5));
				vo.setDate(rs.getString(6));
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				
			}
		}
		return list;
	}
	
	public boolean insert(OrderVO vo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into buy values(null, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, vo.getPrice());
			pstmt.setString(2, vo.getAddress());
			pstmt.setLong(3, vo.getCustomerNo());
			pstmt.setString(4, vo.getOrderNo());
			pstmt.setString(5, vo.getDate());
			
			int count = pstmt.executeUpdate();
			
			result = (count == 1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				
			}
		}
		
		return result;
	}
	
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/bookmall";
			conn = DriverManager.getConnection(url, "bookmall", "bookmall");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패: " + e);
		}
		
		return conn;
	}
}
