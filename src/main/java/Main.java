public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "Author1", "isbn1");
        Book book2 = new Book("Book2", "Author2", "isbn2");
        Book book3 = new Book("Book3", "Author3", "isbn3");
        Book[] bookList = {book1, book2, book3};
        Library library = new Library(bookList);
        System.out.println(library);
    }
}
