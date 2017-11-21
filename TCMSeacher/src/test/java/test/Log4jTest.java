package test;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest extends BaseTest{
	private static Logger logger=Logger.getLogger(Log4jTest.class);

	@Test
	public void logconfigTest(){
		logger.debug("this is a debug");
	}
}
