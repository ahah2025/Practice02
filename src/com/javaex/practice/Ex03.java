package com.javaex.practice;

public class Ex03 {

	public static void main(String[ ]args) {
		int age = 15;
		
		//age가 0살 초과이고 18살 미만 이면
		if(age < 0 || age < 18) {
			System.out.println("청소년 입니다."); //청소년 입니다. 논리 연산자 사용 '||'
		}
	}
	
}
