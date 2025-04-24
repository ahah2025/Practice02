package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			int thisyear = sc.nextInt();
			System.out.println("올해 년도는?");
		
			int bornyear = sc.nextInt();
			System.out.println("당신의 출생년도는?");
			
			int age = thisyear - bornyear + 1;
			
			System.out.println(null, "당신의 한국나이는 " + age + "세입니다.");
			
			if (age >= 8 && age <= 13) {
				System.out.println(null, "초딩이군요.");
				
			}
			
			if (age < 10 || age >= 60) {
				JOptionPane.showConfirmDialog(null, "이 기구를 타실 수 없습니다.");
			}
			
			sc.close();
			
			//System.out.println("태어난 년도를 입력해 주세요");
			//System.out.println("년도: ");
				
	}
	
}

/*
태어난 년도를 입력해 주세요
년도: 2000
-22000 살 무료예방접종 대상자 입니다
*/