package reference;

import java.util.Scanner;


public class ScoresArrayList2 {

    public static void main(String[] args) {

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
        int []  scorre = new int [3];


        int sum = 0;
        int count = 0;
        double avg = 0.0;

            //입력
            for (int i = 0; i < scorre.length; i++) {
                int num = sc.nextInt();

                scorre[i] = num;

                if (num== 0){
                    break;
                }
                ++count;
                sum += num;
                avg = (double) sum / (double) count;
//            System.out.println("개수 = " + count);

            }

            //출력
            System.out.print(" 점수 = ");
            for (int i = 0; i <scorre.length ; i++) {

            System.out.print(scorre[i] + " ");

        }


        System.out.print(" 합계 = "+ sum);
        System.out.print(" 평균 = ");
        System.out.printf("%.1f", avg);
        System.out.println();

        int total = sum/3;
        return total;


    }



}





