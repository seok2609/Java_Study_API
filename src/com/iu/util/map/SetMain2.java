package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {
	public static void main(String[] args) {
		//Random
		//1 - 45 중복되지 않는 숫자 6개를 Set에 담아서 출력
		Random random = new Random();
		HashSet<Integer> hashSet = new HashSet<>();
		
		while(hashSet.size() < 6) {
			int num = random.nextInt(45)+1;
			hashSet.add(num);
//			System.out.println(num);
		}
	
		Iterator<Integer> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(hashSet);
	}

}
