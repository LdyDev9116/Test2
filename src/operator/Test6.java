package operator;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10개의 자연수를 저장할 배열 선언
        int[] numbers = new int[10];

        // 10개의 자연수를 입력받음
        for (int i = 0; i < 10; i++) {
            System.out.print("자연수를 입력하세요: ");
            numbers[i] = scanner.nextInt();
        }

        // 가장 큰 수 찾기
        int maxNumber = findMaxNumber(numbers);

        // 결과 출력
        System.out.println("입력받은 10개의 자연수 중 가장 큰 수: " + maxNumber);
    }

    // 배열에서 가장 큰 수를 찾는 메서드
    private static int findMaxNumber(int[] array) {
        int max = array[0]; // 배열의 첫 번째 원소를 초기 최대값으로 설정

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // 더 큰 값을 찾으면 최대값 업데이트
            }
        }

        return max;
    }
}
