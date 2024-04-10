package org.example.User;

import org.example.ReadExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Student extends User{
    private String name;
    private String surname;
    private String patronymic;
    private String type;
    private boolean sex;
    private ReadExcel wb = new ReadExcel();
    Random random=new Random();
    private ArrayList<String> studentSurnameList = new ArrayList<>();
    public Student() throws IOException {
        super();
        this.sex=random.nextBoolean();
        this.name = createName(this.sex);
        this.studentSurnameList = createStudentSurnameList();
        this.surname = createStudentSurname(this.sex);
        this.patronymic = "";

        this.type="студент";
    }




    public String createStudentSurname(boolean sex) {
        int sizeStudentSurname = studentSurnameList.size();
        if (sex) {
            String surname = String.valueOf(studentSurnameList.get(random.nextInt(sizeStudentSurname)));
            return surname+"а";
        } else {
            String surname = String.valueOf(studentSurnameList.get(random.nextInt(sizeStudentSurname)));
            return surname;
        }
    }
    public ArrayList<String> createStudentSurnameList() throws IOException {
        return wb.readColumn(2, studentSurnameList);
    }
    @Override

    public String getType() {
        return type;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getPatronymic() {
        return patronymic;
    }
}
