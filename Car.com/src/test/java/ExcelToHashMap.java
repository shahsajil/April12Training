import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelToHashMap {
	@Test
	public void hashMap() throws IOException {
		String path = (".\\resources\\basses.csv");
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheet("basses");

		int lastRow = sheet.getLastRowNum();
		HashMap<String,String> data = new HashMap<String,String>();

		//Reading data from excel to hashmap
		for(int r=0; r<=lastRow;r++)
		{
			String key = sheet.getRow(r).getCell(1).getStringCellValue();
			String value = sheet.getRow(r).getCell(0).getStringCellValue(); 
			data.put(key, value);
		}
		// Read data from HashMap 
		for(Map.Entry entry:data.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}


	}
}