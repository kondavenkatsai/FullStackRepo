package com.nit.payment;

public class PaymentOperations {

	public String addPaymentOf() {
		return "payment added";
	}
	public static void main(String[] args) {
		PaymentOperations ops=new PaymentOperations();
		String payment=ops.addPaymentOf();
		System.out.println(payment);

	}

}
