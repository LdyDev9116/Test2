package Jungol5;

import java.util.Scanner;

public class Test5_6Self {
    public static void main(String[] args) {
        //남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
        //성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자),
        // "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여
        // 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);
        int age = sc.nextInt();


            if (age >18 && gender == 'M' ){
                System.out.println("MAN");
            }else if(age < 18 && gender == 'M' ){
                System.out.println("BOY");
            }

            if (age >18 && gender == 'F' ) {
                System.out.println("WOMAN");
            } else if(age < 18 && gender =='F' ) {
                System.out.println("GIRL");
            }






    }

}
