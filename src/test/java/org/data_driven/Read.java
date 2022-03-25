package org.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	
	public static void particular_Cell_Data() throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\gopal\\eclipse-workspace\\Maven_practics\\testcase.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(2);
		
		Cell c = r.getCell(1);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			String value = c.getStringCellValue();
			
			System.out.println(value);
			
		}
		
		else if (type.equals(CellType.NUMERIC)) {
			
			double nvalue = c.getNumericCellValue();
			
			int v= (int) nvalue;   
			
			System.out.println(v);
			
		}
		
		wb.close();
		

	}
	
	public static void all_Data() throws IOException {
		// TODO Auto-generated method stub
		
        File f=new File("C:\\Users\\gopal\\eclipse-workspace\\Maven_practics\\testcase.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
				
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);      //i reference row index
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);         //j reference column index
				
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) {
					
					String svalue = c.getStringCellValue();
					System.out.println(svalue);	
								
					
					}
				else if (type.equals(CellType.NUMERIC)) {
					
					double nvalue = c.getNumericCellValue();
					
					int v = (int) nvalue;
					
					String sva = Integer.toString(v);
					
					System.out.println(sva);
					
				}
				
				
			}
			
		}		
		
		wb.close();

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//particular_Cell_Data();
		
		all_Data();

	}

}
