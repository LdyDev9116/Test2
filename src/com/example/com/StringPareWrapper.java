package com.example.com;

public class StringPareWrapper {

    public static void main(String[] args) {

        String s1 = "10";
        String s2 = "20";
        byte b1 = Byte.parseByte(s1);
        byte b2 = Byte.parseByte(s2);
        byte b3 =(byte) (b1 + b2);

        int result = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(result);

        //자바에서 + 연산자 두가지 기능
        //1. 피연산자가 모두 숫자일 경우 덧셈연산
        //2. 피연산자 중 하나가 문자열일 경우 나머지 피연산자도 문자열로 자동변환된다.
            int value = 3+ 7;
            String str1 = "3" + 7;   //숫자 7은 문자열3으로 인해 문자열로 자동변환
            System.out.println(str1);

            String str2 =  "1" + (2+3);
            System.out.println(str2);

            //1. 문자열 "10"을  정수형 변수 value1 에 저장하고 값 출력
                 s1 = "10";
                 int n1 = Integer.parseInt(s1);
            //2. 문자열 "3.14"를 double 변수 value2에 저장하고 값 출력
                  s2 = "3.14";
                  double d2 = Double.parseDouble(s2);
            //3. 문자열 true를 boolean 변수 value3에 저장하고 값 출력
                  boolean s3 = Boolean.parseBoolean("true");
        System.out.println(s3);
            //4. java17 doc에서 java.lang.String 클래스를 참조하여 변환 메소드를 찾아
            //     숫자 10  실수 3.14를  문자열로 변환하여 출력하세요
                     String str3 = String.valueOf(3.14);

    }
}
