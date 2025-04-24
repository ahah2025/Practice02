package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//결과 값이 다르게 나옴
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		int n = sc.nextInt();
	
		sc.close();
		System.out.println("A팀입니다.");
	}

}
/*
사번: 11
A팀입니다.   X
------------
사번: 12
A팀입니다.   O
------------
사번: 13
A팀입니다.   X
------------
사번: 99
A팀입니다.   O
------------
사번: -25
A팀입니다.   X
------------
사번: 0
A팀입니다.   O
*/