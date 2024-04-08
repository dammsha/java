package book;

import faker.Fakers;

import java.util.ArrayList;
import java.util.Random;

public class RusFictionBook extends FictionBook implements RussianLanguage{
    private String name;
    Fakers faker = new Fakers();

    public RusFictionBook() {
        this.name = createName();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    public String createName() {
        return faker.generateRusBookName();
    }
}
