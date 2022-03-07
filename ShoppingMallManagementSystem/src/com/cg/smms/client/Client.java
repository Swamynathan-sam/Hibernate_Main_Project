package com.cg.smms.client;

import com.cg.smms.service.ICustomerService;
import com.cg.smms.service.ICustomerServiceImpl;

public class Client {

	public static void main(String[] args) {
		ICustomerService customerservice=new ICustomerServiceImpl();
		customerservice.cancelOrder(2);
		

	}

}
