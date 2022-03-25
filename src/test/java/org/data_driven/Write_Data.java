package org.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\gopal\\Desktop\\Book1.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("Ranjith").createRow(0).createCell(0).setCellValue("FaceBook");
		
		wb.getSheet("Ranjith").getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("Ranjith").createRow(1).createCell(0).setCellValue("ranjithkumar");
		
		wb.getSheet("Ranjith").getRow(1).createCell(1).setCellValue("473257324");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("Successfully data enter");

	}

}
