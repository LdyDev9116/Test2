package control;
import java.util.*;
public class Test {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.print("점수를 입력하세요");
                int grade = sc.nextInt();

                if (0 > grade  || grade > 100){
                    System.exit(0);
                }else if (grade >= 80 ){
                    System.out.println("축하합니다. 합격입니다.");
                }else{
                    System.out.println("죄송합니다. 불합격입니다.");
                }

            }




        }
    }




