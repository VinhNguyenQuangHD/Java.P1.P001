package Exercise1;

public class Book {
    private String BookName;
    private int ISBNNumber;
    private String author;
    private String publisher;

    public Book(String bookName, int ISBNNumber, String author, String publisher) {
        BookName = bookName;
        this.ISBNNumber = ISBNNumber;
        this.author = author;
        this.publisher = publisher;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookInfo(){
        return BookName + " - " + ISBNNumber + " - " + author + " - "+ publisher;
    }
}
