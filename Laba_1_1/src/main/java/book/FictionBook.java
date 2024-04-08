package book;

public abstract class FictionBook implements Book{
    private String name;
    private String type;

    FictionBook() {
        this.type = "Художественная литература";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
