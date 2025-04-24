package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 아름 문제풀이
		 다음중 에러가 발생하는 문장은
		(1)	if( i=0 ) {….} ==> i==0으로 기재
		(2)	if( j<10 ) {…} // 
		(3)	switch( 'A' ){….} 
		(4)	switch( 100 ){…} ==> 변수는 숫자 불가능
		(5)	switch( "A" ){…} 
		(6)	if( name == "홍길동" )  ==>문자열 비교에는 부적합, 문자열 비교는 equals() 써야 함 
		
		*/
		
		String name = "홍길동";
		
		if(name.equals("홍길동")) {
			
		}
						
		sc.close();
		/*
		 강사님 문제풀이 
		(1) if( i=0 ) {….}
 			--> if( i==0 ) {...}
 		
 		(2)	if( j<10 ) {…}
 			--> 정상
 			
 		(3)	switch( 'A' ){….}
 			--> 정상
 		
 		(4)	switch( 100 ){…}
 			--> 정상
 		
 		(5)	switch( "A" ){…}
 			--> 정상
 		
 		(6)	if( name == "홍길동" )
 			--> name.equals("홍길동");
		 */
	}
}	
