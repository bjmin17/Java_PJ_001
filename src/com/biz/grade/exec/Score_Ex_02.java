package com.biz.grade.exec;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImp;
import com.biz.grade.service.ScoreServiceImpV2;

public class Score_Ex_02 {

	public static void main(String[] args) {
		
		
		ScoreService ss = new ScoreServiceImp();
		
		ss.input(10);
		ss.makeStrNum();
		ss.total();
		ss.rank();
		ss.scoreList();
	}
//	ScoreService scService = new ScoreServiceImpV2();
//	scService.in
}
