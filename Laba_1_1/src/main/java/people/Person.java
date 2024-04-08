package people;

import excel.ReadWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public abstract class Person {
    private String name;
    private String lastName;
    private String type;
    private int id;
//    женщины будут true
    private boolean sex;
    private String middleName;
    private Random rm = new Random();
    private ArrayList<String> manNameList = new ArrayList<>();
    private ArrayList<String> womanNameList = new ArrayList<>();
    private ReadWorkbook workbook = new ReadWorkbook();

    Person() throws IOException {
        this.manNameList = createManNameList();
        this.womanNameList = createWomanNameList();
        this.sex = rm.nextBoolean();
        this.name = createName(this.sex);
        this.id = id;
        this.middleName = "";
    }

    public String createName(boolean sex) {
        int lenghtMan = manNameList.size();
        int lenghtWoman = womanNameList.size();

        if (sex) {
            String name = String.valueOf(womanNameList.get(rm.nextInt(lenghtWoman)));
            return name;
        } else {
            String name = String.valueOf(manNameList.get(rm.nextInt(lenghtMan)));
            return name;
        }
    }
    public ArrayList<String> createManNameList() throws IOException {
        return workbook.readFromCell(0, manNameList);
    }
    public ArrayList<String> createWomanNameList() throws IOException {
        return workbook.readFromCell(2, womanNameList);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getType() {
        return "unknown type of person";
    }

    public int getId() {
        return id;
    }

    public String getMiddleName() {return middleName;}

}
