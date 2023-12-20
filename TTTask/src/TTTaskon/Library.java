package TTTaskon;

public class Library {

    static int index = 0;
    private static final int bottom = 0;
    private static final int top = 5;
    private static Book[] books;
    public void removeBook(int bookid) {
        books=new Book[5];
        displayBooks();
        if (books.length == bottom) {
            System.out.println("Books are empty");
        } else {
            int removedFile = 0;
            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookid() == bookid) {
                    removedFile = i;
                    break;
                }
                for (int j = removedFile; j < books.length - 1; j++) {
                    books[i] = books[i + 1];
                }

            }
            System.out.println("Book removed");
            System.out.println(displayBooks());
            index--;
        }
    }

    public void addBook(Book book){
        books = new Book[5];
        displayBooks();
        if (books.length != top) {
            books[index] =book;
            index++;
            System.out.println("add books");
            System.out.println(displayBooks());
        } else {
            System.out.println("Books are filled");
        }
            }

            public static Book displayBooks() {
                books = new Book[5];
                Book book1 = new Book(12, "Around the way", "stephen", true);
                Book book2 = new Book(45, "A detective diary", "Anvika", true);
                Book book3 = new Book(67, "that 20 years night", "Nidhi", true);
     //
                books[0] = book1;
                books[1] = book2;
                books[2] = book3;

                return books[index];
            }
            }



