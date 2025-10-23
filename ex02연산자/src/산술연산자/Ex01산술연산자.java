package 산술연산자;

public class Ex01산술연산자 {

	public static void main(String[] args) {
        // 코드 한 줄 복사 단축키 ctrl+alt 방향키
	    // 정수형 변수 num1선언 & 7 할당
		int num1 = 7;
		
		// 정수형 변수 num2 선언 & 3 할당
		int num2 = 3;
		
		// '/'는 몫연산자, '%'는 나머지 연산자
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		// double(8byte) -> float(4byte)
		// 명시적 형변환(강제)
		float num3 = (float)7.0;
		float num4 = 3.0f;
		// 정수/실수
	    System.out.println(num1/num2);
	    // 실수/실수
	    System.out.println(num3/num4);
	    // 정수/실수 : 더 정확한 수를 표현 할 수 있는 실수로 결과 출력!
	    System.out.println(num1/num4);
		// *문자와 정수를 더하면 문자가 된다!
	    System.out.println(7+3+"7");
	    System.out.println(7+"3"+7);
	    System.out.println("7"+3+7);
	    // Q: 출력되는 결과가 710이 되도록 코드를 작성해보세요
	    System.out.println("7"+(3+7));
	    //어떠한 정수를 넣어도 백의 자리 미만을 버리는 코드를 작성하세요~
	    int num = 456;
	    System.out.println(num/100+"0"+0);
	    
	    // 선생님이 알려주신 답
	    System.out.println(num/100*100);
	    System.out.println(num-(num%100));
	    System.out.println(num/100+"00");
	    
		
		
	
	}

}
