package org.example.Literature;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BookGenerator {
    BookFactory fictionBookFactory=new FictionBookFactory();
    BookFactory studentBookFactory=new StudentBookFactory();
    public static ArrayList<Book> bookList=new ArrayList<>();
    private Random random= new Random();
    public BookGenerator() throws IOException {
        this.bookList=createBookList();
    }

    private ArrayList<Book> createBookList() throws IOException {
        int k= random.nextInt(25,30);
        for(int i=0;i<=k;i++){
            bookList.add(studentBookFactory.createEngBook(new EngStudentBook()));
            bookList.add(studentBookFactory.createRusBook(new RusStudentBook()));
            bookList.add(fictionBookFactory.createRusBook(new RusFictionBook()));
            bookList.add(fictionBookFactory.createEngBook(new EngFictionBook()));

        }
        return bookList;
    }
    public ArrayList<Book> getBookList(){
        return bookList;
    }

}
