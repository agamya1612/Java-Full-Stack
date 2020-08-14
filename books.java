package com.mypack.countries;
public class books {
	String Title;
	String AuthorName;
	int isbn;
	
	
	public books(String title, String authorName, int isbn) {
		super();
		Title = title;
		AuthorName = authorName;
		this.isbn = isbn;
	}

	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void dispbooks(){
		System.out.println(Title+" "+AuthorName+" " +isbn);
		}
	
	@Override
	public String toString() {
		return "books[Title=" +Title+ ",AuthorName=" +AuthorName+",isbn="+isbn+"]";
	}

}
