
public class BookDB {
	
	public BookClass getBook(String sku){
		
		BookClass a = new BookClass();
		
		if (sku.equalsIgnoreCase("JAVA1001")) {
			a.setAuthor("KathySierra");
			a.setBookname("Head First in JAVA");
			a.setDescription("JAVA Basics");
			
		}
		else if(sku.equalsIgnoreCase("JAVA1002")) {
			a.setAuthor("Bates");
			a.setBookname("Java Advanced");
			a.setDescription("HighLevelJAva");
			
		}
		return a;
	}

}
