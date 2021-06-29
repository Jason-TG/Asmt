

package asmt0629.num2;

public class ex03 { // 직각 이등변 삼각형 출력

	static void triangleLB(int n) { // 왼쪽 아래가 직각인 이등변 삼각형
		for (int row = 0; row < n + 1; row++) {
			for (int col = 0; col < row; col++) {
				System.out.print("*");
			} // 열
			System.out.println();
		} // 행
	} // triangleLB
	
	static void triangleLU(int n) { // 왼쪽 위가 직각인 이등변 삼각형
		for (int row = 0; row < n + 1 ; row++) {
			for (int col = 0; col < (n-row) + 1; col++) {
				System.out.print("*");
			} // 열
			System.out.println();
		} // 행
	} // triangleLB
	
	static void triangleRU(int n) { // 오른쪽 위가 직각인 이등변 삼각형
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < row; col++) {
				System.out.print("o");
			} // "o"열
			for (int col = 0; col < (n-row); col++) {
				System.out.print("*");
			} // "*"열
			System.out.println();
		} // 행
	} // triangleLB
	
	static void triangleRB(int n) { // 오른쪽 아래가 직각인 이등변 삼각형
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < (n-row) -1; col++) {
				System.out.print("o");
			} // "o"열
			for (int col = 0; col < row + 1; col++) {
				System.out.print("*");
			} // "*"열
			System.out.println();
		} // 행
	} // triangleRB
	
	
	public static void main(String[] args) {

		triangleLB(5);
		System.out.println();
		triangleLU(5);
		System.out.println();
		triangleRU(5);
		System.out.println();
		triangleRB(5);
		System.out.println();

	} // main
	
} // ex3
