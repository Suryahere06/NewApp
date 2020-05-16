package com.iPivot.DataDrivenApp.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import org.apache.log4j.Logger;

public class ExcelReader {
	
	static ReadPropertiesFile prop=new ReadPropertiesFile();
	Logger log=Logger.getLogger(ExcelReader.class);
	 static FileInputStream fis=null;
	
	private void getFileInputStream()
	{
		String filepath;
 			try {
			  	filepath = prop.readPropFileByKey("filepath");
			
		File f=new File(System.getProperty("user.dir")+filepath);
		fis=new FileInputStream(f);
		
		 			}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			log.fatal("TestData File is not found.Terminating process.Check configuration filepath");

			e.printStackTrace();
		}
  	} 
	
public Object[][] getExcelData() throws IOException {
	getFileInputStream();
 	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	
	int TotalNumberOfRows=(sheet.getLastRowNum());
	int TotalNumberOfCols=2;
	
	String[][] arrayExcelData=new String[TotalNumberOfRows][TotalNumberOfCols];
	for(int i=0;i<TotalNumberOfRows;i++) {
		for(int j=0;j<TotalNumberOfCols;j++) {
			XSSFRow row=sheet.getRow(i);
			arrayExcelData[i][j]=row.getCell(j).toString();
			
			
		}
		
	
	}
		
	fis.close();
	return arrayExcelData;
	
	
}

}
