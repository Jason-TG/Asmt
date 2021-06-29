package asmt0629.num3;

import java.util.ArrayList;

class Book {
	
	private String title;
	private String author;
	private String publisher;
	private String sort;
	
	public Book() {
	}
	
	public Book (String title) {
		this.title = title;
	}
	
	public Book(String title, String author, String publisher, String sort) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.sort = sort;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
} // Book
	
public class ex06 {
	
	public static void main(String[] args){
		
		Book[] bookList = new Book[4];
		
		bookList[0] = new Book("제목", "저자", "출판사", "분류");
		bookList[1] = new Book();
		bookList[2] = new Book("파리아파트");
		bookList[3] = new Book("자료구조", "이자료", "DB출판사", "컴퓨터/IT");
		
		bookList[1].setTitle("82년생 김지영");
		bookList[1].setAuthor("조남주");
		bookList[1].setPublisher("민음사");
		bookList[1].setSort("소설");
		
		bookList[2].setAuthor("기욤뮈소");
		bookList[2].setPublisher("밝은세상");
		bookList[2].setSort("소설");
				
		for (int i = 0; i < bookList.length; i++) {
			System.out.printf("%s\t%s\t%s\t%s\n", 
			bookList[i].getTitle(), bookList[i].getAuthor(), 
			bookList[i].getPublisher(), bookList[i].getSort());
		} // for
		
	 } // main
	
	} // ex06


