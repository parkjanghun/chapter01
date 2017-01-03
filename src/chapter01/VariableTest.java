package chapter01;

public class VariableTest {
	int number;

	public void test(){
		int j=number+10; //인스턴스 변수는 초기화(0으로)가 된다.
	}

	public static void main(String[] args) {
		int i; 
		//i=20 변수는 식별자다.
		//int j=i; 지역변수는 반드시 초기화

		boolean isHoliday=false;
		char c='A'; //문자 리터럴
		char c1=65; //값(아스키 코드)
		byte b=10;
		short s=20;
		int k=10;
		long l=123456789;
		float f=3.14f; //실수기본타입은 double형이다.
		double d=3.14;
		
		//상수
		final int MAX_SPEED=20; //관례상 상수는 대문자
		//max_speed=200; final이 붙은 변수는 이후에 값 대입을 할 수 없다.
		//클래스 이름, 메소드 이름 앞에도 final을 붙일수 있다.
		
		//string 객체확인
		String str=new String("Hello");
		System.out.println(str);
		
		//String 객체를 리터럴로 사용하기
		String str1="Hello";
		System.out.println(str1);
		
		
	}

}
