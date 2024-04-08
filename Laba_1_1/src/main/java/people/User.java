package people;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class User {
    ArrayList<Person> users = new ArrayList<>();
    Random rm = new Random();
    public User() throws IOException {
        this.users = createUserList();
    }
    public ArrayList<Person> createUserList() throws IOException {
        for (int i = 0; i < 30; i++) {
            boolean j = rm.nextBoolean();
            if (j) {
                users.add(UserFactory.createUser("Студент"));
            } else {
                users.add(UserFactory.createUser("Преподаватель"));
            }
        }
        return users;
    }

    public ArrayList<Person> getUsers() {
        return users;
    }
}
