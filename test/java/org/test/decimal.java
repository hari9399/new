package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class decimal {
	public static void main(String[] args) throws IOException {
		// mention the path of excel
		File file=new File("C:\\Users\\ezhil\\eclipse-workspace\\maven\\Excel\\Book1.xlsx");
		// get the object
		FileInputStream stream=new FileInputStream(file);
		//create workbook
		Workbook workbook=new XSSFWorkbook(stream);
		//get the sheet
		Sheet sheet = workbook.getSheet("datas");
//		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//			//get the each row
//			Row row = sheet.getRow(i);
//			//iterate all cells
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//			//get the each cell
//				Cell cell = row.getCell(j);
//			System.out.println(cell);
			Row row = sheet.getRow(4);
			Cell cell = row.getCell(10);
			double d = cell.getNumericCellValue();
			BigDecimal b = BigDecimal.valueOf(d);
			String num = b.toString();
			System.out.println(num);
			
			}
			
	//	}
	
		
		
		
		
	}
	

//}


