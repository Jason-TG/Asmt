

package asmt0629.num3;

class Date {
	
	private int year;
	private int month;
	private int day;
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	} // setDate
	
	public void printDate() {
		System.out.println("오늘 날짜는 " + year + "년 " + month + "월 " + day + "일 입니다." );
	} // printDate
	
} // Date

public class ex01 {

	public static void main(String[] args) {

		Date date = new Date();
		date.setDate(2021, 6, 29);
		date.printDate();
		
	} // main
	
} // ex01
