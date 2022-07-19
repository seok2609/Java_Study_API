package com.iu.lang.string.ex1;

public class SplitMain {
	public static void main(String[] args) {
		
		WorkerService ws = new WorkerService();
		WorkerView wv = new WorkerView();
		WorkerDTO [] worekrDTOs = ws.init();
		
		wv.view(worekrDTOs);
		
		int num = 10;
		
		String str = String.valueOf(num);
		System.out.println(str);
		
	}

}
