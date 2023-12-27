package Jungol3;

import java.util.Scanner;

public class Test_Main_3_1 {
    public static void main(String[] args) {
        //국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 총점과 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림 한다.)
        //합계 /평균  각각입력  무한입력 x

        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int computer = sc.nextInt();


        int sum = kor+ eng + math + computer;
        int avg = sum /4 ;
        System.out.println("sum " + sum);
        System.out.println("avg " + avg);


    }

}
