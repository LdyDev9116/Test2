package operator;

public class ReferenceVar2 {
    public static void main(String[] args) {
        //정수형 배열 변수 array1 선언
        int[] array1;

        //정수형 배열 변수 array2 선언
        int[] array2;

        //정수형 배열 변수 array3 선언
        int[] array3;

        int[] array4 = null;
        array4 = new int  [3];
        System.out.println("haCode 값: " + array4.hashCode());
        System.out.println("toString 값: " +  array4.toString());
        array4[0]= 10;
        System.out.println("array4[0] 값: " + array4[0]);


        // 배열 { 1, 2 , 3 } 을생성하고 array1 변수에 대입
        array1 = new int []{1,2,3};

        // 배열 { 1, 2 , 3 } 을생성하고 array2 변수에 대입
        array2 = new int[3];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;

        // 배열 { 1, 2 , 3 } 을생성하고 array3 변수에 대입
        array3 = array2;

        //array1 과 array2 변수가 같은 배열을 참조하는지 검사
        System.out.println(array1.hashCode() == array2.hashCode());
        if(array1 == array2) {
            System.out.println("array1 과 array2 변수가 같은 배열을 참조하는지 검사");
        }

        //array2 과 array3 변수가 같은 배열을 참조하는지 검사
        System.out.println(array2.toString() == array3.toString());



        //배열 참조 검사
        if (array2.equals(array3)){
            System.out.println( "같음");
        }
        if (array2.hashCode() == array3.hashCode() ){
            System.out.println( "같음");
        }



        //배열변수 array2 의 array3 대입열


    }










}
