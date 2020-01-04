package jdbc;

import weektest2.Author;
import weektest2.Publisher;

public class Books
{
	private int isbn;
	private String title;
	private int pages;
	private int pub_year;
	private String type;
	private Publisher pub;
	private Author auth;


	public Books(int isbn, String title, int pages, int pub_year) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.pages = pages;
		this.pub_year = pub_year;
		this.type= type;
	}


	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPub_year() {
		return pub_year;
	}
	public void setPub_year(int pub_year) {
		this.pub_year = pub_year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", title=" + title + ", pages=" + pages + ", pub_year=" + pub_year + ", type=" + type
				+ ", pub=" + pub + ", auth=" + auth + "]";
	}





}
