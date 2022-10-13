/**
 * @author Ketan Kumar
 * Illustrating SPRING CORE SETTER DEPENDENCY INJECTION USING XML FILE
 * CREATING STUDNET CLASS WITH REFERENCE OBJECT OF BOOK CLASS
 */

package spring.core;

public class Student {

	// creating book variable 
	private book book;
	public book getBook() {
		return book;
	}

	// setter-based dependency injection
	public void setBook(book book) {
		this.book = book;
	}
	
	public void reading() {	
		book.bookName();
		System.out.println("I am reading.");
	}
}
