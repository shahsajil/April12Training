
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

public class CsvReader {
	public final static int HEADER_LINE = 1;

	public static HashMap<String, String> readCsv(String csvFile) {

		FileReader fileReader = null;
		HashMap<String, String> map = new HashMap<String, String>();

		try {
			String path = getFileFromResources(csvFile);
			fileReader = new FileReader(path);

			CSVReader reader = new CSVReaderBuilder(fileReader)
					.withSkipLines(HEADER_LINE)
					.build();

			String[] record = null;

			while ((record = reader.readNext()) != null) {
				String make = record[0];
				String model = record[1];

				map.put(model, make);
			}
		} catch (FileNotFoundException ex) {
			throw new RuntimeException(ex.getMessage());
		} catch (CsvValidationException ex) {
			throw new RuntimeException(ex.getMessage());
		} catch (IOException ex) {
			throw new RuntimeException(ex.getMessage());
		}
		finally {
			try {
				if(fileReader != null) {
					fileReader.close();
				}
			} catch (IOException ex) {
				throw new RuntimeException(ex.getMessage());
			}
		}

		return map;
	}

	public static String getFileFromResources(String fileName) {
		URL fileUrl = ClassLoader.getSystemResource(fileName);

		if(fileUrl == null) {
			throw new RuntimeException(fileName + " does not exist in the resources folder.");
		}

		String filePath = fileUrl.getFile();

		if(filePath == null) {
			throw new RuntimeException("Could not get file path for " + fileUrl);
		}

		return filePath;
	}
}