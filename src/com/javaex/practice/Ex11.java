package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		//나머지 값이 안 보여짐
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int f = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int s = sc.nextInt();
		System.out.println("몫: "+ s/f);
		int a = sc.nextInt(); 
		System.out.println("나머지: ");
		int y = sc.nextInt();
		
		sc.close();
	}

}
/*
첫번째 숫자: 34
두번째 숫자: 5
몫: 0 
---------------------
첫번째 숫자: 3
두번째 숫자: 37
몫: 12
--------------------
첫번째 숫자: 17
두번째 숫자: 17
몫: 1
*/