public class Book{
    //Fields for the book;
    private String Author, Title, ISBN;
    //constructs an empty book, with no author, title, or ISBN;
    public Book(){
	Author = "";
	Title = "";
	ISBN ="";
    }
    //constructs a book with an Author, Title, and ISBN of the user's choice;
    public Book(String Author, String Title, String ISBN){
	this.Author = Author;
	this.Title = Title;
	this.ISBN = ISBN;
    }
    //Functions that get information about the book;
    public String getAuthor(){
	return Author;
    }
    public String getTitle(){
	return Title;
    }
    public String getISBN(){
	return ISBN;
    }
    //Functions that set information about the book;
    public void setAuthor(String Author){
	this.Author = Author;
    }
    public void setTitle(String Title){
	this.Title = Title;
    }
    public void setISBN(String ISBN){
	this.ISBN = ISBN;
    }
    //toString function prints Book information in the format Title,Author,ISBN;
    public String toString(){
	String answer = "";
	answer+= Title + ", " + Author + ", " + ISBN;
	return answer;
    }
}
