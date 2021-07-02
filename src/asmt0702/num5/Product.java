

package asmt0702.num5;

import java.util.Scanner;

import lombok.Data;

@Data
public class Product {

	private int id;
	private String comment;
	private String productor;
	private int price;
			
	public void addProduct() { // Product 추가
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품 설명 >> ");
		setComment(scanner.nextLine());
		System.out.println("생산자 >> ");
		setProductor(scanner.nextLine());
		System.out.println("가격 >> ");
		setPrice(scanner.nextInt());
	}
	
	public void showProduct() { // Product 조회
		System.out.printf("상품id : %d \t 상품 설명 : %s \t 생산자 : %s \t 가격 : %d \t", getId(), getComment(), getProductor(), getPrice());
	}
	
} // Product
