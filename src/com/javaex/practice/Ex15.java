package com.javaex.practice;

public class Ex15 {

	public static void main(String[] args) { 
		//
		int c=(int) (Math.random() / 6) + 1;
		System.out.println("출력되는 내용을 입력하세요");
		System.out.println("기호:"+ c);
		System.out.println("숫자1: "+"");
		System.out.println("숫자2: "+"");
		System.out.println("결과는: "+"");
		
		switch(c) {
		case '+':
			System.out.println("a");
		case '-':
			System.out.println(1);
		case '*':
			System.out.println(90);
		case '/':
			System.out.println(30);
		
		}
	}
}
/*
출력되는 내용을 입력하세요
기호:1
숫자1: 
숫자2: 
결과는: 
*/