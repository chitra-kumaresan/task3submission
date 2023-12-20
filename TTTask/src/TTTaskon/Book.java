package TTTaskon;

public class Book {
    public Integer bookid;
    public String title;

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public String author;

    public Boolean isAvailable;
    public Book(Integer bookid,String title,String author,Boolean isAvailable){
        this.bookid=bookid;
        this.title=title;
        this.author=author;
        this.isAvailable=isAvailable;

    }

    public Integer getBookid() {
        return bookid;
    }
}
