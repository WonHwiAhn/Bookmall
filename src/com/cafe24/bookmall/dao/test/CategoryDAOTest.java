package com.cafe24.bookmall.dao.test;

import java.util.List;

import com.cafe24.bookmall.dao.CategoryDAO;
import com.cafe24.bookmall.vo.CategoryVO;

public class CategoryDAOTest {
	public static void main(String[] args) {
		insertTest();
		//getListTest();
	}
	
	public static void insertTest() {
		CategoryDAO dao = new CategoryDAO();
		CategoryVO vo = new CategoryVO();
		
		vo.setName("코믹");
		dao.insert(vo);
		
		vo.setName("공포");
		dao.insert(vo);
		
		vo.setName("로맨스");
		dao.insert(vo);
	}
	
	public static void getListTest() {
		CategoryDAO dao = new CategoryDAO();
		List<CategoryVO> list = dao.getList();
		for(CategoryVO vo : list) {
			System.out.println(vo);
		}
	}
}
