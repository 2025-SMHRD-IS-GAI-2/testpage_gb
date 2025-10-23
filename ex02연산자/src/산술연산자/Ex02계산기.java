package 산술연산자;

import java.util.Scanner;

public class Ex02계산기 {

	public static void main(String[] args) {
        // 1. 입력 받는 도구 가져오기
		 Scanner sc = new Scanner(System.in);
	    // 2. "첫 번째 정수 입력" 문구 출력
		 System.out.print("첫 번째 정수 입력");
	    // 3. 정수 입력 받아서 변수 num1에 저장
		 int num1 = sc.nextInt();
	    // 4. "두 번째 정수 입력" 문구 출력
		 System.out.print("두 번째 정수 입력");
	    // 5. 정수 입력 받아서 변수 num2에 저장
		 int num2 = sc.nextInt();
	    // 6. 변수 num1과 num2를 더한 결과 출력
		 System.out.println("두 수의 더하기: "+(num1+num2));
		// 7. 변수 num1과 num2를 뺀 결과 출력
		// 8. 변수 num1과 num2를 곱한 결과 출력
		// 9. 변수 num1과 num2를 나눈(몫) 결과 출력
	    
	 //코드 한줄 이동하는 단축키: alt 방향키
		
	    
	    System.out.println("두 수의 빼기: "+(num1-num2));
	    System.out.println("두 수의 곱하기: "+(num1*num2));
	    System.out.println("두 수의 나누기(몫): "+(num1/num2));
		
		
	}

}
