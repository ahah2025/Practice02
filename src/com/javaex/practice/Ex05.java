package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		//나이를 입력받는다.
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: "); //15,19,20-->2번 그룹 
		int age = sc.nextInt();  //21,100일 때 결과 --> 1번 그룹
		
		//그룹을 분류한다.
		if(age > 20) { //20살 초과이면
			System.out.println("\"1번그룹\""+"입니다."); 
		}else { //20살 이하이면
			System.out.println("\'2번그룹\'"+"입니다");
		}

		
		sc.close();
	}

}
