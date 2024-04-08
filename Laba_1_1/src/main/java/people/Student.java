package people;

import excel.ReadWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Student extends Person{
    private String name;
    private String lastName;
    private String type;
    private int id;
    private boolean sex;
    private String middleName;
    private String numberOfGroup;
    private Random rm = new Random();
    private ArrayList<String> manLastNameList = new ArrayList<>();
    private ArrayList<String> womanLastNameList = new ArrayList<>();
    private String[] group = {"Б22-902", "Б23-803", "Б21-701", "Б20-320", "С22-602", "С23-403", "С21-301"};
    private ReadWorkbook workbook = new ReadWorkbook();
    Student() throws IOException {
        super();
        this.sex = rm.nextBoolean();
        this.manLastNameList = createManLastNameList();
        this.womanLastNameList = createWomanLastNameList();
        this.type = "Студент";
        this.name = createName(this.sex);
        this.lastName = createLastName(this.sex);
        this.numberOfGroup = group[rm.nextInt(0,group.length - 1)];
        this.middleName = "";
    }
    public ArrayList<String> createManLastNameList() throws IOException {
        return workbook.readFromCell(4, manLastNameList);
    }
    public ArrayList<String> createWomanLastNameList() throws IOException {
        return workbook.readFromCell(6, womanLastNameList);
    }
    public String createLastName(boolean sex) {
        int lenghtMan = manLastNameList.size();
        int lenghtWoman = womanLastNameList.size();

        if (sex) {
            String lastName = String.valueOf(womanLastNameList.get(rm.nextInt(lenghtWoman)));
            return lastName;
        } else {
            String lastName = String.valueOf(manLastNameList.get(rm.nextInt(lenghtMan)));
            return lastName;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getNumberOfGroup() {
        return numberOfGroup;
    }

}
