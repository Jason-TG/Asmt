

package asmt0629.num2;

import java.util.Scanner;

public class ex01 { // 양의 정수를 입력하고 자리수를 구하는 프로그램
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("양의 정수를 입력하세요 : ");
		
		int num = scanner.nextInt();
		int dividend = num;
		int digit = 0;
		
		while (dividend > 0) {
			dividend = dividend/10;
			digit += 1;
		}
		
		System.out.println(num + "은 " + digit + "자리의 숫자입니다.");
		
	} // main

}
