package Jungol3;

import java.util.Scanner;

public class Test_Main_3_2 {
    public static void main(String[] args) {
        //두 정수를 입력받아서 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
        // 두개입력 나누기 /나머지 출력
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d / %d = %d...%d" ,num1,num2,num1/num2, num1 % num2);

    }

}
