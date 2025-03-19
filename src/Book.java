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
}
