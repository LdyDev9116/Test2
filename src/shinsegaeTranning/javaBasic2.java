package shinsegaeTranning;

import java.util.Scanner;

public class javaBasic2 {
    public static void main(String[] args) {
        int Totalsum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
//                System.out.print(i + " ");
                Totalsum += i;
            }
        }
        System.out.println(":"+Totalsum);
        }
}
