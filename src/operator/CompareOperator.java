package operator;

public class CompareOperator {
    //비교연산자 동등(==,!=) , 크기비교(<,<=,>,>=)평가 해서 boolean타입인 true/false 반환
    //비교 연산자는 흐름제어문  조건문(if) , 반복문(for,while)에서 실행 흐름을 제어한다.

    public static void main(String[] args) {

        char a = 65;
        int b = 67;

        if(a == b){
            System.out.println("같음");
        }else if(a != b){
            System.out.println("다름");
        }else{
            System.out.println("조건 비교 불가");
        }

        float f1 = 0.1f;
        double f2 =(float)0.1;
        System.out.println(f1 == f2);

        String s1 = "abc";  //(원본 문자열)
        String s2 = "Abc";  //(비교 문자열)

        boolean result = s1.equals(s2);
        result = ! s1.equals(s2);
        System.out.println(result);



    }

    }




