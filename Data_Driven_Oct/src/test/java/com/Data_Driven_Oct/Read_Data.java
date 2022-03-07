package com.Data_Driven_Oct;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void particular_Data() throws IOException {
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Data_Driven_Oct\\User_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);// upcasting
		
		Sheet sheetAt = w.getSheetAt(0);
		
		Row row = sheetAt.getRow(3);
		
		Cell cell = row.getCell(0);
		
		System.out.println("************ Particular_Data**********");
		
		CellType cellType = cell.getCellType();// Enum - CellType
		
		if (cellType.equals(CellType.STRING)) { // refname.equal(Enum.STRING)
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (cellType.equals(CellType.NUMERIC)) {// refname.equal(Enum.STRING)
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;// Norrowingcasting
			System.out.println(value);
		}
	}
	public static void all_Data() throws IOException {
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Data_Driven_Oct\\User_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);// upcasting
		Sheet sheetAt = w.getSheetAt(0);
		System.out.println("\n"+"************ ALL_DATA**************");
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < NumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int NumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < NumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();// Enum - CellType
				if (cellType.equals(CellType.STRING)) { // refname.equal(Enum.STRING)
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (cellType.equals(CellType.NUMERIC)) {// refname.equal(Enum.STRING)
					double numericCellValue = cell.getNumericCellValue();
					int value = (int) numericCellValue;// Norrowingcasting
					System.out.println(value);
				}
			}
		}
	}

	public static void particular_Row() throws IOException {
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Data_Driven_Oct\\User_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);// upcasting
		Sheet sheetAt = w.getSheetAt(0);
		
		System.out.println("\n" + "************ Particular_Row***********");
		Row row = sheetAt.getRow(3);
		int NumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < NumberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();// Enum - CellType
			if (cellType.equals(CellType.STRING)) { // refname.equal(Enum.STRING)
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (cellType.equals(CellType.NUMERIC)) {// refname.equal(Enum.STRING)
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;// Norrowingcasting
				System.out.println(value);
			}
		
		}
	}

	public static void particular_Cell() throws IOException {
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Data_Driven_Oct\\User_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);// upcasting
		Sheet sheetAt = w.getSheetAt(0);
		System.out.println("\n"+"************ Particular_Cell***********");
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < NumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(1);

			CellType cellType = cell.getCellType();// Enum - CellType
			if (cellType.equals(CellType.STRING)) { // refname.equal(Enum.STRING)
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (cellType.equals(CellType.NUMERIC)) {// refname.equal(Enum.STRING)
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;// Norrowingcasting
				System.out.println(value);
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		particular_Data();
		all_Data();
		particular_Row();
		particular_Cell();
	
	}
}
