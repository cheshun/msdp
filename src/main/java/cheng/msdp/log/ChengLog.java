package cheng.msdp.log;

import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.AppenderBase;

public class ChengLog extends AppenderBase<LoggingEvent> {

	@Override
	protected void append(LoggingEvent eventObject) {
		System.out.println(eventObject.getLoggerName());
		System.out.println(eventObject.getThreadName());
				System.out.println(eventObject.getTimeStamp());
						System.out.println(eventObject.getLevel());
		System.out.println(eventObject.getMessage()); 
	}

}
