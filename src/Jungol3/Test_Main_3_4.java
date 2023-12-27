package Jungol3;

import java.util.Scanner;

public class Test_Main_3_4 {
    public static void main(String[] args) {
        //두 정수를 입력받아 첫 번째 수는 전치증가연산자를 사용하고 두 번째 수는 후치감소연산자를 사용하여 출력하고 바뀐 값을 다시 출력하는 프로그램을 작성하시오.
        //
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = ++num1;
        int b = num2--;

        //첫번째 전치 증가
        System.out.printf("%d %d\n", a, b);
        System.out.printf("%d %d\n",a ,num2);



    }

}
