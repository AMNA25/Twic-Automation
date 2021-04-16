package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteExcelDataPage {
    public String readData(int rowValue, int cellValue) throws IOException {
        File file = new File("src/main/java/utils/Twic-data.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Login");
        XSSFRow row = sheet.getRow(rowValue);
        XSSFCell cell = row.getCell(cellValue);
        String value = cell.getStringCellValue();
        return value;
    }
}
