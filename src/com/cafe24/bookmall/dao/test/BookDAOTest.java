package com.cafe24.bookmall.dao.test;

import java.util.List;

import com.cafe24.bookmall.dao.BookDAO;
import com.cafe24.bookmall.vo.BookVO;

public class BookDAOTest {
	public static void main(String[] args) {
		insertTest();
		getListTest();
	}
	
	public static void insertTest() {
		BookDAO dao = new BookDAO();
		BookVO vo = new BookVO();
		
		vo.setTitle("원휘의 자서전");
		vo.setPrice(25000);
		vo.setCategoryNo(1L);
		dao.insert(vo);
		
		vo.setTitle("원휘의 자서전1");
		vo.setPrice(35000);
		vo.setCategoryNo(1L);
		dao.insert(vo);
		
		vo.setTitle("원휘의 자서전2");
		vo.setPrice(27500);
		vo.setCategoryNo(1L);
		dao.insert(vo);
	}
	
	public static void getListTest() {
		BookDAO dao = new BookDAO();
		List<BookVO> list = dao.getList();
		for(BookVO vo : list) {
			System.out.println(vo);
		}
	}
}
