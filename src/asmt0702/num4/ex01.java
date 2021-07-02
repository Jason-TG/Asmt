

package asmt0702.num4;

public class ex01 {

	public static void main(String[] args) { // Ragged 배열 만들고 각 행의 합과 평균 출력
		
		int[][] raggedArray = {{78, 48, 78, 98}, {99, 92}, {29, 64, 83}, {34, 78, 92, 56}};
		
		for (int i = 0; i < raggedArray.length; i ++) {
			
			int sum = 0;
			double avg = 0;
			
			System.out.print(i + "행 // 값 : ");
			for (int value : raggedArray[i]) {
				System.out.print(value + " ");
				sum += value;
			}
			avg = (double)sum / raggedArray[i].length;
			
			System.out.println(", 합 : " + sum + ", 평균 : " + avg);
			
		}
	
	} // main

} // ex01
