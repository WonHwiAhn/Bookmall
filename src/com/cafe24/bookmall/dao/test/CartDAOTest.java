package com.cafe24.bookmall.dao.test;

import java.util.List;

import com.cafe24.bookmall.dao.CartDAO;
import com.cafe24.bookmall.vo.CartVO;

public class CartDAOTest {
	public static void main(String[] args) {
		insertTest();
		getListTest();
	}
	
	public static void insertTest() {
		CartDAO dao = new CartDAO();
		CartVO vo = new CartVO();
		
		vo.setCount(2);
		vo.setBookNo(1L);
		vo.setCustomerNo(1L);
		
		dao.insert(vo);
		
		vo.setCount(4);
		vo.setBookNo(2L);
		vo.setCustomerNo(2L);
		
		dao.insert(vo);
	}
	
	public static void getListTest() {
		CartDAO dao = new CartDAO();
		List<CartVO> list = dao.getList();
		for(CartVO vo : list) {
			System.out.println(vo);
		}
	}
}
