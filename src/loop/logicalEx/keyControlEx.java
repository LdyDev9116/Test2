package loop.logicalEx;
import java.util.Scanner;
public class keyControlEx {
        public static void main(String[] args) {
            // - Scanner 클래스 사용자에게 입력
            Scanner input = new Scanner(System.in);
            boolean run = true;
            int speed = 0;

            //1.사용자에게 번호 1-3 번까지 선택하도록 안내
            // 1. 증가 2. 감소 3. 중지
            //2. 선택에 대한 처리 조건식 제어문
            //3. 사용자가 번을 선택할 경우 반복문을 종료 (false)

            while (run) {
                System.out.println("==========================");
                System.out.println("1. 증가 2. 감소 3. 중지");
                System.out.println("==========================");
                String data = input.nextLine();


                if(data.equals("1")){
                    speed ++;
                    System.out.println("현재 속도는" + speed);
                } else if (data.equals("2")) {
                    speed--;
                } else if (data.equals("3")) {
                    run = false;
                }


            }
            System.out.println("주행완료!");

        }



}
