package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class switchcase {
	public static void main(String[] args) throws IOException {
		// mention the path of excel
		File file=new File("C:\\Users\\ezhil\\eclipse-workspace\\maven\\Excel\\Book1.xlsx");
		// get the object
		FileInputStream stream=new FileInputStream(file);
		//create workbook
		Workbook workbook=new XSSFWorkbook(stream);
		//get the sheet
		Sheet sheet = workbook.getSheet("datas");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			//get the each row
			Row row = sheet.getRow(i);
			//iterate all cells
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			//get the each cell
				Cell cell = row.getCell(j);
		CellType Type = cell.getCellType();
		switch (Type) {
		case STRING:
			String value = cell.getStringCellValue();
			System.out.println(value);
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
		    SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/YYYY");
			String format = dateformat.format(dateCellValue);
            System.out.println(format);
			} 
			else {
			double d = cell.getNumericCellValue();
		    long check = Math.round(d);
		    if (check==d) {
				String v = String.valueOf(check);
				System.out.println(v);
			} else {
				String v1 = String.valueOf(d);
				System.out.println();

			}
//			BigDecimal b = BigDecimal.valueOf(d);
//			String num = b.toString();
//			System.out.println(num);
			}
			break;
			default:
			break;
		
		}
		
		
		
	}
}
}
}