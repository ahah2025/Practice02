//#switch-case

//월을 입력받아 해당월의 일수를 출력하는 프로그램을 작성하세요
package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		//강사님 문제풀이
		int min; //작은수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int num01 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num02 = sc.nextInt();
		
		System.out.print("숫자3: ");
		int num03 = sc.nextInt();
		
		min = num01;
		if(min > num02) {
			min = num02;
		}   //if문 다음에 아래의 if문이 실행됩니다.(if~else문 X  비교해볼것)
		if(min > num03) {
			min = num03;
		}
		 
		System.out.println("가장 작은수는 " +  min + " 입니다." );
	
		sc.close();

	}

}
		/* 아름 문제풀이
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int no1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int no2 = sc.nextInt();
		
		System.out.print("숫자3: ");
		int no3 = sc.nextInt();
		
		System.out.println("가장 작은수는 "+ ((no1+no2+no3)/3-6) +" 입니다.");

결 과 값
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