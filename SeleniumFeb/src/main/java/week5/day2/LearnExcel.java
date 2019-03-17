package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public String[][] getData() throws IOException {

		XSSFWorkbook wBook = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheetAt = wBook.getSheetAt(0);
		int rowCount = sheetAt.getLastRowNum(); // ignore header row and provide only actual data rows alone
		short columnCount = sheetAt.getRow(0).getLastCellNum(); // actual column count(physical column count
		String[][] data = new String[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) { // iterating from 1 to avoid header row, limit condition is given as <=
												// since apache poi api ignores header row by default
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < columnCount; j++) { // limit condition given as < since apache poi api returns the
													// physical column count
				XSSFCell cell = row.getCell(j);
				data[i - 1][j] = cell.getStringCellValue();
			}

		}

		wBook.close();
		return data;

	}

}
