package com.cafe24.bookmall.dao.test;

import java.util.List;

import com.cafe24.bookmall.dao.OrderDAO;
import com.cafe24.bookmall.vo.OrderVO;

public class OrderDAOTest {
	public static void main(String[] args) {
		insertTest();
		getListTest();
	}
	
	public static void insertTest() {
		OrderDAO dao = new OrderDAO();
		OrderVO vo = new OrderVO();
		
		vo.setPrice(25000);
		vo.setAddress("Seoul");
		vo.setCustomerNo(1L);
		vo.setOrderNo("#18030900001");
		vo.setDate("2018-03-09");
		dao.insert(vo);
	}
	
	public static void getListTest() {
		OrderDAO dao = new OrderDAO();
		List<OrderVO> list = dao.getList();
		for(OrderVO vo : list) {
			System.out.println(vo);
		}
	}
}
