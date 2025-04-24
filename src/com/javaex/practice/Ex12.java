package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int no1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int no2 = sc.nextInt();
		
		System.out.print("숫자3: ");
		int no3 = sc.nextInt();
		
		System.out.println("가장 작은수는 "+ ((no1+no2+no3)/3-6) +" 입니다.");
		
		sc.close();

	}

}
/*
숫자1: 9
숫자2: 14
숫자3: 22
가장 작은수는 9 입니다.
======================
숫자1: 57
숫자2: 36
숫자3: 15
가장 작은수는 30 입니다.
=======================
숫자1: 25
숫자2: 3
숫자3: 74
가장 작은수는 28 입니다.

*/