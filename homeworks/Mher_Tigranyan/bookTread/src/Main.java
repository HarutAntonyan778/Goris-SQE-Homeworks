import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("AAA", 15));
        books.add(new Book("BBB", 5));
        books.add(new Book("CCC", 7));

        User thread1 = new User("user1");
        thread1.start();
        User thread2 = new User("user2");
        thread2.start();
        thread1.getBook("AAA", 2, books);

    }


}
