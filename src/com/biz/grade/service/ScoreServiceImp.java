package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.grade.model.GradeVO;
import com.biz.grade.model.ScoreVO;

public class ScoreServiceImp implements ScoreService {

	Random rnd;
	protected List<ScoreVO> scoreList;
	
	public ScoreServiceImp() {
		rnd = new Random();
		scoreList = new ArrayList<ScoreVO>();
	}
	@Override
	public void input() {

		ScoreVO sVO = new ScoreVO();
		
		int intKor = rnd.nextInt(50) + 51;
		int intEng= rnd.nextInt(50) + 51;
		int intMath= rnd.nextInt(50) + 51;
		
		sVO.setIntKor(intKor);
		sVO.setIntEng(intEng);
		sVO.setIntMath(intMath);
		
		scoreList.add(sVO);
	}
	
	@Override
	public void input(int count) {
		for(int i = 0 ; i < count ; i++) {
			this.input();
		}
	}
	
	@Override
	public void scoreList() {

		System.out.println("==========================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("==========================================================");
		int Size = scoreList.size();
		for(int i = 0 ; i < Size ; i++) {
			System.out.print(scoreList.get(i).getStrNum() + "\t");
			System.out.print(scoreList.get(i).getIntKor() + "\t");
			System.out.print(scoreList.get(i).getIntEng() + "\t");
			System.out.print(scoreList.get(i).getIntMath() + "\t");
			System.out.print(scoreList.get(i).getIntTotal() + "\t");
			System.out.printf("%.2f\t",scoreList.get(i).getfAgv());
			System.out.print(scoreList.get(i).getIntRank() + "\n");
		}
		System.out.println("==========================================================");
	}
	@Override
	public void total() {

		int Size = scoreList.size();
		for(int i = 0 ; i < Size ; i++) {
			
			ScoreVO vo = scoreList.get(i);
			
			int intTotal = vo.getIntKor() + vo.getIntEng() + vo.getIntMath();
			float fAgv = (float) (intTotal / 3.0);
			
			vo.setIntTotal(intTotal);
			vo.setfAgv(fAgv);
		}
		
	}
	@Override
	public void sort() {

		int Size = scoreList.size();
//		for(int i = 0 ; i < Size ; i++) {
//			
//			ScoreVO vo = scoreList.get(i);
//			
//			int intRank = (i + 1);
//			vo.setIntRank(intRank);
//		}
		
		
		
//		for(int i = 0 ; i < scoreVO.length ; i ++) {
//			ScoreVO[] scoreVO = scoreList.get(i)[];
//			for(int j = 0 ; j < scoreVO.length ; j++) {
//				if(gradeVO[i].)
//			}
//		}

				
		for(int i = 0 ; i < Size ; i++) {
			//ScoreVO vo = scoreList.get(i);
			for(int j = 0 ; j < Size ; j++) {
				//ScoreVO vo2 = scoreList.get(j);
				if(scoreList.get(i).getIntTotal() > scoreList.get(j).getIntTotal()) {
					
					int Num1 = scoreList.get(i).getIntTotal();
					int Num2 = scoreList.get(j).getIntTotal();
					
					int _Temp = Num1;
					Num1 = Num2;
					Num2 = _Temp;
					
					scoreList.get(i).setIntTotal(Num1);
					scoreList.get(j).setIntTotal(Num2);
					
					String strNum1 = scoreList.get(i).getStrNum();
					String strNum2 = scoreList.get(j).getStrNum();
					
					String str_Temp = strNum1;
					strNum1 = strNum2;
					strNum2 = str_Temp;
					
					scoreList.get(i).setStrNum(strNum1);
					scoreList.get(j).setStrNum(strNum2);
					
					Num1 = scoreList.get(i).getIntKor();
					Num2 = scoreList.get(j).getIntKor();
					
					_Temp = Num1;
					Num1 = Num2;
					Num2 = _Temp;
					
					scoreList.get(i).setIntKor(Num1);
					scoreList.get(j).setIntKor(Num2);

					Num1 = scoreList.get(i).getIntEng();
					Num2 = scoreList.get(j).getIntEng();
					
					_Temp = Num1;
					Num1 = Num2;
					Num2 = _Temp;
					
					scoreList.get(i).setIntEng(Num1);
					scoreList.get(j).setIntEng(Num2);
					
					Num1 = scoreList.get(i).getIntMath();
					Num2 = scoreList.get(j).getIntMath();
					
					_Temp = Num1;
					Num1 = Num2;
					Num2 = _Temp;
					
					scoreList.get(i).setIntMath(Num1);
					scoreList.get(j).setIntMath(Num2);
					
					float fNum1 = scoreList.get(i).getfAgv();
					float fNum2 = scoreList.get(j).getfAgv();
					
					float f_Temp = fNum1;
					fNum1 = fNum2;
					fNum2 = _Temp;
					
					scoreList.get(i).setfAgv(fNum1);
					scoreList.get(j).setfAgv(fNum2);
				}
			}
		}
		for(int i = 0 ; i < Size ; i++) {
			scoreList.get(i).setIntRank(i+1);
		}
		
	}
	@Override
	public void makeStrNum() {

		int Size = scoreList.size();
		for(int i = 0 ; i < Size ; i++) {
			scoreList.get(i).setStrNum(String.format("%04d", (i+1)));
		}
	}
	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}
}
