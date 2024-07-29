package com.lucifer.payment;



public class MakePayment implements PaymentInterface{

	
	@Override
	public void doPayment(int amt) {
		
		System.out.println(amt+" debited");
	
		System.out.println(amt+" credited");
		
	}

}
