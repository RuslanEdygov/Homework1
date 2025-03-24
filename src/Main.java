import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Михаил", "Булгаков");
        Author author2 = new Author("Лев", "Толстой");
        System.out.println("Первый автор - " + author1.getName() +
                " " + author1.getSurname());
        System.out.println("Второй автор - " + author2.getName() +
                " " + author2.getSurname());
        Book book1 = new Book("Мастер и Маргарита", author1, 1940);
        Book book2 = new Book("Война и мир", author2, 1868);
        System.out.println("Первая книга - " + book1.getBookTitles() + " автор " + author1.getName() +
                " " + author1.getSurname() + " год публикации " + book1.getYearBookPublic());
        System.out.println("Вторая книга - " + book2.getBookTitles() + " автор " + author1.getName() +
                " " + author2.getSurname() + " год публикации " + book2.getYearBookPublic());
        book1.setYearBookPublic(1996);
        System.out.println("Изменен год публикации первой книги = " + book1.getBookTitles() + " автор " + author1.getName() +
                " " + author1.getSurname() + " год публикации " + book1.getYearBookPublic());
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book1));
        for (Book book : Arrays.asList(book1, book2)) {
            System.out.println(book.hashCode());
        }
    }

}



