package csvtojsonexample.csvtojsonexample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class CopyFile {

	public static void main(String args[]) throws IOException {
		InputStream InputStream = CopyFile.class.getClassLoader().getResourceAsStream("input.txt");
		//System.out.println(IOUtils.toString(InputStream.toString()));
		String data=IOUtils.toString(InputStream);
		System.out.println(data);
	}
}