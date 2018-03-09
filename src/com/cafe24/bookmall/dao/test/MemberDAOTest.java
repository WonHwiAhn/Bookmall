package com.cafe24.bookmall.dao.test;

import java.util.List;

import com.cafe24.bookmall.dao.MemberDAO;
import com.cafe24.bookmall.vo.MemberVO;
public class MemberDAOTest {
	public static void main(String[] args) {
		//insertTest();
		getListTest();
	}
	
	public static void insertTest() {
		MemberDAO dao = new MemberDAO();
		MemberVO vo = new MemberVO();
		
		vo.setName("안원휘");
		vo.setPhone("010-7118-8650");
		vo.setEmail("myroom9@naver.com");
		vo.setPassword("123456");
		dao.insert(vo);
		
		vo.setName("아이유");
		vo.setPhone("010-7777-8650");
		vo.setEmail("myroom1@naver.com");
		vo.setPassword("123456");
		dao.insert(vo);
	}
	
	public static void getListTest() {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.getList();
		for(MemberVO vo : list) {
			System.out.println(vo);
		}
	}
}
