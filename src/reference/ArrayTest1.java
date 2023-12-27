package reference;

public class ArrayTest1 {
    public static void main(String[] args) {

        //1. 배열 선언: 타입 [] 변수명; 타입변수[];
        //정수형 배열 intArray 를 선언하시오
//            int [] intArray;
            int [] intArray = null;
        //실수형 배열 dpubleArray 를 선언하시오
//            double [] dpubleArray;
            double [] doubleArray = null;
        //문자형 배열 strArray 를 선언하시오
//            String [] strArray;
            String [] strArray = null;

        //2.배열생성 (주소값 항당)
        intArray = new int [4];
        intArray[0]= 10;
        intArray[1]= 20;
        intArray[2]= 30;
        intArray[3]= 40;


        //intArray 에 50,60,70,80 재할당
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] += 40;
//            System.out.println(intArray[i]);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println();

        for (int i :intArray ){  //내부 iterator 처리 [향상된 for 문]
            System.out.println(i);
        }
        System.out.println("----------------------------------------------------");

        doubleArray = new double [4];

        //값 할당
//        doubleArray[0] = 10.0 ;
//        doubleArray[1] = 11.0 ;
//        doubleArray[2] = 12.0 ;
//        doubleArray[3] = 13.0 ;
//        System.out.println(doubleArray[0]);
//        System.out.println(doubleArray[1]);
//        System.out.println(doubleArray[2]);
//        System.out.println(doubleArray[3]);

        //for를 이용하여 10.0 ~13.0 할당

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = 10.0 + i;
        }

        //할당 값 출력 for 2개 패턴 적용
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }


        System.out.println("tttt");


        strArray = new String [4];


    }
}
