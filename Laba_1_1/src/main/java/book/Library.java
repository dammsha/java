package book;

import java.util.ArrayList;
import java.util.Random;

public class Library {
    private Random rm1 = new Random();
    private Random rm2 = new Random();
    BookFactory studentBookFactory = new StudentBookFactory();
    BookFactory fictionBookFactory = new FictionBookFactory();
    public ArrayList<Book> books = new ArrayList<>();

    public Library() {
        this.books = generateBookList();
    }

    public ArrayList<Book> generateBookList() {

        int rm11 = rm1.nextInt(30, 40);
        int rm22 = rm2.nextInt(20, 30);
        for (int i = 0; i <= rm11; i++) {
            books.add(studentBookFactory.createRusBook());
            books.add(fictionBookFactory.createRusBook());
        }
        for (int i = 0; i <= rm22; i++) {
            books.add(studentBookFactory.createEngBook());
            books.add(fictionBookFactory.createEngBook());
        }
          return books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
