package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 저체중, 표준, 과체중 입니다는 안보임 ㅠㅠ

		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		int key = sc.nextInt();
		System.out.print("몸무게: ");
		int all = sc.nextInt();
		System.out.println("표준체중: "+ (key-100)*0.9);
		
		System.out.println("");
		
		sc.close();
	}

}
/*키와 몸무게를 입력해주세요.
키: 180
몸무게: 60
표준체중: 72.0
*/