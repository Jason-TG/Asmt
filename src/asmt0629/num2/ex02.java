

package asmt0629.num2;

public class ex02 {

	public static void main(String[] args) {

		// 곱셈표 출력
		
		int result = 0;
		
		for ( int i = 1; i < 10; i++ ) {
			for ( int j = 1; j < 10; j++ ) {
				result = i * j;
				System.out.print(result + " ");
			}
			System.out.println();
		}
		
	} // main

} // ex2 

