package com.cafe24.bookmall.vo;

public class OrderListVO {
	private Long orderCount;
	private int orderPrice;
	private Long orderNo;
	private Long bookNo;
	public Long getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(Long orderCount) {
		this.orderCount = orderCount;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	
	@Override
	public String toString() {
		return "OrderbookDAO [orderCount=" + orderCount + ", orderPrice=" + orderPrice + ", orderNo=" + orderNo
				+ ", bookNo=" + bookNo + "]";
	}
}
