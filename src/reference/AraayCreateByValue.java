package reference;

public class AraayCreateByValue {
    public static void main(String[] args) {

        String [] season = {"봄" , "여름", "가을" , "겨울"}; //문자열배열 생성후 값 할당

        //항목 값 읽기
        System.out.println( "season[0]" + season[0] );
        System.out.println( "season[1]" + season[1] );
        System.out.println( "season[2]" + season[2] );
        System.out.println( "season[3]" + season[3] );

        for (String s : season){ // 향상된 for 문
            System.out.println(s);
        }
        //인덱스 1의 값을 변경 : "여름" 값 변경
        season [0] = "A";
        season [1] = "B";
        season [2] = "C";
        season [3] = "D";

        System.out.println(season[1]);
        System.out.println("-------------------");

        String result = printSeason(season);
        System.out.println(result);

        result = printSeason(season);
        System.out.println(result);

        printSeason2(); // void 출력

    }

    public  static String printSeason(String[] season ){
        for (String s : season){ // 향상된 for 문
            System.out.println(s);
        }
        return  "출력완료";
    }
    public  static void printSeason2 ( ) {
        System.out.println(" 메세지 static class로 호출  ");
    }


}
