import java.util.Scanner;
class Book {
	private String title;
	private String author;
	private String publiser;
	
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPubliser(String publiser) {
		this.publiser=publiser;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPubliser() {
		return publiser;
	}
}

public class P5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a title : ");
		String title = sc.nextLine();
		System.out.print("Enter a author : ");
		String author = sc.nextLine();
		System.out.print("Enter a publiser : ");
		String publiser = sc.nextLine();
		
		Book e = new Book();
		e.setTitle(title);
		e.setAuthor(author);
		e.setPubliser(publiser);
		System.out.println("the title of the book is : "+e.getTitle());
		System.out.println("the author of the book is : "+e.getAuthor());
		System.out.println("the publiser of the book is : "+e.getPubliser());
	}
}
