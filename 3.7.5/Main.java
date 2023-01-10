import java.util.ArrayList;

public class Main
{
  public static void main(String[] arg)
  {
    String authorToFind = "L. Frank Baum";
    Library lib = new Library();
    ArrayList<Book> books = lib.getChildrensBooks();

    for (Book book : books) {
        if (book.getAuthor().equals(authorToFind)) {
            System.out.println(book.getTitle());
        }
    }
  }
}
