package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) { //결과 값이 전혀 다름
		int a = 10;
		Scanner sc = new Scanner(System.in);

		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: "+ a);
		int var = sc.nextInt();
		
		System.out.print("숫자1: ");
		int num = sc.nextInt();
		
		System.out.println("숫자2: ");
		int no = sc.nextInt();
		
		System.out.println("결과는: ");
		int result = sc.nextInt();
		
		sc.close();
	}
}
/*
출력되는 내용을 입력하세요
기호: 10
*/