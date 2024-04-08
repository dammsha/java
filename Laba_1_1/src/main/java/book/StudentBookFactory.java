package book;

public class StudentBookFactory implements BookFactory{
    @Override
    public Book createEngBook() {
        return new EngStudentBook();
    }
    @Override
    public Book createRusBook() {
        return new RusStudentBook();
    }
}
