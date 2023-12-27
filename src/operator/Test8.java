package operator;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10명의 컴퓨터 점수를 저장할 배열 선언
        int[] scores = new int[10];

        // 10명의 컴퓨터 점수를 입력받음
        for (int i = 0; i < 10; i++) {
            System.out.print("컴퓨터 점수를 입력하세요 (0부터 100까지): ");
            int score = scanner.nextInt();

            // 입력된 점수가 유효한 범위인지 확인
            if (score < 0 || score > 100) {
                System.out.println("유효한 범위의 점수를 입력하세요 (0부터 100까지).");
                i--; // 다시 입력 받기 위해 인덱스를 감소
                continue;
            }

            scores[i] = score;
        }

        // 총점 계산
        int total = 0;
        for (int score : scores) {
            total += score;
        }

        // 평균 계산
        double average = (double) total / scores.length;

        // 결과 출력
        System.out.println("10명의 컴퓨터 점수:");
        for (int i = 0; i < 10; i++) {
            System.out.println("학생 " + (i + 1) + ": " + scores[i]);
        }
        System.out.println("총점: " + total);
        System.out.println("평균: " + average);
    }
}