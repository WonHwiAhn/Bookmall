package com.cafe24.bookmall.vo;

public class OrderVO{
	private Long no;
	private int price;
	private String address;
	private Long customerNo;
	private String orderNo;
	private String date;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(Long customerNo) {
		this.customerNo = customerNo;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "OrderDAO [no=" + no + ", price=" + price + ", address=" + address + ", customerNo=" + customerNo
				+ ", orderNo=" + orderNo + ", date=" + date + "]";
	}
}
