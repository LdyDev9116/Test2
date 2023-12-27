package Jungol5;

import java.util.Scanner;

public class Test5_1 {
    public static void main(String[] args) {
        //한 개의 정수를 입력 받은 후,
        // 입력받은 수를 출력하고
        // 그 수가 10보다 크면 다음 줄에 “10보다 큰 수를 입력하셨습니다.”라는 메시지를 출력하는 프로그램을 작성하시오
        //...

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println(num1);
        if (num1 > 10 ){
            System.out.println("10보다 큰 수를 입력하셨습니다.");
        }


    }

}
