package com.cafe24.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cafe24.bookmall.vo.OrderListVO;

public class OrderListDAO {
	public List<OrderListVO> getList(){
		List<OrderListVO> list = new ArrayList<OrderListVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			
			String sql = "select order_count, order_price, order_no, book_no from orderbook";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				OrderListVO vo = new OrderListVO();
				
				vo.setOrderCount(rs.getLong(1));
				vo.setOrderPrice(rs.getInt(2));
				vo.setOrderNo(rs.getLong(3));
				vo.setBookNo(rs.getLong(4));
				
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
	
	public boolean insert(OrderListVO vo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into orderbook values(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setLong(1, vo.getOrderCount());
			pstmt.setInt(2, vo.getOrderPrice());
			pstmt.setLong(3, vo.getOrderNo());
			pstmt.setLong(4, vo.getBookNo());
			
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
