package com.juanprimeiroprojeto.curso.entites.enums;

public enum OrderStatus {
	
	WATTING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}

	public int getcode() {
		return code;
	}
	
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getcode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("invalid OrderStatus code ");
	}
}
