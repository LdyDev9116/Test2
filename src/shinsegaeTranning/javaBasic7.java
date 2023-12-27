package shinsegaeTranning;

import java.util.Scanner;

public class javaBasic7 {
    public static void main(String[] args) {


        for (int i = 0; i < 6; i++) { //4줄 생성
            for (int j = 0; j < 3 - i; j++) { //삼각형 별을 출력
                System.out.print(" ");// 공백 생성

            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();


        }



    }

}
