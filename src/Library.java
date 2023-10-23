import java.util.ArrayList;

public class Library
{
    private int LibraryId;
    private String LibrarianName;
    private ArrayList<String> BookSection;
    private ArrayList<Book> TotalBooks;
    public String LibraryDetails()
    {
        return "Library{" +
                "LibraryId=" + LibraryId +
                ", LibrarianName='" + LibrarianName + '\'' +
                ", BookSection='" + BookSection + '\'' +
                ", TotalBooks=" + TotalBooks.size() +
                '}';
    }
    public Book SearchBooks(String name)
    {
        for (Book b : TotalBooks) {
            if (b.bookName.toLowerCase() == name.toLowerCase())
            {
                return b;
            }
        }
        return null;
    }
    public Book SearchBooks(int BookId)
    {
        for (Book b : TotalBooks)
            if (b.BookId == BookId)
                return b;
        return null;
    }

    public boolean LendBooks(int StudentId, int BookId)
    {
        Book book = SearchBooks(BookId);
        if (book == null)
            return false;

        if (book.status == true)
            return false;

        return true;
    }

    public boolean ReturnBooks(int StudentId, int BookId)
    {
        Book book = SearchBooks(BookId);
        if (book == null)
            return false;

        if (book.status == true)
            return false;

        return true;
    }
    public String PayFine(int StudentId)
    {
        return null;
    }
}
class Book
{
    int BookId;
    String bookName;
    String authorName;
    boolean status;
    int page;
    int year;
}