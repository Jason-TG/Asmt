

package asmt0702.num5;

import java.util.Scanner;

import lombok.Data;

@Data
public class CompactDisc extends Product {

	private String albumTitle;
	private String singer;
	
	public void addProduct() { // CompactDisc 추가
		
		super.addProduct();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("앨범 제목 >> ");
		setAlbumTitle(scanner.nextLine());
		System.out.println("가수 >> ");
		setSinger(scanner.nextLine());
	}
	
	public void showProduct() { //  CompactDisc 조회
		super.showProduct();
		System.out.printf("앨범 제목 : %s \t 가수 : %s", getAlbumTitle(), getSinger());
	}
	
}
