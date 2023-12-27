package control;

import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        // 출력단축키 : so + tab  = sysout
        // 알트 + 엔터  fori
        // 실행단축키 : 시프트 + F10
        // 복수 : 컨트롤 + D
        // 정렬 : 컨트롤 + 시프트 + L

//        //구구단
//        for (int m = 2; m <= 9; m++) {
//            System.out.printf("====%d 단 ======= \n" , m);
//            for (int n = 1; n <= 9; n++) {
//                System.out.printf("%d x %d = %d\n", m,n , m*n );
//            }
//            System.out.println();
//        }

        //1. 반복제어문 1 연습문제1
        for (char i = 'A';  i <='Z'; i++) {
//            System.out.println("영문 :" + i);
            System.out.printf("%c" , i);

        }

//        //2. 반복제어문1 자가진단1
//        int i = 1;
//        while (i <= 15){
//            System.out.printf("%d " , i);
//            i++;
//        }

////        3. 반복제어문1 연습문제2
//        int num = 1;
//        int sum = 0;
//
//        while (num <= 10){
//
//            sum = sum + num;
//            num++;
//
//        }
//        System.out.printf("1부터 10까지의 합 = %d  " , sum );
//        System.out.println();
//        System.out.printf("while문이 끝난 후의 num의 값 = %d " , num );

//        int a = 10;
//        int b = a ;
//        System.out.println(b);

//         4. 반복제어문1 자가진단2
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int i = 0;
//        int sum = 0;
//
//        if( 0 < num && num <= 100) {
//            while( i <= num ){
////                System.out.println("sum 전의값:" + sum); //합계 total
////                System.out.println("i 전의값:" + i); //1~10
//                sum += i;
//                i++;
//            }
//            System.out.println(sum);
//        }

////        4. 반복제어문1 연습문제3 내꺼 틀린거
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            int score = sc.nextInt();
//            System.out.print("점수를 입력하세요.");
//
//            if (score >= 80 && score <= 100) { // 95
//                System.out.println("축하합니다. 합격입니다."); // 80점이상
//            }if (score <= 80) {
//                System.out.println("죄송합니다. 불합격입니다."); // 80점이상
//            }if( 0 > score || score > 100 ) {
//                System.out.println("시스템종료 입니다.\n");// 이상이외의 것
//
//                break;
//            }
//        }

////          5. 반복제어문1 - 자가진단3
//            Scanner sc = new Scanner(System.in);
//            while (true)
//            {
//                System.out.print("number? ");
//                int i = sc.nextInt();
//                if (0 == i  ) {
//                    System.exit(0);
//                }
//                if(i > 0 ){
//                    System.out.println("positive integer");
//                }
//                if (i < 0) {
//                    System.out.println("negative number");
//                }
//            }

//            6. 반복제어문1 연습문제4
              Scanner sc = new Scanner(System.in);
              while (true)


            {
                System.out.println("입력된 자료의 개수");
                System.out.println("입력된 자료의 합계");
                System.out.println("입력된 자료의 평균");

            }

    }
}





