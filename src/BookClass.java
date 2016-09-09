

public class BookClass {

	private String bookname, author, description ;
	
	public BookClass() {
		System.out.println("This is the Book Application");
	}
	
	public String getBookname(){
		return bookname;
	}
	
	public void setBookname(String bookname){
		this.bookname=bookname;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void  setAuthor(String author) {
		this.author= author;
	}
		
	public String getDescription () {
		 return description;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	public String getDisplay() {
		return (bookname+author+description);
	}
	
	
	
}



