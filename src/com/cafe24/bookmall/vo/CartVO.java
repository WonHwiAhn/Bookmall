package com.cafe24.bookmall.vo;

public class CartVO{
	private int count;
	private Long bookNo;
	private Long customerNo;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	public Long getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(Long customerNo) {
		this.customerNo = customerNo;
	}
	
	@Override
	public String toString() {
		return "CartDAO [count=" + count + ", bookNo=" + bookNo + ", customerNo=" + customerNo + "]";
	}
}
