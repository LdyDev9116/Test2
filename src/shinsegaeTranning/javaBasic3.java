package shinsegaeTranning;

import java.util.Scanner;

public class javaBasic3 {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;

        while (true) {
           dice1 = (int)(Math.random()*6)+1;
           dice2 = (int)(Math.random()*6)+1;
           System.out.print(dice1 + " ");
           System.out.println(dice2);

           if (dice1 + dice2 == 5){
               System.out.print("dice1: " + dice1 + " ");
               System.out.print("dice2: " + dice2);
               break;
           }

        }


    }

}
