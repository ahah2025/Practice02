package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//큰 수: 작은수: 는 안 보임
		Scanner sc = new Scanner (System.in);
				
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int num = sc.nextInt();
		System.out.print("숫자2: ");
		int n01 = sc.nextInt();
				
		//그룹을 분류한다.
		if(num <= n01) { 
		System.out.println("큰 수"); 
		}else { 
		System.out.println("작은수");
		}
		System.out.println("입니다.");
							
		sc.close();;	
	}
}
/*
숫자2개를 입력해주세요
숫자1: 15
숫자2: 123
=======================
숫자1: 358
숫자2: 11
=======================
숫자1: 100
숫자2: 100

*/