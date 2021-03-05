package DemoPackage;

public class Book {
	int bookid;
	String authorname;
	int price;
	
	public void init() {
		bookid = 101;
		authorname = "Roshan Kumar";
		price = 1200;
	}
	
	public void print() {
		System.out.print("Bookid = " + bookid + " AUTHOR NAME =" + authorname + " PRICE = " + price);
	}

	public static void main(String[] args) {
		
		Book b = new Book();
		b.init();
		b.print();

	}

}
