package com.iu.util.list;

import java.util.ArrayList;

public class ListMain2 {
	public static void main(String[] args) {
		//
		ListView listView = new ListView();
		ArrayList<String> ar = new ArrayList<>();
		
		ar.add("first");
//		ar.add(2); //Integer auto boxing
//		ar.add('c'); //Character auto boxing
//		ar.add(2.123); //Double auto boxing
		ar.add(null); 
		
		listView.view(ar);
		
		// get	-> 특정 index의 요소를 반환
		String n1 = (String) ar.get(0);
//		int n2 = (Integer) ar.get(1);
//		char n3 = (Character) ar.get(2);
//		double n4 = (Double) ar.get(3);
		
		System.out.println(ar.get(0) instanceof String);
		
// 		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);
//		System.out.println(n4);
		
	}

}
