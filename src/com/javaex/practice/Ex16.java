package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		//함수의 함수값을 계산하기에 어려움 있다
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");  //(f(x)=x*x*x-9+2,x<=0 )
		int a = sc.nextInt();
			
		
		System.out.println("계산결과는 "+"입니다.");
		int result = sc.nextInt();
		
		sc.close();

	}

}
