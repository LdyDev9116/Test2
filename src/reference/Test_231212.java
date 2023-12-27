package reference;

import java.util.Scanner;

public class Test_231212 {

    public static void main(String[] args) {
        //5개의 정수를 입력받은 후 차례로 출력하는 프로그램을 작성하시오.
        int [] numbers = new int [5];
        Scanner sc = new Scanner(System.in);

        //입력
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = sc.nextInt();
        }
        //출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }


}
