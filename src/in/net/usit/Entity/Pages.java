package in.net.usit.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pages 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int pageSize;
	
	@Column
	private int noOfPages;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Pages [id=" + id + ", pageSize=" + pageSize + ", noOfPages=" + noOfPages + "]";
	}

	public Pages(int id, int pageSize, int noOfPages) {
		super();
		this.id = id;
		this.pageSize = pageSize;
		this.noOfPages = noOfPages;
	}

	public Pages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pages(int i, int j) {
		// TODO Auto-generated constructor stub
		this.pageSize = i;
		this.noOfPages = j;
	}
	
	
	
	

}
