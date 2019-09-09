package com.biz.grade.model;

/*
 * 1. 천궁 고등학교 성적처리 프로젝트
 * 2. 프로젝트 수행 문서를 참조하여 프로젝트를 수행
 * 3. 학생명부, 성적표리스트 작성
 * 4. 객체지향 개발 방법 패턴에 따라
 * 		VO클래스, Service 인터페이스, ServiceImp클래스 작성
 * 5. Scanner와 Random 클래스를 활용하여 데이터 입력 및 테스트 수행
 * 6. 입력된 데이터와 출력물 간의 연산 수행 결과가 일치하는지 테스트 수행
 */
public class GradeVO {

	private String strNum;
	private String strName;
	private String strAddr;
	private String strTel;
	private String strDept;
	private int intGrade;
	
	
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrDept() {
		return strDept;
	}
	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}
	public int getIntGrade() {
		return intGrade;
	}
	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}
	


	
	
	
}
