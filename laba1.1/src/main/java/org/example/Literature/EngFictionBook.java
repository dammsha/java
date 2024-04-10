package org.example.Literature;

import org.example.ReadExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class EngFictionBook extends FictionBook implements EngLanguage {
    private String name;
    private Random random=new Random();
    private ArrayList<String> EngFictionBookList= new ArrayList<>();
    private ReadExcel wb=new ReadExcel();

    public EngFictionBook() throws IOException {
        super();
        this.EngFictionBookList=createEngFictionBookList();
        this.name=createName();

    }


    private String createName() {
        int sizeListEngFictionBook=EngFictionBookList.size();
        String name=String.valueOf(EngFictionBookList.get(random.nextInt(sizeListEngFictionBook)));
        return name;
    }
    private ArrayList<String> createEngFictionBookList() throws IOException {
        return wb.readColumn(9,EngFictionBookList);
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
