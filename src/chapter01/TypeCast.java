package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		//암시적(implicity) casting -알아서 되는 것 ,오른쪽이 작은 경우
		int i1=10;
		long l1=i1;
		
		//명시적(explicity) casting -명시를 해줘야 되는 것, 오른쪽이 큰 경우(데이터 손실이 있다)
		long l2=91234567899999999l; //int 값을 넘어가면 l을 붙인다, 기본이 int 이므로
		int i2=(int)l2;
		
		System.out.println(l1+":"+i1);
		System.out.println(l2+":"+i2);
	}

}
