package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		(1)	if( i=0 ) {….} // 에러 발생
		(2)	if( j<10 ) {…} // 에러 발생
		(3)	switch( 'A' ){….} 에러 발생 안함
		*/		
		
		//(4)	switch( 100 ){…} 기본값만 적용됨
		/*Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch(100) { 
			case 4:  //31일
			case 6:  //31일
			case 9:  //31일
			case 11: //31일
				System.out.println("30일");
				break;
				
			case 2: 
				System.out.println("28일");
				break;  //31일
				
			default:	
				System.out.println("31일");
				break; */
		
		//(5)	switch( "A" ){…} 에러 X
	  /*Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		String month = sc.nextLine();
		
		switch("A") { 
			case "A": 
				System.out.println("31일");
				break;
				
			case "B": 
				System.out.println("28일");
				break;
				
			default: //나머지 else 
				System.out.println("31일 입니다.");	
		} */
		
		/*(6)	if( name == "홍길동" ) 에러 발생
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");		

		String a = sc.nextLine();
		
		if(name == "홍길동") {
			System.out.println(num +"은(는) 3의 배수 입니다.");	
		}else {
			System.out.println(num +"은(는) 3의 배수가 아닙니다.");
		}
		
		
		
		
		sc.close();*/
	}
}	
