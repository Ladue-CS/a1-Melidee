import java.util.ArrayList;

public class Main {
  public static void main(String[] arg) {
    Library lib = new Library();
    ArrayList<Book> books = lib.getChildrensBooks();

    String authorToFind = "L. Frank Baum";
    String bookToFind = "Sky Island";
    Double minimumRating = 0.0;

    for (Book book : books) {
        if (book.getAuthor().equals(authorToFind)) {
            System.out.println(book.getTitle());
        }
    }

    for (Book book : books) {
        if (book.getTitle().equals(bookToFind)) {
            minimumRating = book.getRating();
        }
    }
  }
}
