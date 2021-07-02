

package asmt0702.num5;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductInfo {

	public static void main(String[] args) {
	
		ArrayList<Product> arrList = new ArrayList<>();
		Product product = null;
		int productCount = 0;
		Scanner scanner = new Scanner(System.in);

		// 구분(작업 후 종료)
		
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1 : 상품 추가 | 2 : 상품 조회 | 3 : 모든 상품 조회 | 4 : 끝내기");
			System.out.println("----------------------------------");
			System.out.println("선택 >> ");
			
			int firstmenu = scanner.nextInt();
			
			switch(firstmenu) { // 메뉴 선택
			
			case 1 : // 상품 추가 
					if(productCount >= 10) { // 저장 항목 숫자 제한
						System.out.println("항목은 최대 10개까지 입력 가능합니다.");
						break;
					} // if
					
					System.out.println("----------------------------------");
					System.out.println("                            <상품 종류 선택>                            ");
					System.out.println("                  1 : 책 | 2 : 앨범 | 3 : 회화책                     ");
					System.out.println("----------------------------------");
					System.out.println("선택 >> ");

					int productmenu = scanner.nextInt();
					
					switch(productmenu) { // 상품 종류 선택
					case 1 : 
						product = new Book();
						break;
					case 2 :
						product = new CompactDisc();
						break;
					case 3 :
						product = new ConversationBook();
						break;
					} // switch(productmenu)
					
					product.addProduct();
					product.setId(arrList.size() + 1);
					System.out.println(arrList.size());
					arrList.add(product);
					productCount++;
					System.out.println("상품이 1개 추가되었습니다.");
					System.out.println();
					
					break; // (firstmenu) case1
						
			case 2 : // 상품 조회
				System.out.println("상품 id를 입력하세요");
				System.out.println("입력 >> ");
				int searchid = (scanner.nextInt()-1);
				for (int i =0; i < arrList.size(); i++) {
					if (searchid == i) {
						arrList.get(i).showProduct();
						System.out.println();
						System.out.println();
					} 
				} // for
				break;
			
			case 3 : // 모든 상품 조회
				for (Product products : arrList) {
					products.showProduct();
					System.out.println();
					System.out.println();
				}
				break;

			case 4 : // 끝내기 
				System.out.println("프로그램을 종료합니다");
				return;
				
			default : // 1~4 이외의 번호 입력 시 
				System.out.println("잘못된 번호입니다. 1~4까지의 숫자를 입력해주세요");
				continue;
				
			} // switch(firstmenu)
			
		} // while

	} // main
	
} // ProductInfo
