package people;

import java.io.IOException;

public class UserFactory {
    public static Person createUser(String what) throws IOException {
        if (what.equals("Студент")) {
            return new Student();
        } else if (what.equals("Преподаватель")) {
            return new Professor();
        } else {
            throw new IllegalArgumentException("Неизвестный тип пользователя: " + what);
        }
    }
}