package com.nit.service;

public class ArithmeticOperations {

	public int add(int x,int y) {
		
		return x+y;
	}
	public static void main(String[] args) {
		
		ArithmeticOperations ops=new ArithmeticOperations();
		int sum=ops.add(12, 29);
		System.out.println(sum);
		
	}
}
