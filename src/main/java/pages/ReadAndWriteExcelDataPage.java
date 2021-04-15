package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteExcelDataPage {
    File file = new File("D:\\twic_Automation\\src\\main\\java\\pages\\ReadAndWriteExcelDataPage.java");
    FileInputStream fileInputStream = new FileInputStream(file);
    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
   // XSSFSheet sheet = new XSSFSheet("Login");
    public ReadAndWriteExcelDataPage() throws IOException {
    }
}
