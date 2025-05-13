import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", "Лев Толстой", 1869, 1225);
        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", 1866, 672);
        Book book3 = new Book("Анна Каренина", "Лев Толстой", 1877, 864);
        Book book4 = new Book("Отцы и дети", "Иван Тургенев", 1862, 288);
        Book book5 = new Book("Мастер и Маргарита", "Михаил Булгаков", 1967, 384);
        Book book6 = new Book("Евгений Онегин", "Александр Пушкин", 1833, 240);
        Book book7 = new Book("Мёртвые души", "Николай Гоголь", 1842, 352);
        Book book8 = new Book("Герой нашего времени", "Михаил Лермонтов", 1840, 224);
        Book book9 = new Book("Идиот", "Фёдор Достоевский", 1869, 640);
        Book book10 = new Book("Капитанская дочка", "Александр Пушкин", 1836, 320);

        List<Student> students = Arrays.asList(
                new Student("Анна", Arrays.asList(book1, book2, book3, book4, book5)),
                new Student("Иван", Arrays.asList(book2, book3, book6, book7, book8)),
                new Student("Мария", Arrays.asList(book3, book4, book5, book9, book10)),
                new Student("Пётр", Arrays.asList(book1, book5, book7, book8, book10))
        );

        System.out.println("Студенты и их книги:");
        for (Student student : students) {
            System.out.println("\nСтудент: " + student);
            System.out.println("Книги:");
            for (Book book : student.getBooks()) {
                System.out.println("- " + book.getTitle() +
                        " (" + book.getAuthor() + ", " + book.getYear() + ")");
            }
        }
    }
}
