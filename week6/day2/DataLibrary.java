package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	
	public static String[][] readExcel(String fileName, int fileIndex) throws IOException {
	
		//Step 1: Open the excel File 
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//Step 2: Get sheet
		XSSFSheet sheet = wb.getSheetAt(fileIndex);
		
		//Step 3: Get the row count
		int rowCount = sheet.getLastRowNum();
		
		//Step 4: Get the column count
		int colCount = sheet.getRow(0).getLastCellNum();
		
		//Step 5 : Declare a 2D Array
		String[][] data = new String [rowCount][colCount];
				
		for(int i=1; i<=rowCount; i++) {// To iterate each row
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<colCount; j++) {// To iterate each cell in the row
				XSSFCell cell = row.getCell(j);// To get Cell from the sheet 
				String cellValue = cell.getStringCellValue();// To get data from the cell
				System.out.println(cellValue);
				data[i-1][j]= cellValue;
			}
		}
		wb.close();
		
		return data;
	}
	

}
