package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.grade.model.GradeVO;
import com.biz.grade.model.ScoreVO;

public class GradeServiceImp implements GradeService {

	Scanner scan;
	Random rnd;
	protected List<GradeVO> gradeList;
	
//	선생님이 만든것
//	//배열을 생성할 때 개수를 지정하지 않고 초기값을 직접대입하여 배열을 만드는 방법
//	String[] stdList = new String[] {
//			"홍길동 : 서울특별시 : 010-1111-1111 : 컴공과 : 3",
//			"이몽룡 : 익산시 : 010-2222-2222 : 전기공학과 : 2",
//			"성춘향 : 남원시 : 010-3333-3333 : 경영학과 : 1"
//	};
//	
//	// 요소가 10개인 nums 배열을 선언하고
//	// 값을 초기화 하는
//	int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
//	
//	public void input() {
//		for(int i = 0 ; i < stdList.length ; i++) {
			// stdList i 번째 문자열을 콜론(:) 구분자로 분해해서 stds 배열에 담아라
//			String[] stds = stdList[i].split(":"); // :을 중심으로 문자를 잘라서 stds라는 배열에 담음
//					//stds[0] : "홍길동", stds[1] : "서울특별시",,,,
//		}
//	}
	
	public GradeServiceImp() {
		scan = new Scanner(System.in);
		rnd = new Random();
		gradeList = new ArrayList<GradeVO>();
		
	}
// 선생님 학번 만드는 방법
//	public void input(int count) {
//		for(int i = 0 ; i < count ; i ++) {
//			String strNum = String.format("%05d", i+1);
//			this.input(strNum);
//		}
//	}
//	public void input() {
//		
//	}
//	@Override
	//학번을 문자열로 받고 1개의 데이터를 입력하는 방법
//	public void input(String strNum) {
//		GradeVO vo = new GradeVO();
//		vo.setStrNum(strNum);
//	}
//		
	@Override
	public void input() {
		GradeVO vo = new GradeVO();
		//String strNum = String.formati("%04d",i+1);
		System.out.println("==================================");
		System.out.print("이름을 입력하세요 >> ");
		String strName= scan.nextLine();
		
		System.out.print("주소를 입력하세요 >> ");
		String strAddr= scan.nextLine();
		
		System.out.print("전화번호를 입력하세요 >> ");
		String strTel= scan.nextLine();
		
		System.out.print("학과를 입력하세요 >> ");
		String strDept = scan.nextLine();
		
		System.out.print("학년을 입력하세요 >> ");
		String strGrade = scan.nextLine();
		int intGrade = Integer.valueOf(strGrade);
		System.out.println("==================================");
		
		GradeVO gVO = new GradeVO();
		gVO.setStrName(strName);
		gVO.setStrAddr(strAddr);
		gVO.setStrTel(strTel);
		gVO.setStrDept(strDept);
		gVO.setIntGrade(intGrade);
		
		gradeList.add(gVO);
		
	}
	
	public void input(int count) {
		for(int i = 0; i < count ; i++) {
			this.input();
		}
	}

	@Override
	public void view() {
		int Size = gradeList.size();
		System.out.println("==========================================================");
		System.out.println("학생명부");
		System.out.println("==========================================================");
		System.out.println("학번\t이름\t전화번호\t주소\t학과\t학년");
		System.out.println("----------------------------------------------------------");
		//for(GradeVO gVO : gradeList) {
		for(int i = 0; i < Size; i++) {
			GradeVO gVO = gradeList.get(i);
			//System.out.printf("%04d\t", ++intCount);
			System.out.print(gVO.getStrNum()+ "\t");
			System.out.print(gVO.getStrName() + "\t");
			System.out.print(gVO.getStrTel() + "\t\t");
			System.out.print(gVO.getStrAddr() + "\t");
			System.out.print(gVO.getStrDept() + "\t");
			System.out.print(gVO.getIntGrade() + "\n");
		}
		System.out.println("==========================================================");
		
	}

	@Override
	public void makeStrNum() {
		
		int Size = gradeList.size();
		for(int i = 0 ; i < Size ; i ++) {
			gradeList.get(i).setStrNum(String.format("%04d", i+1));
		}
		
	}

}
