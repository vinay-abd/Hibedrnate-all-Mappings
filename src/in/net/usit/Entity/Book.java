package in.net.usit.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String bookName;

	@Column
	private String bookTitle;
	
	@OneToOne(cascade = CascadeType.ALL)
	
	private Pages pagesList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Book( String bookName, String bookTitle) {
		super();
		this.bookName = bookName;
		this.bookTitle = bookTitle;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookTitle=" + bookTitle + ", pagesList=" + pagesList
				+ "]";
	}

	public Pages getPagesList() {
		return pagesList;
	}

	public void setPagesList(Pages pagesList) {
		this.pagesList = pagesList;
	}

	public Book(int id, String bookName, String bookTitle, Pages pagesList) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookTitle = bookTitle;
		this.pagesList = pagesList;
	}
	

}
