package Jungol3;

import java.util.Scanner;

public class Test_Main_3_3 {
    public static void main(String[] args) {
        //직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후 가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.
        //
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        num1 += 5;
        num2 *= 2;

        System.out.println("width = " + num1);
        System.out.println("length = "+ num2);
        System.out.println("area = " + num1* num2);

    }

}
