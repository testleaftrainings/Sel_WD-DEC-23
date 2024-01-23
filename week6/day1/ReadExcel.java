package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Step 1 --> Open the excel 
		XSSFWorkbook wb = new XSSFWorkbook("./data/createLead.xlsx");
		
		//Step 2 --> get the sheet 
		//wb.getSheet("Sheet1");// By using sheet name
		XSSFSheet sheet = wb.getSheetAt(0); // By using sheet index position starts from 0
		
		
		//Get the no of rows in the Excel
		int rowCount = sheet.getLastRowNum();
		System.out.println("rowCount  ---> " + rowCount);
		
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column count ---->  "  + colCount);

		String data11 = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("data[1][1]  --> " +data11);
		
		XSSFCell cell23 = sheet.getRow(2).getCell(3);
		String data23 = cell23.getStringCellValue();
		System.out.println(data23);
	}

}
