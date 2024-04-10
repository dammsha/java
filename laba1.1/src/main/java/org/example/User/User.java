package org.example.User;

import org.example.ReadExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public abstract class User {
    private String name;
    private String surname;
    private String patronymic;
    private String type;
    private boolean sex;
    private ArrayList<String> menNameList = new ArrayList<>();
    private ArrayList<String> womenNameList = new ArrayList<>();
    private ReadExcel wb = new ReadExcel();
    Random random=new Random();

    public User() throws IOException {
        this.sex=random.nextBoolean();
        this.menNameList = createMenNameList();
        this.womenNameList = createWomenNameList();
        this.name = createName(this.sex);
        this.type = "";
    }
    public String createName(boolean sex) {
        int sizeMenName = menNameList.size();
        int sizeWomenName = womenNameList.size();
        if (sex) {
            return String.valueOf(womenNameList.get(random.nextInt(sizeWomenName)));
        } else {
            return String.valueOf(menNameList.get(random.nextInt(sizeMenName)));
        }
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getPatronymic() {
        return patronymic;
    }

    public ArrayList<String> createWomenNameList() throws IOException {
        return wb.readColumn(0, womenNameList);
    }
    public ArrayList<String> createMenNameList() throws IOException {
        return wb.readColumn(1, menNameList);
    }
    public String getType() {
        return type;
    }
}
