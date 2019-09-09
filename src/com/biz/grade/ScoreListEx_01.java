package com.biz.grade;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImp;

public class ScoreListEx_01 {

	public static void main(String[] args) {
		
		ScoreService ss = new ScoreServiceImp();
		
		ss.input(5);
		ss.makeStrNum();
		ss.total();
		ss.scoreList();
		
		ss.sort();
		ss.scoreList();
	
	}
}
