package 산술연산자;

public class Ex05비교연산자 {

	public static void main(String[] args) {
		// 비교 연산자
		// : 상대적인 크기를 비교할 때 사용
		// 부등호를 사용해서 참(true), 거짓(false)을 판단
		System.out.println(1<3);
		System.out.println(1>3); 
		System.out.println(1>=3);
		System.out.println(1<=3); 
		System.out.println(3==3);
		
		System.out.println(3!=3); 
		System.out.println(!(3<10));
		
		// 논리 연산자
		// && and 연산자
		System.out.println("논리 연산자");
		// || (backspace와 enter사이) or 연산자
		// and && 연산자는 양쪽 다 true인 경우에만 결과값이 true가 나온다!
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		// or연산자
		// 양쪽 다 false인 경우에만 결과 값이 false가 나온다
		System.out.println("or연산자");
		System.out.println(true||true);
		System.out.println(false||true);
		System.out.println(true||false);
		System.out.println(false||false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
