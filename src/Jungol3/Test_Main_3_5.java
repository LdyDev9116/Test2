package Jungol3;

import java.util.Scanner;

public class Test_Main_3_5 {
    public static void main(String[] args) {
        //민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
        //(JAVA는 1 이면 true, 0 이면 false를 출력한다.)

        Scanner sc = new Scanner(System.in);
        int height1 = sc.nextInt();
        int weight1 = sc.nextInt();
        int height2 = sc.nextInt();
        int weight2 = sc.nextInt();

        if (height1 > height2 && weight1> weight2 ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

}
