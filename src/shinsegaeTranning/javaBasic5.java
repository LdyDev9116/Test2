package shinsegaeTranning;

import java.util.Scanner;

public class javaBasic5 {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i++) {  //5줄 생성
            for (int j = 0; j < i; j++) { //j가 0보다 크나거나 같다면
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
