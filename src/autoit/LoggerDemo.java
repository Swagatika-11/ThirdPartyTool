package autoit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerDemo {
	public Logger log=Logger.getLogger(LoggerDemo.class);
	public void LoggerDebug() {
		log.debug("This is the debug method");
	}
	public void LoggerError() {
		log.error("This is an error message");
	}
	public void LoggerFatal() {
		log.fatal("This is a fatal error occurred dring the execution");
	}
	public void LoggerInfo() {
		log.info("This is an information about AUT");
	}
	public void LoggerWarn() {
		log.warn("This is an warning message");
		
	}
	@Test
	public void LoggerDemo() {
		LoggerDebug();
		LoggerError();
		LoggerFatal();
		LoggerInfo();
		LoggerWarn();	
		
	}

}
