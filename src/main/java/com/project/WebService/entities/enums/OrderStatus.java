package com.project.WebService.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(10),
	PAID(20),
	SHIPPED(30),
	DELIVERED(40),
	CANCELED(99);

	private int code;
	
	private OrderStatus (int code) {
		this.code = code;
		
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value: OrderStatus.values()){
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Order Status code");
	}
}
