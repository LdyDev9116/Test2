package control;

import java.util.Scanner;

public class SwitchExam {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
          System.out.print("나이를 입력해 주세요! ");

          int age = in.nextInt();
          System.out.print("이름을 입력해 주세요! ");
          String name = in.nextLine();
          String result = method1(age,name);
        System.out.println(result);

         }

    public static String method1(int age,String name){
        String result=null;
        switch (age){
            case 10 -> {
                System.out.println("십대~");
                result= "십대";
             }
            case 20 -> System.out.println("이십대~");
            case 30 -> System.out.println("삼십대~");
            case 40 -> System.out.println("사십대~");
            default -> System.out.println("알수 없습니다.");
        }


        return result;
    }


}
