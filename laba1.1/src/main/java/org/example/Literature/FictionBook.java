package org.example.Literature;

public abstract class FictionBook implements Book{
    private String name;
    private String type;
    FictionBook(){
        this.type="учебная";
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
