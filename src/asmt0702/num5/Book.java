

package asmt0702.num5;

import java.util.Scanner;

import lombok.Data;

@Data
public class Book extends Product {

	private String author;
	private String bookTitle;
	
	public void addProduct() { // Book 추가
		
		super.addProduct();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("저자 >> ");
		setAuthor(scanner.nextLine());
		System.out.println("책 제목 >> ");
		setBookTitle(scanner.nextLine());
	}
	
	public void showProduct() { // Book 조회
		super.showProduct();
		System.out.printf("저자 : %s \t 책 제목 : %s", getAuthor(), getBookTitle());
	}
	
} // Book
