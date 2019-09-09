package com.biz.grade.service;

import java.util.Collections;
import java.util.Comparator;

import com.biz.grade.model.ScoreVO;

//01에 있는 변수명을 하나로 쓸 수 있음
public class ScoreServiceImpV2 extends ScoreServiceImp implements ScoreService {
	
	public void rank() {
		// scoreList를 정렬해주는데 
		Collections.sort(scoreList, new Comparator<ScoreVO>() {

			/*
			 * method내의 익명클래스를 사용한 보조연산
			 */
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				// - 연산... 1을 return하면 a>b ,,-1을 return하면 a<b
				// 여기선 1 대신 >0, -1 대신 <0
				return o2.getIntTotal() - o1.getIntTotal();
			}
		});
		int rank = 1;
		for(ScoreVO vo : scoreList) {
			vo.setIntRank(rank++);
			
		}
		
		Collections.sort(scoreList, new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				// 다시 학번순으로 원래대로 돌아감
				//return Integer.valueOf(o1.getStrNum()) - Integer.valueOf(o2.getStrNum());
				/*
				 * 문자열로하겠다면,,,,,,compare코드는 문자열의 ASCII순으로 정렬
				 */
				return o1.getStrNum().compareTo(o2.getStrNum());
			}
		});
		
		
		
	}

	
}
