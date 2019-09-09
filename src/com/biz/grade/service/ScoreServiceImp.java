package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.grade.model.ScoreVO;

public class ScoreServiceImp implements ScoreService {

	protected Random rnd;
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
	public void rank() {
		
		for(int i = 0 ; i < scoreList.size() ; i++) {
			for(int j = i + 1; j < scoreList.size(); j++) {
				
				int total_i = scoreList.get(i).getIntTotal();
				int total_j = scoreList.get(j).getIntTotal();
				
				// List.set(index,값)
				// 이미 추가된 list의 index 위치의 값을
				// 변경하고자 할 때
				
				// 역순정렬
				if(total_i < total_j) {
					
					// scoreList의 두 위치 vo를 서로 교환
					ScoreVO _vo = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));// 이미 만들어진 리스트의 i번째에 j번째 위치의 값으로 변경하라
					scoreList.set(j, _vo);
				}
			}
		}
		
		int intRank = 1;
		for(ScoreVO vo : scoreList) {
			vo.setIntRank(intRank++);
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
