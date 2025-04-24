package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//큰 수인지 작은수인지는 확인 할 수 있으나 큰수가 몇인지, 작은수가 얼마인지 확인 불가
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
								
		sc.close();;	
	}
}
/*
숫자2개를 입력해주세요
숫자1: 15
숫자2: 123
큰 수
=======================
숫자1: 358
숫자2: 11
작은수
=======================
숫자1: 100
숫자2: 100
큰 수
*/