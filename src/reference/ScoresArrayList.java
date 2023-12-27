package reference;

import java.util.Scanner;

public class ScoresArrayList {

    public static void main(String[] args) {

        //성적을 저장할 정수형 1차원 배열 scores 선언
        // scores 에 {80,90,87} 대입
//        int []  scores = {80,90,87};
        PrintItem();
    }


    //출력시 PrintItem static method를 작성. scores(배열)을 매개값으로 전달하여
    //scores의 항목(점수)를 출력한 후
    // scores의 총합을 구하고 총합과 평균을 출력하세요
    //출력예시 :
    // 점수 : 80 , 90 , 87
    // 총합 : 00  평균: 00.0  평균은 소수 첫째자리까지
    public static int PrintItem (){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0.0;

        while (true) {
            int num = sc.nextInt();

            ++count;
            sum += num;
            avg = (double) sum / (double) count;
//            System.out.println("개수 = " + count);
            System.out.println(" 점수 = " + sum);
            System.out.print(" 평균 = ");
            System.out.printf("%.1f", avg);
            System.out.println();
        }
    }

}




