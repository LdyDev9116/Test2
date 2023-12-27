package Jungol5;

import java.util.Scanner;

public class Test5_7Self {
    public static void main(String[] args) {
        //영문 대문자를 입력받아
        //'A'이면 “Excellent”,
        //'B'이면 “Good”,
        //'C'이면 “Usually”,
        //'D'이면 “Effort”,
        //'F'이면 “Failure”,
        //그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        char str = sc.next().charAt(0);

        if (str == 'A'){
            System.out.println("Excellent");
        }else if(str == 'B'){
            System.out.println("Good");
        }else if(str == 'C'){
            System.out.println("Usually");
        }else if(str == 'D'){
            System.out.println("Effort");
        }else if(str == 'F'){
            System.out.println("Failure");
        }else{
            System.out.println("error");
        }







    }

}
