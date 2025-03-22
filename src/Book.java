import java.util.Objects;

public class Book {
    private String bookTitles;
    private Author author;
    private int yearBookPublic;

    public Book(String bookTitles, Author author, int yearBookPublic) {
        this.bookTitles = bookTitles;
        this.author = author;
        this.yearBookPublic = yearBookPublic;

    }

    public String getBookTitles() {
        return bookTitles;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearBookPublic() {
        return yearBookPublic;
    }

    public void setYearBookPublic(int yearBookPublic) {
        this.yearBookPublic = yearBookPublic;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBookPublic == book.yearBookPublic && Objects.equals(bookTitles, book.bookTitles) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitles, author, yearBookPublic);
    }

    @Override
    public String toString() {
        return "Book{" +
                "yearBookPublic=" + yearBookPublic +
                ", bookTitles='" + bookTitles + '\'' +
                '}';
    }
}
