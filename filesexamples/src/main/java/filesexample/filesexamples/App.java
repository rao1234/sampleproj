package filesexample.filesexamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       // System.out.println( "Hello World!" );
    	String imageUrlToBeDownloaded="http://www.avajava.com/images/avajavalogo.jpg";
    	URL imageUrl=new URL(imageUrlToBeDownloaded);
    	InputStream inputStream=imageUrl.openStream();
    	//System.out.println(inputStream.);
    	String mimeType = URLConnection.guessContentTypeFromStream(inputStream);
    	//System.out.println(mimeType);
    	FileOutputStream fileOutputStream=new FileOutputStream(new File("E:\\avajavalogo.jpg"));
    	IOUtils.copy(inputStream, fileOutputStream);
    	
    	
    }
}
