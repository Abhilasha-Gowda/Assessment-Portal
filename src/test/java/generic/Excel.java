package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
public static String getdata(String sheet, int row, int cell)  {
		
		String val="";
		try {
			FileInputStream fin = new FileInputStream("./Excel/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fin);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			val = c.getStringCellValue();
			System.out.println(val);
		}catch(Exception e) {
			System.out.println("excel not found");
		}
			
			return val;
		
		
	}
public static void wite_data(String sheet, int row, int cell, String data) {
	try {
		FileInputStream fin = new FileInputStream("./Excel/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
        Cell c = wb.getSheet(sheet).getRow(row).createCell(cell);
        c.setCellValue(data);
        FileOutputStream fout = new FileOutputStream("./Excel/TestData.xlsx");
        wb.write(fout);
	}catch(Exception e) {
		System.out.println("excel not found");
	}
	
}

}
