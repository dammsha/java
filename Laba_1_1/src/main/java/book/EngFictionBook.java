package book;


import faker.Fakers;

import java.util.ArrayList;
import java.util.Random;

public class EngFictionBook extends FictionBook implements EnglishLanguage{
    private String name;
    Fakers faker = new Fakers();

    EngFictionBook() {
        this.name = createName();
    }

    public String getName() {return name;}

    public String getLanguage() {
        return language;
    }

    public String createName() {
        return faker.generateEngBookName();
    }
}
