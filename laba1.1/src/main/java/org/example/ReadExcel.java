package org.example;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadExcel {
    FileInputStream file;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    public ArrayList selectedColumn;


    public ReadExcel() throws IOException {
        file= new FileInputStream("ФИОлаба1.xlsx");
        wb = new XSSFWorkbook(file);
        sheet=wb.getSheetAt(0);
    }
    public ArrayList readColumn(int columnNumber,ArrayList selectedColumn) throws IOException {
        Iterator<Row> rowIter = sheet.iterator();
        while (rowIter.hasNext()) {
            Row row = rowIter.next();
            if (row.getCell(columnNumber)!=null){
                selectedColumn.add(row.getCell(columnNumber).getStringCellValue());
            }
        }
        wb.close();
        return selectedColumn;
    }

}
