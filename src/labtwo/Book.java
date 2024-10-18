package labtwo;

public class Book {
	private String title, author;
	int price, count;

    public Book(String title) {
        this.title=title;
        this.author="작자미상";
    }

    public Book(String title,String author) {
        this.title=title;
        this.author=author;
    }
    
    public Book(String title,String author,int price,int count) {
    	this.title=title;
        this.author=author;
        this.price=price;
        this.count=count;
	}
    
    public String extractTitle() {
    	return title;
    }
    
    public int sumPrice() {
    	return price*count;
    }
        
    public void showBookInfosimple() {
        System.out.println(title + " " + author);
    }
    
    public void showBookInfo() {
        System.out.println(title + ", " + author+", "+price +"원, "+count+"권");
    }
   
}
