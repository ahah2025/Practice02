package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		int year = sc.nextInt();
		
		System.out.print(year%4 - year%3);
		System.out.println( year +" 살 무료예방접종 대상자 입니다");
		
		sc.close();

	}
}

/*
태어난 년도를 입력해 주세요
년도: 2000
-22000 살 무료예방접종 대상자 입니다
*/