package testleafweb;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb=new XSSFWorkbook("./data/createlead.xlsx");
		
		//idetify worksheet
		XSSFSheet sheet = wb.getSheet("sheet1");
		
	//	XSSFRow row = sheet.getRow(1);
		
//	XSSFCell cell = row.getCell(0);
		
		//read the cell string data
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("count="+lastRowNum);
		for (int i = 1; i <=lastRowNum; i++) {
			for(int j=0;j<=2;j++) {
			String text = sheet.getRow(i).getCell(j).getStringCellValue();
			
			System.out.println(text);
		}
		
		
	

	}
	
wb.close();
}}
