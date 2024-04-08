package faker;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;

public class Fakers {
    Faker fakerRu = new Faker(new Locale("ru"));
    Faker fakerEn = new Faker(new Locale("en"));

    public String generateRusBookName() {
        String title = fakerRu.book().title();
        String author = fakerRu.book().author();
        String genre = fakerRu.book().genre();
        String name = "Название: " + title + ". Автор: " + author + ". Жанр: " + genre;
        return name;
    }

    public String generateEngBookName() {
        String title = fakerEn.book().title();
        String author = fakerEn.book().author();
        String genre = fakerEn.book().genre();
        String name = "Название" + title + ". Автор: " + author + ". Жанр: " + genre;
        return name;
    }

}
