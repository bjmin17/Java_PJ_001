package com.biz.grade;

import com.biz.grade.service.GradeService;
import com.biz.grade.service.GradeServiceImp;
import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImpV2;

public class ScoreListEx_02 {

	public static void main(String[] args) {
		
		
		ScoreService ss = new ScoreServiceImpV2();
		GradeService gs = new GradeServiceImp();
		
		
		
		ss.search();
	}
}
