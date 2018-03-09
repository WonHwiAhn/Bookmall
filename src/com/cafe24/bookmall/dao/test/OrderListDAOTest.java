package com.cafe24.bookmall.dao.test;

import java.util.List;

import com.cafe24.bookmall.dao.OrderListDAO;
import com.cafe24.bookmall.vo.OrderListVO;

public class OrderListDAOTest {
	public static void insertTest() {
		OrderListDAO dao = new OrderListDAO();
		OrderListVO vo = new OrderListVO();
		
		vo.setOrderCount(1L);
		vo.setOrderPrice(55000);
		vo.setOrderNo(1L);
		vo.setBookNo(1L);
		dao.insert(vo);
		
		vo.setOrderCount(1L);
		vo.setOrderPrice(35000);
		vo.setOrderNo(1L);
		vo.setBookNo(2L);
		
		dao.insert(vo);
	}
	
	public static void getListTest() {
		OrderListDAO dao = new OrderListDAO();
		List<OrderListVO> list = dao.getList();
		for(OrderListVO vo : list) {
			System.out.println(vo);
		}
	}
}
