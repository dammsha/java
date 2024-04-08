package libraryCard;

import book.Book;
import book.Library;
import people.Person;

import java.util.ArrayList;
import java.util.Random;

public class LibraryCard {
    private Person user;
    private Random rm = new Random();
    private Library library = new Library();
    private ArrayList<Book> borrowedBooksList = new ArrayList<>();

    public LibraryCard(Person user) {
        this.user = user;
        this.borrowedBooksList = generateBorrowedBooksList();
    }

    public ArrayList<Book> generateBorrowedBooksList() {
        int rm1 = rm.nextInt(3, 10);
        int lenghtLibraryBooks = library.books.size() - 1;
        for (int i = 0; i <= rm1; i++) {
            int rm2 = rm.nextInt(0, lenghtLibraryBooks);
            borrowedBooksList.add(library.books.get(rm2));
        }
        return removeDublicate(borrowedBooksList);
    }

    public ArrayList<Book> removeDublicate(ArrayList<Book> books){
        ArrayList<Book> newBooks = new ArrayList<>();
        for(Book book : books){
            if(!newBooks.contains(book)){
                newBooks.add(book);
            }else{
                System.out.println("У " + user.getName() + " книга " + book.getName() + " уже есть!");
            }
        }
        return newBooks;
    }

    public Person getUser() {
        return user;
    }

    public ArrayList<Book> getBorrowedBooksList() {
        return borrowedBooksList;
    }
}
