package com.example.com;

public class PrintEx {
    public static void main(String[] args) {
        System.out.printf("이름 : %s %s %s \n", "신세계", "INC","입사");
        //System.out.println();
        //정수  %d  실수  %f 문자열 %s
        //출력결과 : 나이는 25 살입니다. printf()사용하여 출력하세요
        System.out.printf("나이는 %1$d 살 입니다.", 25);
        //출력결과 : 이름은 신세계  나이는 25 살 입니다. 출력하세요
        System.out.printf("이름은 %1$s , 나이는 %2$s\n", "신세계" ,25);

         //123
         System.out.printf("%1$d\n", 123);
         //___123
        System.out.printf("%6d\n", 123);
         //123___
        System.out.printf("%-6d\n", 123);
        //000123
        System.out.printf("%06d\n", 123);
        System.out.println("=========정수 printf===========");

        //____123.45
        System.out.printf("%10.2f\n", 123.45);
        //123.45____
        System.out.printf("%-10.2f\n", 123.45);
        //0000123.45
        System.out.printf("%010.2f\n", 123.45);

        //abc
        System.out.printf("%s\n", "abc");
        //___abc
        System.out.printf("%6s\n", "abc");
        //abc___
        System.out.printf("%-6s %% \t \n", "abc");

    }
    
}
