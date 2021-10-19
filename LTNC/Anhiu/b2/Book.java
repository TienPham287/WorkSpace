package b2;

public class Book extends Document{
private String author;
private int numberPage;
public Book(String id, String nxb, int number, String author, int numberPage) {
	super(id, nxb, number);
	this.author = author;
	this.numberPage = numberPage;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getNumberPage() {
	return numberPage;
}
public void setNumberPage(int numberPage) {
	this.numberPage = numberPage;
}
@Override
public String toString() {
	return "Book [author=" + author + ", numberPage=" + numberPage + ", id=" + id + ", nxb=" + nxb + ", number="
			+ number + "]";
}

}
