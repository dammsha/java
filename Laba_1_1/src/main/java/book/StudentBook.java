package book;

public abstract class StudentBook implements Book {
    private String name;
    private String type;

    StudentBook() {
        this.type = "Учебная литература";
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getType() {
        return type;
    }

}
