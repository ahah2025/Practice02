package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int n1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int n2 = sc.nextInt();
		
		System.out.print("는(은)"+ (n1-n2)+" 의 약수입니다.");
		int b = sc.nextInt();
		
		sc.close();
	}

}
/*
첫번째 숫자: 35
두번째 숫자: 5
는(은)30 의 약수입니다.
===================
첫번째 숫자: 35
두번째 숫자: 8
는(은)27 의 약수입니다.
===================
첫번째 숫자: 7
두번째 숫자: 49
는(은)-42 의 약수입니다.
===================
첫번째 숫자: 8
두번째 숫자: 49
는(은)-41 의 약수입니다.
*/