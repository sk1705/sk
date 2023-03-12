package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class e1 {
	
	// apache poi, apache poi ooxml, apache poi ooxml schema
	@Test
	public void r1() throws IOException
	{
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		//reading
		// number of rows
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		// number of columns in row o
		int cell=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in first row "+ cell);
		// row index, col index 5,2
		XSSFCell data = sheet.getRow(5).getCell(2);
		System.out.println(data);
		
		//62,4
		sheet.getRow(62).createCell(4).setCellValue("SELVA");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
	}

}
