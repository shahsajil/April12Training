import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CsvTests {
	@Test
	public void canReadCsvIntoHashMap() {
		String csvFile = "basses.csv";
		Map<String, String> expectedMap = new HashMap<String, String>();
		expectedMap.put("Corvette", "Warwick");
		expectedMap.put("Streamer", "Warwick");
		expectedMap.put("Thumb", "Warwick");
		expectedMap.put("Precision", "Fender");
		expectedMap.put("Jazz", "Fender");
		expectedMap.put("BB500", "Yamaha");

		Map<String, String> map = CsvReader.readCsv(csvFile);

		assertEquals(map, expectedMap, "csv file should be read into a hashmap");
	}
}
