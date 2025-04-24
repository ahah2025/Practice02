package com.javaex.practice;

public class Ex02 {

	public static void main(String[ ]args) { //char,byte,short, int,String
		//(2)	char 
	/*	char grade = 'a';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다."); 
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;	
		default:
			System.out.println("손님입니다.");
		} 
		*/
	//	(3) byte 
		byte grade = 'k'; //일반 회원입니다.
		
		switch(grade) {
		case 'H':
		case 'h':
			System.out.println("우수 회원입니다."); 
			break;
		case 'K':
		case 'k':
			System.out.println("일반 회원입니다.");
			break;	
		default:
			System.out.println("손님입니다.");
		}
		
		
	/*	(4) short
	    short grade = 'h';
		
		switch(grade) {
		case 'H':
		case 'h':
			System.out.println("우수 회원입니다."); 
			break;
		case 'K':
		case 'k':
			System.out.println("일반 회원입니다.");
			break;	
		default:
			System.out.println("손님입니다.");
		}
		
		// (5) int
		int time = (int) (Math.random() * 4) + 9;
		System.out.println("[현재시간: " + time + " 시]") ;
		
		switch(time) { //break 문이 없는 case
		case 8:
			System.out.println("출근합니다.");
			
		case 9:
			System.out.println("회의를 합니다.");
			
		case 10:
			System.out.println("업무를 봅니다.");
			
		default:
			System.out.println("외근을 나갑니다.");
		} */
		
		//(9)	String
		/*	String position = "과장";
			
			switch(position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원"); //500만원
			 	break;
			default:
				System.out.println("300만원");
			}
			*/
		/////////////////////////////////////////////////////
		/*
		 강사님 문제풀이 답
		 
		 다음중 switch 문에서 조건식에 넣을 수 있는 데이터 타입은?
 			(1)	boolean    	X
 			(2)	char       	O
 			(3)	byte   		O
 			(4)	short		O
 			(5)	int			O
 			(6)	long 		X
 			(7)	float		X
 			(8)	double		X
 			(9)	String		O
		 */
		 
	}
}
