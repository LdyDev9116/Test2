package reference;

public class StudentClass1 extends Object  {

    public static void childMethood() {  //[static 고정이란의미 재사용가능]
        System.out.println("childMethood 메세지 static class로 호출  ");
    }
    public static void main(String[] args) {
        //    static Scanner sc = new Scanner(System.in); // 고정으로 쓸거 만든거

            int value = 5;
            System.out.println(value);

            String name = "Java1";
            String name2 = "Java1";
            String name1 = "Java";
            String name3 = new String("java");

            System.out.println(name.toString()); // 값 JAVA?
            System.out.println(name1.hashCode()); //주소의 값
            System.out.println(name1.hashCode() == name3.hashCode()); //주소값 비교 //값은주소 참조가 가능하네 ?
            System.out.println(name1.equals(name)); //주소의 값  비교

            System.out.println(name.hashCode()); //주소의 값

//        childMethood(); //메소드 호출

        }

}
