package reference;

import java.util.Scanner;


public class ScoresArrayList3 {


    public static void main(String[] args) {
        //성적을 저장할 정수형 1차원 배열 scores 선언
        int[] Scores = {80, 90, 87};
        // scores 에 {80,90,87} 대입
        System.out.println(PrintItem(Scores));
    }
    public static String PrintItem(int[] Scores) {
        System.out.print("점수: ");
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < Scores.length; i++) {
            System.out.print(Scores[i] + " ");
        }
        for (int i : Scores) {
            sum += i;
        }
        avg = (double) sum / Scores.length;
        // System.out.printf("총합: %d 평균 %.1f", sum, avg);
        return "최종총합: %d 최종평균 %.1f".formatted(sum, avg);
    }
}

