package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		
		int age = sc.nextInt();
		
		if(age>19  &&  age>=65) { //동시만족해야 되서 깐깐한 '&&'논리 연산자를 써야 함
			System.out.println("2번 그룹");
		}else if(age>=19){  
				System.out.println("1번 그룹");	
		}else if(age<=15){  
			System.out.println("2번 그룹");
		sc.close();
		}
	}

}
