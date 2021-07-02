
package asmt0702.num5;

import java.util.Scanner;

import lombok.Data;

@Data
public class ConversationBook extends Book {

	private String language;

	public void addProduct() { // ConversationBook 추가

		super.addProduct();

		Scanner scanner = new Scanner(System.in);
		System.out.println("언어 >> ");
		setLanguage(scanner.nextLine());
	}

	public void showProduct() { // Book 조회
		super.showProduct();
		System.out.printf("언어 : %s ", getLanguage());
	}

}
