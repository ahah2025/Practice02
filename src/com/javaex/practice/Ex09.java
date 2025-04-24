package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[]args) {
		
		int thisYear = 2023, year, age;
				
		Scanner sc= new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		year = sc.nextInt();
		
		//나이 계산
		age = thisYear-year;
		
		if(age<15 || age>=65) { //15세 미만,65세 이상인 경우
			System.out.println(age+"살 무료예방접종 대상자 입니다");
		}else { //위 나이를 제외한 나머지
			System.out.print(age+"살 무료예방접종 대상자가 아닙니다");
		}
		
		sc.close();
	}
	
}
/*
태어난 년도를 입력해 주세요
년도: 2020
3살 무료예방접종 대상자가 아닙니다

년도: 2009
14살 무료예방접종 대상자가 아닙니다

년도: 2008
15살 무료예방접종 대상자가 아닙니다

년도: 2000
23살 무료예방접종 대상자가 아닙니다

년도: 1959
64살 무료예방접종 대상자가 아닙니다

년도: 1958
65살 무료예방접종 대상자가 아닙니다

년도: 1940
83살 무료예방접종 대상자가 아닙니다
*/