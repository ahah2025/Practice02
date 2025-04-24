//#switch-case
package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		//강사님 문제풀이
		int quotient; //몫
		int remainder; //나머지
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();
		
		if(num01>num02) { // num1이 num2보다 클때
			quotient = num01 / num02;
			remainder = num01 % num02;
			
		}else { //num2가 num1보다 크거나 같을때
			quotient = num02 / num01;
			remainder = num02 % num01;
			
		}

		System.out.println("몫: " + quotient );
		System.out.println("나머지: " + remainder );
		

		sc.close();

		
		/*아름 문제풀이
		//나머지 값이 안 보여짐
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int f = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int s = sc.nextInt();
		System.out.println("몫: "+ s/f);
		int a = sc.nextInt(); 
		System.out.println("나머지: ");
		int y = sc.nextInt();
		
		sc.close();
		*/
	}

}
