package asmt0629.num2;

public class ex04 { // n단의 피라미드 출력
	
	public static void pyramid(int n) {
		
		for (int row = 0; row < n + 1; row++) {
			
			for (int col = 0; col < (n-row); col++) {
				System.out.print(" ");
			} // col " "
			for (int col = 0; col < (row*2)-1; col++) {
				System.out.print("*");
			} // col "*"
			System.out.println();

		} // row
		
	} // pyramid()
	
	public static void main(String[] args) {
		
		pyramid(3);
		
	} // main

} // ex04
