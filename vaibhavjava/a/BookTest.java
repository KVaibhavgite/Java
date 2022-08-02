public class BookTest {
    
    public static void main(String[] args) {
       /*/ String bookname = "English";
        int isbnnumber = 0445-2269 ;
        String author = "Carlos daymond" ;
        String publisher = "Sebek Frugal";
        String copyrightdate = "02-19-21";*/
       
        
       Book obj = new Book("marathi",0445-2269,"chetan bhagat","s s rao","29-02-1039");
      
  
     
         System.out.println(obj.getbookname());
		 obj.setBookname("bookname");
         System.out.println(obj.getisbnnumber());
		 obj.setIsbnnumber(1254);
         System.out.println(obj.getauther());
		  obj.setAuther("author");
         System.out.println(obj.getpublisher());
		 obj.setPublisher("publisher");
         System.out.println(obj.getcopyrightdate());
		  obj.setCopyrightdate("copyrightdate");
        System.out.println();
        System.out.println();
		System.out.println(obj.getbookname());
         System.out.println(obj.getisbnnumber());
         System.out.println(obj.getauther());
         System.out.println(obj.getpublisher());
         System.out.println(obj.getcopyrightdate());
       
    }

    
}
 class Book
{
	private String bookname;
	private int isbnnumber;
	private String auther;
	private String publisher;
	private String copyrightdate;
	public Book(String bookname, int isbnnumber, String auther, String publisher, String copyrightdate) {
		this.bookname=bookname;
		this.isbnnumber=isbnnumber;
		this.auther=auther;
		this.publisher=publisher;
		this.copyrightdate=copyrightdate;
	}
	public String getbookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getisbnnumber() {
		return isbnnumber;
	}
	public void setIsbnnumber(int isbnnumber) {
		this.isbnnumber = isbnnumber;
	}
	public String getauther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getpublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getcopyrightdate() {
		return copyrightdate;
	}
	public void setCopyrightdate(String copyrightdate) {
		this.copyrightdate = copyrightdate;
	}
	
	void  bookInformation()
	{ 
        System.out.println("\n Book name :"+bookname);
        System.out.println("\n ISBN number :" +isbnnumber);
        System.out.println("\n Author's name :"+auther);
        System.out.println("\n Publisher :"+publisher);
        System.out.println("\n Copyright Date :"+copyrightdate);
		
		
	}
	
}