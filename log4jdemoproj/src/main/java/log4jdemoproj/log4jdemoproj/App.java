package log4jdemoproj.log4jdemoproj;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
    	/*OFF
    	FATAL
    	ERROR
    	WARN
    	INFO
    	DEBUG
    	TRACE
    	ALL*/
    	long startTime=System.currentTimeMillis();
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date date = new Date();
    	System.out.println(dateFormat.format(date));
    	logger.debug("debug");
    	logger.trace("trace");
    	
    	logger.info("info");
    	logger.error("error");
    	logger.warn("warn");
    	long endTime=System.currentTimeMillis();
    	long diff=endTime-startTime;
    	System.out.println("Difference between two requests Time"+diff);
    	
    }
}
