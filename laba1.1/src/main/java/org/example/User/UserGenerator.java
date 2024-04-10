package org.example.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class UserGenerator {
    ArrayList<User> users = new ArrayList<>();
    static Random random = new Random();

    public UserGenerator() throws IOException {
        this.users = createUserList();
    }

    public ArrayList<User> createUserList() throws IOException {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            boolean k = random.nextBoolean();
            if (k){
                users.add(UserFactory.createUser("профессор"));
            }else {
                users.add(UserFactory.createUser("студент"));
            }
        }
        return users;
    }

    public ArrayList<User> getUserList() {
        return users;
    }
}
