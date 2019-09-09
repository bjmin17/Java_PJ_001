package com.biz.grade.exec;

public class StringComp {

	public static void main(String[] args) {
		
		int sort = "A".compareTo("A");
		System.out.println(sort);//0
		System.out.println("A".compareTo("B"));// -1
		System.out.println("B".compareTo("A"));// 1
		
		System.out.println("F".compareTo("A"));// 5
		System.out.println("A".compareTo("F"));// -5
		
		System.out.println("대한".compareTo("우리")); // -5040 ,, 한글은 2Byte라서 차이가 큼
		System.out.println("가".compareTo("나")); // -1176
		System.out.println("ㄱ".compareTo("ㄴ")); // -3
		
	}
}
