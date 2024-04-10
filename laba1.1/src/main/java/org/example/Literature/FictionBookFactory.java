package org.example.Literature;

import java.io.IOException;

public class FictionBookFactory implements BookFactory{
    public Book createEngFictionBook() throws IOException {
        return new EngFictionBook();
    }
    public Book createRusFictionBook() throws IOException {
        return new RusFictionBook();
    }
    @Override
    public Book createEngBook(Book book) throws IOException {
        return createEngFictionBook();
    }

    @Override
    public Book createRusBook(Book book) throws IOException {
        return createRusFictionBook();
    }


}
