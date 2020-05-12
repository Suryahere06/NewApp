package com.iPivot.DataDrivenApp.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

/*public class ExcelReader {
	
	static ReadPropertiesFile prop=new ReadPropertiesFile();
	Logger log=Logger.getLogger(ExcelReader.class);
	static FileInputStream fis=null;
	
	public FileInputStream getFileInputStream()
	{
		
			try {
			String 	filepath = prop.readPropFileByKey("filepath");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		File srcfile=new File(filepath);
		fis=new FileInputStream(srcfile);
		log.fatal("TestData File is not found.Terminating process.Check configuration filepath");
		System.exit(0);
		return fis;
	}
	
public Object[][] getExcelData() {
	fis= getFileInputStream();
	
	XSSFWorkbook wb=XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	
	int TotalNumberOfRows=(sheet.getLastRowNum);
	int TotalNumberOfCols=2;
	
	String[][] arrayExcelData=new String[TotalNumberOfRows][TotalNumberOfCols];
	for(int i=0;i<TotalNumberOfRows;i++) {
		for(int j=0;j<TotalNumberOfCols;j++) {
			XSSFRow row=sheet.getRow(i);
			arrayExcelData[i][j]=row.getCell(j).toString();
			
			
		}
	}
		
	wb.close();
	return arrayExcelData;
	
	
}

}*/
