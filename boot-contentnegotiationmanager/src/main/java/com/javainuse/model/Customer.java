package com.javainuse.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private String cusId;
	private String name;
	private String custInfo;

	public Customer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustInfo() {
		return custInfo;
	}

	public void setCustInfo(String custInfo) {
		this.custInfo = custInfo;
	}


	public String getCusId() {
		return cusId;
	}

	public void setcusId(String cusId) {
		this.cusId = cusId;
	}

}