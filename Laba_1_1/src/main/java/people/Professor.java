package people;

import excel.ReadWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Professor extends Person{
    private String name;
    private String lastName;
    private String middleName;
    private String type;
    private int id;
    private boolean sex;
    private Random rm = new Random();
    private ArrayList<String> manLastNameList = new ArrayList<>();
    private ArrayList<String> womanLastNameList = new ArrayList<>();
    private ArrayList<String> manMiddleNameList = new ArrayList<>();
    private ArrayList<String> womanMiddleNameList = new ArrayList<>();
    private String department;
    private ReadWorkbook workbook = new ReadWorkbook();

    Professor() throws IOException {
        this.sex = rm.nextBoolean();
        this.manLastNameList = createManLastNameList();
        this.womanLastNameList = createWomanLastNameList();
        this.manMiddleNameList = createManMiddleNameList();
        this.womanMiddleNameList = createWomanMiddleNameList();
        this.name = createName(this.sex);
        this.lastName = createLastName(this.sex);
        this.middleName = createMiddleName(this.sex);
        this.type = "Преподаватель";
        this.department = "Высшая математика";
        this.id = id;
    }

    public ArrayList<String> createManLastNameList() throws IOException {
        return workbook.readFromCell(8, manLastNameList);
    }

    public ArrayList<String> createWomanLastNameList() throws IOException {
        return workbook.readFromCell(10, womanLastNameList);
    }

    public ArrayList<String> createManMiddleNameList() throws IOException {
        return workbook.readFromCell(12, manMiddleNameList);
    }

    public ArrayList<String> createWomanMiddleNameList() throws IOException {
        return workbook.readFromCell(14, womanMiddleNameList);
    }

    public String createLastName(boolean sex) {

        int lenghtMan = manLastNameList.size();
        int lenghtWoman = womanLastNameList.size();

        if (sex) {
            String lastName = String.valueOf(womanLastNameList.get(rm.nextInt(lenghtWoman)));
            return lastName;
        } else{
            String lastName = String.valueOf(manLastNameList.get(rm.nextInt(lenghtMan)));
            return lastName;
        }
    }

    public String createMiddleName(boolean sex) {

        int lenghtMan = manMiddleNameList.size();
        int lenghtWoman = womanMiddleNameList.size();

        if (sex) {
            String middleName = String.valueOf(womanMiddleNameList.get(rm.nextInt(lenghtWoman)));
            return middleName;
        } else {
            String middleName = String.valueOf(manMiddleNameList.get(rm.nextInt(lenghtMan)));
            return middleName;
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

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getId() {
        return id;
    }
}
