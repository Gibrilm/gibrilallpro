package com.Data_Driven_Oct;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void write_data() throws IOException {
		File f = new File("C:\\Users\\USER\\Desktop\\pgm\\User_Write_Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet createSheet = wb.createSheet("credentials");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Username");
		
	//	wb.getSheet("credentials").createRow(0).createCell(0).setCellValue("Username");
		
		wb.getSheet("credentials").getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("credentials").createRow(1).createCell(0).setCellValue("Gibril");
		
		wb.getSheet("credentials").getRow(1).createCell(1).setCellValue("12345G");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();	
		
		System.out.println("Data written in excel sucessfully");
	}
public static void main(String[] args) throws IOException {
	write_data();
}
}


