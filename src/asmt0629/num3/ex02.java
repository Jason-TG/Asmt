

package asmt0629.num3;

public class ex02 { // 실행 결과와 이유 설명

	public static void main(String[] args) {
		Object x = null;
		giveMeAString(x);
		System.out.println(x);
		} //main
	
	static void giveMeAString(Object y) {
			y = "This is a string";
		} // giveMeAString
	
} // ex02

// 실행 결과 :  null
// 이유 : y는 giveMeAString 함수의 지역변수입니다. 
//	          지역변수는 함수 호출 시 스택 메모리에 저장되었다가 
//          종료와 함께 지워지기 때문입니다.
