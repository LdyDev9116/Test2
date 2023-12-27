package com.example;
import java.lang.*;
import java.sql.SQLOutput;

public class VariableInitializationExample {
	public static void main(String[] args) {
		//정수형(int)변수 value 선언
		   int value =0;
		
		//연산 결과를 변수 result의 초기값으로 대입
		   value = value;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(value);

		// 문자변수 ch1 과 ch2 에 'A' 'B' 각각 할당 한 후 출력한후
		// ch1과 ch2의 값을 swap 한후 바뀐 값을 출력하세요
		char ch1 = 65;
		char ch2 = 65+1;
		System.out.println("ch1 =" + ch1 + " "+ "ch2 =" + ch2);

		char temp = ch1;
		ch1 = ch2;
		ch2 = temp;
		System.out.println((char)ch1 + " " + (char) ch2);
		System.out.println("이름은\n  \"존 F \t케네디 \"");
         int i = 10;
		System.out.println(i);
		 float f = i;
		System.out.println(f);

		byte byteValue = 65;
//		char charValue = byteValue;

		//강제타입변환 (casting)
		//  작은 허용 범위 타입  = (작은 허용 범위 타입) 큰 허용 범위 타입

		int intValue = 103029770;
		    byteValue =(byte) intValue;
		System.out.println(byteValue);

		//자바는 실행 성능을 향상시키기 위해 컴파일 단계에서 연산을 수행한다.
		byte result = 10 + 20;
		System.out.println(result);

		byte a = 10;
		byte b = 20;
		int result1 = a + b;
		System.out.println(result1);








	}
}