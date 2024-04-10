package org.example.Literature;

public abstract class StudentBook implements Book{
    private String type;
    private String name;
    StudentBook(){
        this.type="учебная литература";

    }


    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
