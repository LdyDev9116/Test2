package operator;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 4자리 이하의 10개의 정수를 저장할 배열 선언
        int[] numbers = new int[10];

        // 10개의 정수를 입력받음
        for (int i = 0; i < 10; i++) {
            System.out.print("정수를 입력하세요 (4자리 이하): ");
            numbers[i] = scanner.nextInt();
        }

        // 짝수 중 가장 큰 값과 홀수 중 가장 작은 값 찾기
        int maxEven = findMaxEven(numbers);
//        int minOdd = findMinOdd(numbers);

        // 결과 출력
        System.out.println("입력받은 10개의 정수 중에서");
        System.out.println("짝수 중 가장 큰 값: " + maxEven);
//        System.out.println("홀수 중 가장 작은 값: " + minOdd);
    }

    // 짝수 중 가장 큰 값을 찾는 메서드
    private static int findMaxEven(int[] array) {
        int maxEven = Integer.MIN_VALUE;

        for (int number : array) {
            if (number % 2 == 0 && number > maxEven) {
                maxEven = number;
            }
        }

        return maxEven;
    }

}