package operator;

import java.util.Scanner;

// Scanner 클래스를 이용하여 하나의 데이터를 받아서 영문자인지 숫자인지를 구분하여 출력하세요
// 영문자라면 출력: 영문자 이군요!
// 숫자라면  출력: 0~9까지의 수이군요!

public class LogicalOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int charCode = 0;

        String data = input.nextLine();
         //data => aAA
        //값 할당
        char charCode = data.charAt(0);

        //처리 (출력)
        //charCode 의 값이 대문자인지 소문자인지 판별해 봅시다.
        if((65 <= charCode)&(charCode <=90)){
            System.out.println("대문자");
        }
        if((97 <= charCode)&&(charCode <=122)){
            System.out.println("소문자");
         }

        if((48<=charCode)&&(charCode<=57)){
            System.out.println("0-9사이의 숫자이군요");
        }


        //  % 연산자를 이용하여 입력받은 데이터(숫자가 2 또는 3의 배수인지 구분)
        //출력 : 2또는 3의 배수라면 "2또는 3의 배수이군요"
          if((charCode % 2 == 0) || (charCode % 3 == 0)){
              System.out.printf("입력데이터 : %d , 2또는 3의 배수이군요!", charCode);
          } else{
              System.out.printf("입력데이터 : %d ,2또는 3의 배수가 아닙니다." , charCode);
          }





        
    }
}
