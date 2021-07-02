

package asmt0702.num4;

class Student {
	
	int sno, rank;
	String name, dept;
	int[] scores;
	double avg;
	
	public Student(int sno, String name, String dept, int score1, int score2, int score3) {
		scores = new int[3];
		scores[0] = score1; scores[1] = score2; scores[2] = score3 ;
		this.sno = sno; 
		this.name = name;
		this.dept = dept;	
	} // Student()
	
	public int calSum() {
		int sumVal = 0;
		for (int num : scores) {
			sumVal += num;
		}
		return sumVal;
	} // calSum()
	
	public double calAvg() {
		double avgVal = (double) this.calSum() / scores.length;
		return avgVal;
	} // calAvg()
	
	public void showInfo() {	
		System.out.printf("%d \t %s \t %s \t %d \t %d \t %d \t %d \t %f \n", 
				sno, name, dept, scores[0], scores[1], scores[2], calSum(), calAvg() );
	} 
	
	
} // class Student

public class ex03 {

	public static void main(String[] args) {

		Student[] students = new Student[3];
		students[0] = new Student(1, "홍길동", "영문", 80, 70, 80); 
		students[1] = new Student(2, "박경미", "컴공", 70, 80, 75); 
		students[2] = new Student(3, "하성호", "전컴", 80, 85, 90);
		
		System.out.printf("학번 \t 이름 \t 학과 \t 성적1 \t 성적2 \t 성적3 \t 총점 \t 평균 \n "  );
		students[0].showInfo();
		students[1].showInfo();
		students[2].showInfo();
		
		
		
//		총점, 평균 구하기 메소드
//		출력 메소드
//		Student[] students=new Student[3]; 사용


	} // main

} // ex03
