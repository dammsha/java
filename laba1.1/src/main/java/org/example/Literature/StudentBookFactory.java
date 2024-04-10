package org.example.Literature;

public class StudentBookFactory implements BookFactory{
    public Book createRusStudentBook() {
        return new RusStudentBook();
    }
    public Book createEngStudentBook() {
        return new EngStudentBook();
    }
    @Override
    public Book createEngBook(Book book) {
        return createEngStudentBook();
    }

    @Override
    public Book createRusBook(Book book) {
        return createRusStudentBook();
    }
}
