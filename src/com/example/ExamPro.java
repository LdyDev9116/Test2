package com.example;

public class ExamPro {

    public static void main(String[] args) {
           int x = 100;
           System.out.println(x);   //100
           x = - x;
        System.out.println(x);   //-100

         x++;   //x = x + 1;
        System.out.println(x);  //-99

         --x;  // x = x - 1;
        System.out.println(x);

        int y = 1;
        int z = 1;
        int c = 1;
        System.out.println(++y + 10);

        System.out.println(z++ + 10);

        int result2 = c++ + 10;
        System.out.println(result2);

        int a = 5;
        System.out.println(a++);
        System.out.println(++a);

        a = 10;
        int b =20;
        int result = a++ * --b;
        System.out.printf("%d %d %d\n",a,b,result);

        byte b3 = -128;
         b3--;
         b3--;
        System.out.println(b3);

         b3 = 127;
         b3++;
        System.out.println(b3);

        byte b4 = 125;
        for(int i = 0; i<5;i++){
            b4++;
            System.out.println(b4);

        }
//        int div = 5/0;
//        System.out.println(div);
          x = 5;
          double d = 0.0;
          double z1 = x/d;   //x%d
          if(Double.isFinite(z1) || Double.isNaN(z1)){
              System.out.println("값 산출 불가");
          } else{
              System.out.println(z1 +2);
          }


    }
}
