package operator;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        // 배열 초기화
        int[] numbers = {95, 75, 85, 100, 50};

        // 오름차순으로 정렬
        Arrays.sort(numbers);

        // 정렬된 배열 출력
        System.out.println("오름차순으로 정렬된 배열:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
