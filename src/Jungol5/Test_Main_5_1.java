package Jungol5;

import java.util.Scanner;

public class Test_Main_5_1 {
    public static void main(String[] args) {
        //
        //

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
