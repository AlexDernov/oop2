import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "Author1", "isbn1");
        Book book2 = new Book("Book2", "Author2", "isbn2");
        Book book3 = new Book("Book3", "Author3", "isbn3");
        Book book4 = new Book("Book4", "Author3", "isbn4");
        List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3));
       /* oder
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);*/
        Library library = new Library(bookList);
        System.out.println(library);
        library.addBook(book4, 1);
        System.out.println(library);
        library.deleteBook(3);
        System.out.println(library);

    }
}
