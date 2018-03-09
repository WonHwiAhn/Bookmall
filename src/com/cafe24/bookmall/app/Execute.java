package com.cafe24.bookmall.app;

import com.cafe24.bookmall.dao.test.BookDAOTest;
import com.cafe24.bookmall.dao.test.CartDAOTest;
import com.cafe24.bookmall.dao.test.CategoryDAOTest;
import com.cafe24.bookmall.dao.test.MemberDAOTest;
import com.cafe24.bookmall.dao.test.OrderDAOTest;
import com.cafe24.bookmall.dao.test.OrderListDAOTest;

public class Execute {
	public static void main(String[] args) {
		CategoryDAOTest.insertTest();
		CategoryDAOTest.getListTest();
		
		BookDAOTest.insertTest();
		BookDAOTest.getListTest();
		
		MemberDAOTest.insertTest();
		MemberDAOTest.getListTest();
		
		OrderDAOTest.insertTest();
		OrderDAOTest.getListTest();
		
		CartDAOTest.insertTest();
		CartDAOTest.getListTest();
		
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
