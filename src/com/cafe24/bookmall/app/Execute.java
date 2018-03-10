package com.cafe24.bookmall.app;

import com.cafe24.bookmall.dao.test.BookDAOTest;
import com.cafe24.bookmall.dao.test.CartDAOTest;
import com.cafe24.bookmall.dao.test.CategoryDAOTest;
import com.cafe24.bookmall.dao.test.MemberDAOTest;
import com.cafe24.bookmall.dao.test.OrderDAOTest;
import com.cafe24.bookmall.dao.test.OrderListDAOTest;

public class Execute {
	public static void main(String[] args) {
		System.out.println("==========카테고리 리스트==========");
		CategoryDAOTest.insertTest();
		CategoryDAOTest.getListTest();
		
		System.out.println("==========상품 리스트==========");
		BookDAOTest.insertTest();
		BookDAOTest.getListTest();
		
		System.out.println("==========회원 리스트==========");
		MemberDAOTest.insertTest();
		MemberDAOTest.getListTest();
		
		System.out.println("==========주문 리스트==========");
		OrderDAOTest.insertTest();
		OrderDAOTest.getListTest();
		
		System.out.println("==========카트 리스트==========");
		CartDAOTest.insertTest();
		CartDAOTest.getListTest();
		
		System.out.println("==========주문 도서 리스트==========");
		OrderListDAOTest.insertTest();
		OrderListDAOTest.getListTest();
		
		/*DAOIter[] dao = {
						 new MemberDAO(),
						 new CategoryDAO(),
						 new BookDAO(),
						 new CartDAO(),
						 new OrderDAO(),
						 //new OrderListDAO()
						};
		
		VOIter[] vo = {
						new MemberVO(),
						new CategoryVO(),
						new BookVO(),
						new CartVO(),
						new OrderVO()
					  };*/
		
		//dao[0].in
	}
}
