package com.example;

import java.util.Scanner;

public class ScannerEx {

    //final  : class(상속금지), method(재정의 금지) , variable(상수) 앞에 붙을 수 있는 키워드
    static final double PI = 3.14;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("상품가격을 입력해주세요!\n");
        int produrctPrice = in.nextInt();
        System.out.printf("상품의 가격:%d원\n", produrctPrice);
        System.out.printf("상품의 가격:%6d원\n", produrctPrice);
        System.out.printf("상품의 가격:%-6d원\n", produrctPrice);
        System.out.printf("상품의 가격:%06d원", produrctPrice);
        System.out.println("반지름 입력: \ns");
        int r = in.nextInt();
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",r,r*r*PI);
        System.out.printf("%10d|%-10s|%10s", 1,"홍길동","도적");

        // 1. Scanner클래스를 이용하여  정수형 변수 a, b에 값을 입력받고
        // 두 변수의 결과값을 result 변수에 저장한 후 출력하는 코드 작성 (*주의점: Scanner클래스 입력값 형변환)
        // 입력 :  "a의 값 입력 : "
        //        "b의 값 입력 : "
        // 출력:   "a+b = " 결과값

        System.out.println("a의 값 입력해주세요!");
        String tempX = in.next();
        int a = Integer.parseInt(tempX);

        System.out.println("b의 값 입력해주세요!");
        String tempB = in.nextLine();
        int b = Integer.parseInt(tempB);

        int result = a + b ;
        System.out.printf("a + b = %02d \n",result);
        

        //2. 문자열을 한 줄씩 입력받아 계속 출력하는 프로그램 , 만약에 "q"가 입력되었다면 입력받기 멈춤!
        //for, while 사용
        
        while(true){
            System.out.println("원하는 문자열을 입력하세요!");
            String data = in.nextLine();           
            //종료 조건 제시 
            if(data.equals("q")) {
                break;
            }
            System.out.println("출력문자열 :" + data);

            
            
        }
        System.out.println("프로그램 종료");
         
        
        
        


    }
}
