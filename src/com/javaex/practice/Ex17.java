/*
0원 이상 1000만원 이하인 경우 tax: 0.09*수익 

⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
  
수익을 입력해 주세요
금액 : 1000
소득세는 90.0 입니다.
====================
금액 : 2000
소득세는 270.0 입니다.
============================
금액 : 7000
소득세는 1440.0 입니다.
============================
금액 : -9000
잘못 입력했습니다
*/
package com.javaex.practice;

public class Ex17 {

	public static void main(String[] args) {
		int revenue;//수익
		int tax;//소득세
				
		Scanner sc = new Scanner(System.in); //Scanner는 점수를 입력받는 것
 		System.out.println("수익을 입력해 주세요");
 		System.out.println("금액: "+ revenue);
 		int point = sc.nextInt(); //점수 입력받는다
 		
 		
 		if( revenue>1000 ) {  // '>'는 revenue 값이 1000만원 이하인 경우
 			System.out.println(tax=0.09*revenue);
 			
 		}else if(revenue>=4000 || revenue<1000) { //tax: 1000*0.09 + 0.18*(수익-1000)
 			System.out.println(tax=1000*0.09 + 0.18*(revenue-1000));
 			
 		}else if(revenue==8000 || revenue<4000) { //tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
 			System.out.println(tax=1000*0.09 + 3000*0.18 + 0.27*(revenue-4000));
 			
 		}else { // tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
 			System.out.println(tax=1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(revenue-8000));
 		}	
 		System.out.println("소득세는 "+ tax + " 입니다.");
 		sc.close();

	}

}


