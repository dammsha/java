package org.example.User;

import java.io.IOException;

public class UserFactory {
    public static User createUser(String who) throws IOException {
        if (who.equals("профессор")){
            return new Professor();
        }else {
            return new Student();
        }
    }
}
