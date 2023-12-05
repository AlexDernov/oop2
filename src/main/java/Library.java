//import java.util.Arrays;
import java.util.List;

public class Library {
   // private Book[] books;
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    public void addBook(Book book, int index){
        this.books.add( index, book);
    }
    public void deleteBook(Book book){
        this.books.remove(book);
    }
    public void deleteBook(int index){
        this.books.remove(index);
    }

    /* public Library(Book[] books) {
            this.books = books;
        }*/
    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
   /* @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }*/

}
