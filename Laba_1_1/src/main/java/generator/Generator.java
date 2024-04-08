package generator;

import libraryCard.LibraryCard;
import people.Person;
import people.User;

import java.io.IOException;
import java.util.ArrayList;

public class Generator {
    User user;
    ArrayList<LibraryCard> libraryCardsList;

    public Generator() throws IOException {
        this.user = new User();
        this.libraryCardsList = generateLibraryCardsList();
    }

    public ArrayList<LibraryCard> generateLibraryCardsList() {
        ArrayList<LibraryCard> temp = new ArrayList<>();
        for (Person user: user.getUsers()) {
            temp.add(new LibraryCard(user));
        }
        return temp;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<LibraryCard> getLibraryCardsList() {
        return libraryCardsList;
    }
}
