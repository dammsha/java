package book;

public class FictionBookFactory implements BookFactory{
    @Override
    public Book createEngBook() {
        return new EngFictionBook();
    }
    @Override
    public Book createRusBook() {
        return new RusFictionBook();
    }
}
