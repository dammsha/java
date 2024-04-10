package org.example;

import org.example.Literature.Book;
import org.example.Literature.BookGenerator;
import org.example.User.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Library {
    private User user;
    private BookGenerator bookGenerator=new BookGenerator();
    private ArrayList<Book> booksOnHandsList=new ArrayList<>();
    private Random random=new Random();
    public Library(User user) throws IOException {
        this.user = user;
        this.booksOnHandsList=createBooksOnHandList();
    }

    private ArrayList<Book> createBooksOnHandList() {
        int k=random.nextInt(3,10);
            for(int i=0;i<=k;i++){
                int b=random.nextInt(0,BookGenerator.bookList.size());
                if(!booksOnHandsList.contains(BookGenerator.bookList.get(b))){
                    booksOnHandsList.add(BookGenerator.bookList.get(b));
                }
        }
        return booksOnHandsList;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Book> getBooksOnHandsList() {
        return booksOnHandsList;
    }

}
