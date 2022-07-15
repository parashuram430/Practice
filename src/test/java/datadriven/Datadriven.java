/**
 * 
 */
package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author RAM
 *
 */
public class Datadriven {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("F://data1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum(); 
		int coldata=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++)
		{
		XSSFRow currentrow=sheet.getRow(i);
		for(int j=0;j<coldata;j++) {
		String exceldata=currentrow.getCell(j).toString();
		System.out.println( ' ' + exceldata);
		}
		
	}
		System.out.println();
		workbook.close();
	}
}
