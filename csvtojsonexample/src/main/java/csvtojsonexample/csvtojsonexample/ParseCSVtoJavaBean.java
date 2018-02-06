package csvtojsonexample.csvtojsonexample;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.enums.CSVReaderNullFieldIndicator;

public class ParseCSVtoJavaBean {
	public static void main(String args[]) {
		System.out.println(ParseCSVtoJavaBean.class.getClassLoader().getResource("employee.csv").toString());
		CSVReader csvReader = null;

		try {
			/**
			 * Reading the CSV File Delimiter is comma Default Quote character
			 * is double quote Start reading from line 1
			 */
			//ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = ParseCSVtoJavaBean.class.getClassLoader().getResourceAsStream("employee.csv");

			/*
			 * csvReader = new CSVReader(new FileReader(new
			 * File("data\\employee.csv")), ',',
			 * 
			 * '"', 1);
			 */
			/*csvReader = new CSVReader(new InputStreamReader(is, Charset.defaultCharset()));
			CSVReader reader =new CSVReaderBuilder(new InputStreamReader(is, Charset.defaultCharset()))
	                .withFieldAsNull(CSVReaderNullFieldIndicator.EMPTY_SEPARATORS)
	                // Skip the header
	                .withSkipLines(1)
	                .build();*/
			 csvReader =new CSVReaderBuilder(new InputStreamReader(is, Charset.defaultCharset()))
	                .withFieldAsNull(CSVReaderNullFieldIndicator.EMPTY_SEPARATORS)
	                // Skip the header
	                .withSkipLines(1)
	                .build();
						// mapping of columns with their positions
			ColumnPositionMappingStrategy mappingStrategy = new ColumnPositionMappingStrategy();
			// Set mappingStrategy type to Employee Type
			mappingStrategy.setType(Employee.class);
			// Fields in Employee Bean
			String[] columns = new String[] { "id", "name", "salary" };
			// Setting the colums for mappingStrategy
			mappingStrategy.setColumnMapping(columns);
			// create instance for CsvToBean class
			CsvToBean ctb = new CsvToBean();
			// parsing csvReader(Employee.csv) with mappingStrategy
			List<Employee> empList = ctb.parse(mappingStrategy, csvReader);
			// Print the Employee Details
			for (Employee emp : empList) {
				System.out.println(emp);

			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			try {
				// closing the reader
				csvReader.close();
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
	}
}