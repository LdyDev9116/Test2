package reference;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {

        //1. 빈 문자열임을 조사할때 equals()메소드를 이용한다.
        String blank = "";
        if (blank.equals("") ){
            System.out.println("blank가 참조하는 String 객체는 빈 문자열");

        }
        //2-1. 문자 추출
        //문자열에서 특정 위치의 "시험의 역시 나를 성장케 해!"
        // '성' ==> charAt(index) ==> 문자열의 길이  ( 0~ 문자열의 길이 -1)

        String subject = "자바 네트워크 프로그래밍";
//            char charValue = subject.charAt(4);
//            System.out.println(charValue);

//        for (int i = 3; i <= 6; i++) {
//            subject.charAt(i);
//
//        }

        // StringBuilder 사용법
        StringBuilder sb = new StringBuilder();
        sb.append("자바").append(" 네트워크 ");
        String str = sb.toString();//  toString 의 Srring 변환
        System.out.println(sb.toString());

        //ArrayList  [<> 형을 제한한다] 동적 증가 가능
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1 ");
        arrayList.add("2 ");
        arrayList.add("3 ");
        arrayList.add("4 ");
        arrayList.add("5 ");
        //////////////////////////////////////////////
        // arrayList  : length 가아닌 size이네
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
        }
        System.out.println(sb.toString());
        ////////////////////////////////////////////// 변경
        String oldStr = "자바 문자열은 불변의 특징이 있다. 자바 문자열은 String타입니다.";
//        String newStr = String클래스를 참조하여 (교체 기능 메소드를 찾아) "자바"  ==> "Java" 교체
//        Java 문자열은 불변의 특징이 있다. Java 문자열은 String타입니다
        String newStr = oldStr.replace("자바", "java");
        System.out.println(newStr);

        //////////////////////////////////////////////잘르기 방식 2가지
        // 3. 문자열 잘라내기 substring(int beginIndex) ,   substring(int beginIndex, int endIndex) {


        // 결과 : java 문자열은 String 타입니다.
        String result1 = oldStr.substring(20,39);
        String result2 = oldStr.substring(20,26);
        System.out.println(result1);
        System.out.println(result2);

        //////////////////////////////////////////////
        // ssn: 880123 - 4234567(substring() 활용)
        // 2023 년 현재 나이와 성별을 출력하는 코드 작성
        // 현재 나이는 030123 -4561234
        // 20 살이고 여성입니다.

        String ssn = "030123-4561234";

        int year = Integer.parseInt(ssn.substring(0,2));
        char zen1 = ssn.charAt(7);

        String zen2 = null;
        if (zen1 == 1 || zen1 == 3){
            zen2 ="남성";
        }else{
            zen2 ="여성";
        }
        System.out.printf("%d 살이고 %s 입니다" , 23-year, zen2);
        //////////////////////////////////////////////
        // indexOf() return 값 확인 (특정 문자열의 위치 를 찾을 때 사용한다)
        //   subject = "자바 네트워크 프로그래밍";     프로그래밍 문자열의 존재 여부
        int index = subject.indexOf("프로그래밍");
        if (index == -1 ){
            System.out.println("존재하지 않는 문자열입니다.");

        } else{
            System.out.println();
            System.out.println(index);
            String  str2=  subject.substring(8,13);
            String  str3=  subject.substring(8);
            System.out.println(str2);
            System.out.println(str3);
            System.out.println("존재합니다.");
        }
        ////////////////////////////////////////////////////////
        // 단순히 포함여부 검사 contains ("문자열")
        boolean subjectContain = subject.contains("프로그래밍");
        if (subjectContain == true){
            System.out.println("포함 되어 있습니다");

        }else{
            System.out.println("포함되어 있지 않습니다. ");
        }
        ////////////////////////////////////////////////////////
        // split() return 값 확인  리턴 값:  Sring[] 배열
        String board = "번호 , 제목 , 내용 , 이름";
        String [] th = board.split(" ,");
        for (int i = 0; i < th.length; i++) {
            System.out.print(th[i]);
        }




    }

}
