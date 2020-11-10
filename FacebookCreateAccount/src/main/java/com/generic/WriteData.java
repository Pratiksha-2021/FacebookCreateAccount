package com.generic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void main(String[] args) throws Exception {
		
		CreteLogger.createLog4JDirectoty();
		String log4Jpath=System.getProperty("user.dir")+"/src/main/resourse/log4j.properties";
		PropertyConfigurator.configure(log4Jpath);
		Logger logger=Logger.getLogger(WriteData.class);

		
		
		logger.info("create workbook");
		XSSFWorkbook workbook = new XSSFWorkbook();
		logger.info("create sheet");
		XSSFSheet sheet = workbook.createSheet("sheettestdata");

		for (int rows = 0; rows < 10; rows++) {
			Row row = sheet.createRow(rows);
			
			logger.info("create row"+row);
			
			for (int colm = 0; colm < 10; colm++) {
				int intsetvalue=(int) (Math.random() * 100);
			     Cell cell = row.createCell(colm);
				cell.setCellValue(intsetvalue);
				logger.info("create cell....>"+colm+"setvalue:"+intsetvalue);
			}

		}

		File file = new File(System.getProperty("user.dir")
				+ "/src/main/resourse/testData/excelFiles/Automation_external_testdata.xlsx");

		FileOutputStream fout = new FileOutputStream(file);
		workbook.write(fout);
		fout.close();
		logger.info("close connection");
		logger.info("data added successfully");
	}

}
