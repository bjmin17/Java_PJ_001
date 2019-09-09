package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.model.GradeVO;

public class ScoreServiceImpV2 extends ScoreServiceImp{


	List<GradeVO> gradeList;
	
	
	public void search() {
		gradeList = new ArrayList<GradeVO>();
				
	
		int Size = gradeList.size();
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 조회 (000#) >> ");
		String strSearch = scan.nextLine();
		for(int i = 0 ; i < Size ; i++) {
			
			if(gradeList.get(i).getStrName().equalsIgnoreCase(strSearch)) {
				System.out.print(gradeList.get(i).getStrNum() + "\t");
				System.out.print(gradeList.get(i).getStrName() + "\t");
				System.out.print(scoreList.get(i).getIntKor() + "\t");
				System.out.print(scoreList.get(i).getIntEng() + "\t");
				System.out.print(scoreList.get(i).getIntMath() + "\t");
				System.out.print(scoreList.get(i).getIntTotal() + "\t");
				System.out.printf("%.2f\t",scoreList.get(i).getfAgv());
				System.out.print(scoreList.get(i).getIntRank() + "\n");
			} else {
				System.out.println("없음");
			}
		}
	}
}
