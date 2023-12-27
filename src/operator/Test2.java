package operator;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
            char [] chArray = new char[26];
            char charmessage =  'A' ;

            // 'A'부터 'Z'까지 대문자 대입
            for (int i = 0; i < 26; i++) {
                chArray[i] = charmessage++;
            }

            // 'A'부터 'Z'까지 대문자 출력 (반대)
            for (int i = 25; i >= 0; i--) {
                System.out.print(chArray[i] + " ");
            }



    }

}
