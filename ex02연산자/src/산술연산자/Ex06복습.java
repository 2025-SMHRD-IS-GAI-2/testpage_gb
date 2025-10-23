package 산술연산자;

public class Ex06복습 {

	public static void main(String[] args) {
	  
	// 자료형
	// 1. 기본/기초/원시 자료형
	// -> 8가지
	// double short float boolean
	// long byte int char
	// 2. 레퍼런스(참조)자료형
	//   -> string: "문자열"
	//        char: '문자1개'
	// 형변환(오류 "casting")
	// 1) 명시(강제)형변환
	// -> 상대적으로 데이터 용량이 큰쪽에서 작은 데이터 타입을 변환할때
	// double(8byte) -> int(4byte)
	// 맥주잔 -> 소주잔
	// 2) 묵시(자동)형변환
	// -> 상대적으로 작은 크기 -> 큰 크기로 데이터 변환

	//연산자
	// + - * / %
	// % 나머지 연산자/몫 연산자
	// 실수와 정수 나누면? 실수
	// (더 정확한 숫자를 표현할 수 있는 실수)

	System.out.println("7"+(3+7));
	// 문자+숫자=문자가 된다
	int num1= 10;
	// 복합 대입 연산자
	// 연산과 동시에 대입을 하는 연산자
	System.out.println(num1+2);
	//num1= num1+2;
	// num1에서 5를 뻰 값을 다시 num1에 대입
	System.out.println(num1-=5);
    int num2 = 5;
    System.out.println(num2++);//5
    System.out.println(num2);//6
    System.out.println(++num2);//7
    // && : 양쪽 다 true인 경우에만 -> true
    System.out.println(true && false);
    // || : 양쪽 다 false인 경우에만 -> false 
    System.out.println(true || false);
  
  }
	
}
	
	
	
	
	
	
