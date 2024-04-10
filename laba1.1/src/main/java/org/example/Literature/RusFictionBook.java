package org.example.Literature;

import org.example.ReadExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RusFictionBook extends FictionBook implements RusLanguage {
    private String name;
    private Random random=new Random();
    private ArrayList<String> RusFictionBookList= new ArrayList<>();
    private ReadExcel wb=new ReadExcel();

    public RusFictionBook() throws IOException {
        super();
        this.RusFictionBookList=createRusFictionBookList();
        this.name=createName();

    }


    private String createName() {
        int sizeListRusFictionBook=RusFictionBookList.size();
        String name=String.valueOf(RusFictionBookList.get(random.nextInt(sizeListRusFictionBook)));
        return name;
    }
    private ArrayList<String> createRusFictionBookList() throws IOException {
        return wb.readColumn(8,RusFictionBookList);
    }


    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public String getName() {
        return name;
    }
}
