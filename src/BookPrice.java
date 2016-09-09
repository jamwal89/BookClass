import java.util.*;
public class BookPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDB db = new BookDB();
		System.out.println("Enter the Sku");
		Scanner sc =new Scanner (System.in);
		String sku= sc.nextLine();
		BookClass b= db.getBook(sku);
		System.out.println(b.getDisplay());
		

	}

}
