package org.example.User;

import org.example.ReadExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Professor extends User{
    private String name;
    private String surname;
    private String patronymic;
    private String type;
    private boolean sex;
    private ReadExcel wb = new ReadExcel();
    Random random=new Random();
    private ArrayList<String> professorSurnameList = new ArrayList<>();
    private ArrayList<String> womenPatronymicList = new ArrayList<>();
    private ArrayList<String> menPatronymicList = new ArrayList<>();




    public Professor() throws IOException {
        super();
        this.sex=random.nextBoolean();
        this.name = createName(this.sex);
        this.professorSurnameList = createProfessorSurnameList();
        this.surname = createProfessorSurname(this.sex);
        this.menPatronymicList=createMenPatronymicList();
        this.womenPatronymicList=createWomenPatronymicList();
        this.patronymic = createPatronymic(this.sex);

        this.type="преподаватель";
    }
    public String createProfessorSurname(boolean sex) {
        int sizeProfessorSurname = professorSurnameList.size();
        if (sex) {
            String surname = String.valueOf(professorSurnameList.get(random.nextInt(sizeProfessorSurname)));
            return surname+"а";
        } else {
            String surname = String.valueOf(professorSurnameList.get(random.nextInt(sizeProfessorSurname)));
            return surname;
        }
    }
    public String createPatronymic(boolean sex) {
        int sizeWomenPatronymic = womenPatronymicList.size();
        int sizeMenPatronymic = menPatronymicList.size();
        if (sex) {
            String patronymic = String.valueOf(womenPatronymicList.get(random.nextInt(sizeWomenPatronymic)));
            return patronymic;
        } else {
            String patronymic = String.valueOf(menPatronymicList.get(random.nextInt(sizeMenPatronymic)));
            return patronymic;
        }
    }
    public ArrayList<String> createProfessorSurnameList() throws IOException {
        return wb.readColumn(6, professorSurnameList);
    }
    public ArrayList<String> createWomenPatronymicList() throws IOException {
        return wb.readColumn(4, womenPatronymicList);
    }
    public ArrayList<String> createMenPatronymicList() throws IOException {
        return wb.readColumn(3, menPatronymicList);
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
    @Override
    public String getType() {
        return type;
    }
}
