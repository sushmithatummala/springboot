package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Customer;

@RestController
public class TestController {

	@RequestMapping(value = "/customer", method = RequestMethod.GET,
			produces = { "application/json", "application/xml" })

	
	public Customer firstPage() {

		Customer cus = new Customer();
		cus.setName("cus1");
		cus.setCustInfo("Miami");
		cus.setcusId("1");
	

		return cus;
	}

}