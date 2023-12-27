package reference;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";
		 // "여행"에 해당하는 String 객체를 쓰레기로 만듦
//		hobby = null;
		System.out.println(hobby);

		String kind1 = "자동차";
		 // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		// "자동차"에 해당하는 String 객체는 쓰레기가 아님
		String kind2 = kind1 ;
		int a = 3;
		int b= a ;

		//kind1, kind2 의 번지를 비교, 값 비교

		System.out.println(kind2);

		System.out.println();
		System.out.println(kind1.hashCode()  );
		System.out.println(kind1.hashCode() == kind2.hashCode() );
		System.out.println(kind1.toString()  );
		System.out.println(kind1.toString() == kind2.toString() );





	}
}