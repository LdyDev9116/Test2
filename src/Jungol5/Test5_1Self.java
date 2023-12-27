package Jungol5;

import java.util.Scanner;

public class Test5_1Self {
    public static void main(String[] args) {
        //정수를 입력받아
        // 첫 줄에 입력 받은 숫자를 출력하고
        // 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.
        //...

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if (num1 >0 ){
            System.out.println(num1);
        }else{
            System.out.println(num1);
            System.out.println("minus");
        }



    }

}
