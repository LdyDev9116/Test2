package shinsegaeTranning;

import java.util.Scanner;

public class javaBasic6 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { //4줄 생성
            for (int j = 4; j >= 0; j--) { //j가 0보다 크나거나 같다면
                if (i < j) { //참이면 빈칸에 공백 출력
                    System.out.print(" ");
                } else {    //거짓이면 별 출력
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}