package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT {

	public static void main(String[]arge) throws EncryptedDocumentException, IOException {
		
		
	FileInputStream f=new FileInputStream("C:\\Users\\Rushikesh\\Desktop\\Book1.xlsx");
	
	Workbook w=WorkbookFactory.create(f);
	String user=w.getSheet("user").getRow(1).getCell(0).getStringCellValue();
	double pass=w.getSheet("user").getRow(1).getCell(1).getNumericCellValue();
	double pass1=w.getSheet("user").getRow(2).getCell(1).getNumericCellValue();
	System.out.println(user);
	System.out.println(pass);
	System.out.println(pass1);
	
	
	}
}
