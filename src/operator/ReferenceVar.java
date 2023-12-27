package operator;

public class ReferenceVar {
    public static void main(String[] args) {
        //정수형 배열 변수 array1 선언
        int[] array1;

        //정수형 배열 변수 array2 선언
        int[] array2;

        //정수형 배열 변수 array3 선언
        int[] array3;

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

//        System.out.println(array2[0]);
//        System.out.println(array2[1]);
//        System.out.println(array2[2]);


        for (int i = 0; i < 3; i++) {
            if(array2.equals(i) == array3.equals(i)) {
                System.out.println("array2 과 array3 변수가 같은 배열을 참조하는지 검사");
            }
        }


//
//        System.out.println(array1);
//        System.out.println(array2);
//        System.out.println(array3);



        //배열변수 array2 의 array3 대입열


    }










}
