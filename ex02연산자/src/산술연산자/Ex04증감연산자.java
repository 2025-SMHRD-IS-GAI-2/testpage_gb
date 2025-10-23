package 산술연산자;

public class Ex04증감연산자 {

	public static void main(String[] args) {
		// 증감 연산자
		// 변수에 저장된 값을 1 증가, 1 감소
		// ++변수, 변수++
		// --변수, 변수--
		int num1 = 10;
		// 증감연산자의 위치에 따라 결과 값이 달라진다.
		System.out.println(num1);
		//1. 변수 앞에 증감연산자 ->
		// 코드 실행과 동시에 연산 진행
		System.out.println(++num1);
		System.out.println(num1);
		// 2. 변수 뒤에 증감연산자 ->
		// 코드 실행 후에 다음 줄로 넘어가면서 연산을 진행한다
		System.out.println(num1++);
		System.out.println(num1);
		
		
		
		
		
		
		
		
		

	}

}
