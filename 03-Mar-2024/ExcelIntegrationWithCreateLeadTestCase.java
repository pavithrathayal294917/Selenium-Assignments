package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegrationWithCreateLeadTestCase {

	public static String[][] excelValue() throws IOException {
		
		// static keyword is retained to have common reference or common data
		
		
		XSSFWorkbook wb=new XSSFWorkbook("./dataSheet/ExcelData.xlsx");
		XSSFSheet sheet=wb.getSheetAt(0); 
		int rowCount=sheet.getLastRowNum();
		int cellCount=sheet.getRow(1).getLastCellNum(); 
		String[][] data =new String[rowCount][cellCount];
		for (int i =1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String dataValue=sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=dataValue;
				
			}
			
		}
		wb.close();
		return data;

	}

}
