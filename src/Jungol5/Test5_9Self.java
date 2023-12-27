package Jungol5;

import java.util.Scanner;

public class Test5_9Self {
    public static void main(String[] args) {
        //3개의 정수를 입력받아 조건연산자를 이용하여
        // 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.

        /*
        //해결안1
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int min =( num1 < num2 ) ? num1: num2;
        min= ( min < num3) ? min: num3;
        System.out.println(min);
        // 조건: num2가크면 /  참이면 num1  아니면 num2
         // 18  <  -5    -- -5
        // -5  < 10  참이면 -5  거짓이면 10
        */

        //18 -5 10
//        Scanner sc = new Scanner(System.in);
//        int[] num = new int[3];
//
//
//        for(int i=0; i<num.length; i++){ //배열만클 입력
//            num[i] = sc.nextInt();
//        }
//        int min = num[0]; // 배열 갯수만큼 늘어 있는 배열 index 0초기화
//
//        for(int i=0; i<num.length; i++){// 출력
//            if(min > num[i]){ // 0 > num 0보다작으면
//                min = num[i]; // min 다시 할당
//            }
//        }
//
//        System.out.println(min);// 출력
//        sc.close();

          Scanner sc = new Scanner(System.in);
          int [] num1 = new int [3];

        for (int i = 0; i < num1.length ; i++) {
            num1[i] = sc.nextInt();
        }









    }
}
