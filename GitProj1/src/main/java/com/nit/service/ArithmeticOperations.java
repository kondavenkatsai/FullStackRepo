package com.nit.service;

public class ArithmeticOperations {

	public int add(int x,int y) {
		
		return x+y;
	}
	public int product(int x, int y) {
		
		return x*y;
	}
	public int sub(int x, int y) {
		
		return x-y;
	}
	public static void main(String[] args) {
		
		ArithmeticOperations ops=new ArithmeticOperations();
		int sum=ops.add(12, 29);
		System.out.println(sum);
		
		int product=ops.product(12, 12);
		System.out.println(product);
		
		int sub=ops.sub(16, 15);
		System.out.println(sub);
		
	}
	
}
