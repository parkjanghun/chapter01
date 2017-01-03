package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1=10;
		int n2=30;

		if(n1<n2){
			int temp=n1;
			n1=n2;
			n2=temp;			
		}

		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);

		int a1=20;
		int a2=100;
		int a3=50;

		if(a1>=a2){
			if(a1>=a3)
				System.out.println("최댓값:"+a1);
			else
				System.out.println("최댓값:"+a3);
		}
		else{ //a1보다 a2가 큰 경우
			if(a2>=a3)
				System.out.println("최댓값:"+a2);
			else //a2보다 a3가 큰 경우
				System.out.println("최댓값:"+a3);
		}
	}



}
