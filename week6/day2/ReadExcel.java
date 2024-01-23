package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
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
		//First row
		
		//first data
		XSSFCell cell10 = sheet.getRow(1).getCell(0);
		String data00 = cell10.getStringCellValue();
		//second data
		XSSFCell cell11 = sheet.getRow(1).getCell(1);
		String data01 = cell11.getStringCellValue();
		//third data 
		XSSFCell cell12 = sheet.getRow(1).getCell(2);
		String data02 = cell12.getStringCellValue();
		//fourth data
		XSSFCell cell13 = sheet.getRow(1).getCell(3);
		String data03 = cell13.getStringCellValue();
		
		System.out.println("==================================");
		for(int i=1; i<=rowCount; i++) {// To iterate each row
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<colCount; j++) {// To iterate each cell in the row
				XSSFCell cell = row.getCell(j);// To get Cell from the sheet 
				String cellValue = cell.getStringCellValue();// To get data from the cell
				System.out.println(cellValue);
			}
			
		}
		wb.close();// Mandatory 
	}
	
	
}
