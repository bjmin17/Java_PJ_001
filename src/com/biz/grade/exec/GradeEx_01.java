package com.biz.grade.exec;

import com.biz.grade.service.GradeService;
import com.biz.grade.service.GradeServiceImp;
import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImp;

public class GradeEx_01 {

	public static void main(String[] args) {
		
		GradeService gs = new GradeServiceImp();
		
		gs.input(3);
		gs.makeStrNum();
		gs.view();
		
		
	}
}
