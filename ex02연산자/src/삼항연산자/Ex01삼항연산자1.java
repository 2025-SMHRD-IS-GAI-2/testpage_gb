package 삼항연산자;

import java.util.Scanner;

public class Ex01삼항연산자1 {

	public static void main(String[] args) {

		//삼항 연산자
		// : 간단한 제어 처리할때, 사용
		// 조건문? 실행문1 : 실행문2
		// 1) 조건문의 결과가 true -> 실행문1 실행
		// 2) 조건문의 결과가 false -> 실행문2 실행
		boolean isRainy = true;
		System.out.println(isRainy?"비가온다":"비가 오지 않는다");
		
		//Q: 삼항 연산자를 이용해서 
		// 정수형 변수 i, j를 선언 후, 7, 8 데이터 할당하여 두 수가 동일한지 판단하기
		int i = 7;
		int j = 8;
		// ==
        System.out.println(i==j?"동일하다":"다르다");
		
        //짝/홀수 구분하는 법
        // 2로 나눴을 때, 나머지가 0 -> 짝수
        // 2로 나눴을 때, 나머지가 1 -> 홀수
        
        //1. 입력받는 도구 가져오기
        //2. "정수를 입력하세요" 문구 출력
        //3. 정수를 입력받아, 변수 num1에 저장
        //4. 삼항 연산자를 이용해서
        // 짝수인 경우-> "짝수입니다" 출력
        // 홀수인 경우-> "홀수입니다: 출력
        
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println(num1%2==0?"짝수입니다":"홀수입니다");
		
		
		
		
		
		
		
	}

}
