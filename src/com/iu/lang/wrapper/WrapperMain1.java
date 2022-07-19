package com.iu.lang.wrapper;

import com.iu.lang.wrapper.ex1.WrapperEx1;

public class WrapperMain1 {
	public static void main(String[] args) {
	
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String num = "10";
		
		Integer integer = new Integer(num);
		int n = integer.intValue();
		
		n=50;
		integer = n;//auto-boxing
		n = integer;//auto-unboxing
		
		System.out.println(n+2);
		
		long l = 10L;
		Long ll = l;
		
		integer = (int)l;
//		integer = (int)ll;
		
		String num1 = "50";
		String num2 = "3.12";
		String num3 = "60";
		
		int n1 = Integer.parseInt(num1);
		Double n2 = Double.parseDouble(num2);
		long n3 = Long.parseLong(num3);
		
		System.out.println(n1*2);
		System.out.println(n2*2);
		System.out.println(n3*3);
		
		
		WrapperEx1 ex = new WrapperEx1();
		ex.ex1();
		
	}
	

}
