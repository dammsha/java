package excel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadWorkbook {
    FileInputStream file;
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    public ReadWorkbook() throws IOException {
        file = new FileInputStream("src/main/resources/фио.xlsx");
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheetAt(0);
    }

    public ArrayList readFromCell(int numberOfCell, ArrayList temp) throws IOException{
        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            if (row.getCell(numberOfCell) != null) {
                temp.add(row.getCell(numberOfCell).getStringCellValue());
            }
        }
        workbook.close();
        return temp;
    }
}
