package reference;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //2 반 한반당 학생수 5명인 2차원배열 scores 를 생성하세요, 1반 {90, 80, 70, 80, 50}    1반 {90, 100, 80}

        int [][] scores =  { {90, 80, 70, 80, 50} , {90, 100, 80} };

        //배열 scores 길이 [반]
//        System.out.println(scores.length );
//
//        //첫번째 반의 학생 수
//        System.out.println(scores[0].length);
//
//        //두번째 반의 학생 수
//        System.out.println(scores[1].length);

        //반의 1번 학생의 점수
//        System.out.println(scores[0][0]);
//        System.out.println(scores[0][1]);
//        System.out.println(scores[0][2]);
//        System.out.println(scores[0][3]);
//        System.out.println(scores[0][4]);

        //반의 2반 학생의 점수
//        System.out.println(scores[1][0]);
//        System.out.println(scores[1][1]);
//        System.out.println(scores[1][2]);
//        System.out.println(scores[1][3]);
//        System.out.println(scores[1][4]);

        int total = 0;

        for (int i = 0; i < scores[0].length; i++) {
            total += scores[0][i];


//            for (int j = 0; j < scores[1].length; j++) {
//                System.out.println(scores[i][j]);
//            }
//
        }
        double avg  = (double) ( total /scores[0].length);
        System.out.printf ("avg :  %.1f" , avg);


    }

}
