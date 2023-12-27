package loop.logicalEx;

public class PrintFrom1To1000Wheil {
    public static void main(String[] args) {

        int i = 1;
        int total = 0 ;
        while ( i <= 10 ){
            System.out.print(i + " ");
            total = total + i;
            i = i + 1 ; // i++;
        }
        System.out.println();
        System.out.println(total);
    }





}
