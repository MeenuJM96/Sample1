package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	static FileInputStream f; 
	static XSSFWorkbook x;
	static XSSFSheet s;
	
	public static String getStringData(int a,int b) throws IOException {
		f=new FileInputStream("C:\\Users\\hp\\New folder\\Book1.xlsx");
		x=new XSSFWorkbook(f);
		s=x.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
	}
	public static String getIntegerData(int a,int b) throws IOException {
		f=new FileInputStream("C:\\Users\\hp\\New folder\\Book1.xlsx");
		x=new XSSFWorkbook(f);
		s=x.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int z=(int) c.getNumericCellValue();
		return String.valueOf(z);
	}
		
}