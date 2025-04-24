package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
			//강사님 문제풀이 답	
		//변수
		int num01;
		int num02;
		int max;
		int min;
				
		//숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		num01 = sc.nextInt();
				
		System.out.print("숫자2: ");
		num02 = sc.nextInt();

		//큰수와 작은수를 계산한다.
		if( num01 > num02 ) { // 숫자1 이 숫자2 보다 크면 숫자1을 큰수로 결정한다.
			max = num01;
			min = num02;
		}else {  // 숫자2 가 숫자1 보다 크면 숫자2을 큰수로 결경한다.
			max = num02;
			min = num01;
		}
				
		//결과를 출력한다.
		System.out.println("큰수: " + max + "\t   작은수: " + min + "입니다.");
		sc.close();
		
		/*아름 문제 풀이
		//큰 수인지 작은수인지는 확인 할 수 있음 
		//큰수가 몇인지, 작은수가 얼마인지 확인 불가
		Scanner sc = new Scanner (System.in);
				
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int num = sc.nextInt();
		System.out.print("숫자2: ");
		int n01 = sc.nextInt();
				
		//그룹을 분류한다.
		if(num <= n01) { 
		System.out.println("큰 수"); 
		}else { 
		System.out.println("작은수");
		}
								
		sc.close();;	
		*/
	}
}
