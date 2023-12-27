package operator;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램을 작성하시오
        Scanner sc = new Scanner(System.in);
        int input = 0; //입력변수
        int count = 0;
        int[] numbers = new int[100];

        while (true) {
            input = sc.nextInt();

            if (input == 0) {
                break;
            }
            numbers[count] = input;
            count++;
            if (count >= 100) {
                System.out.println("100개까지의 정수 입력완료로 인한 중단");
                break;
            }
        }

        for (int i = 1; i < count; i += 2) { // 1  3 5 7  |  9 9 9 9개입력
            System.out.print(numbers[i] + " ");
//            System.out.println("i :" + i);
//            System.out.println("count: " + count);
        }
    }

}



