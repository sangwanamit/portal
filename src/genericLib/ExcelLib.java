package genericLib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {

	private XSSFWorkbook wb ;
	private XSSFSheet sheet1 ;
	
	public String readData(int row, int cell) throws Exception {

		
		File src = new File(".//res/" + CommonLib.getWorkbookName());
		
		FileInputStream fis=new FileInputStream(src);
		 
		wb = new XSSFWorkbook(fis);
		sheet1 =  wb.getSheet(CommonLib.getSheetName());
		
		try
		{
			String cellData = sheet1.getRow(row).getCell(cell).getStringCellValue();
		
			return cellData;

		}catch (Exception NullPointerException) 
		{
			return null ;
		}
		finally {
			fis.close();
		}	
		
		}

	public void showExcelData(int sheetIndex) {
				
		File src = new File(".//res/" + CommonLib.getWorkbookName());
		try {
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet1 = wb.getSheetAt(sheetIndex);
		
		int RowCount = sheet1.getLastRowNum() - 1;
		for(int i = 0 ; i < RowCount ; i ++ ) {
			int cellCount = sheet1.getRow(i).getLastCellNum() -1 ;
			
			for(int j = 0 ; j <= cellCount ; j++ ) {
				if(sheet1.getRow(i).getCell(j).getStringCellValue() == null ) {
						continue;
				}else {
				
				System.out.print(sheet1.getRow(i).getCell(j).getStringCellValue() + "	");
				}
 			}
			System.out.println("");
		} 
 
		}
		catch(Exception E) {
			System.out.println(E.getMessage());
	
		}
		
		
		
	}
	
	
}
