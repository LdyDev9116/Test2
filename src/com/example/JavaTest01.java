package com.example;

import java.sql.SQLOutput;

//alt+insert key : 새로운 클래스 생성
class Book{
    //출판사 : company
    //도서명 : bookTitle
    //가격: price
    String company;
    String bookTitle;
    int price;
}
class Member{
    String name;
    String memberNo;
}



public class JavaTest01 {
    public static void main(String v[]) {
        //byte, short , int ,long , float, double, boolean, char
        //1. 정수형 데이터 타입(int) 변수, a,b,c 를 선언하시오
              int a, b, c;
        //2. 정수형 변수, a에 20, b에 30을 할당한 후 변수c에 a와 b의 곱한 값을 할당 하세요
             a = 20;
             b = 30;
             c = a * b ;
        //3. 모니터에 변수 a b c의 값을 출력하세요(출력양식: a = 20  b=30  c=600)
             System.out.println("a = " + a + " b = " + b + "c = " + c );
        //4. 실수형 데이터타입 float 변수 f를 선언하세요
              double f;
        //5. 변수 f에 34.5 값을 할당하세요
              f = 35.5f;
        //6. 변수 f의 값을 출력하세요
        System.out.println("f = " + f);
        //7.  문자 데이터 타입 d 변수를 선언하고 문자 'A'를 할당하고 출력하세요
              char d = 65 + 1;
              System.out.println(d);
        //8. boolean 데이터타입 변수 e를 선언하고  true값을 할당 후 출력하세요
              boolean e = true;
        System.out.println(e);

        Book book;
        book = new Book();

        Member m1 = new Member();
        m1.name ="서유미";
        m1.memberNo = "1234NO";
        System.out.println("name : " + m1.name);
        System.out.println("memberNo : " + m1.memberNo);

        Member m2 = new Member();
        m2.name ="유미진";
        m2.memberNo = "4234NO";
        System.out.println("name : " + m2.name);
        System.out.println("memberNo : " + m2.memberNo);

        Member m3 = new Member();
        m3.name ="김소영";
        m3.memberNo = "2234NO";
        System.out.println("name : " + m3.name);
        System.out.println("memberNo : " + m3.memberNo);

         int sum = 0;
         sum = sum + 1;
        System.out.println(sum);
         sum = sum + 2;
        System.out.println(sum);
         sum += sum;
        System.out.println(sum);

        int x = 10;
        int y = 20;
        int temp;
        System.out.println(x +" " + " " + y);

        temp = x;
        x = y;
        y = temp;
        System.out.println(x +" " + " " + y);


    }

}
