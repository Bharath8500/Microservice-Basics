package com.JDBC.example.jdbcdemo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
@AllArgsConstructor
public class Book {
	private String bCode;
	private String bName;
	private float bPrice;
	private int bQty;

	public Book() {
		super();
	}

	public Book(String bCode, String bName, float bPrice, int bQty) {
		super();
		this.bCode = bCode;
		this.bName = bName;
		this.bPrice = bPrice;
		this.bQty = bQty;
	}

	public String getbCode() {
		return bCode;
	}

	public void setbCode(String bCode) {
		this.bCode = bCode;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public float getbPrice() {
		return bPrice;
	}

	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}

	public int getbQty() {
		return bQty;
	}

	public void setbQty(int bQty) {
		this.bQty = bQty;
	}

	@Override
	public String toString() {
		return "Book [bCode=" + bCode + ", bName=" + bName + ", bPrice=" + bPrice + ", bQty=" + bQty + "]";
	}

	

}
