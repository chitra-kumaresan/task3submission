package TTTaskon;

public class BookManagementSystem {
    static int index = 0;
    private static final int bottom = 0;
    private static final int top = 5;
    private static Book[] books;


    public static void main(String[] args) {
        int index = 0;
        books = new Book[5];
        Library library=new Library();
       Library.displayBooks();
       library.addBook(new Book(45, "A detective diary", "Anvika", true));
        library.removeBook(67);

    }

}
