package nLayerdDemo.core;

import nLayerdDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		 JLoggerManager jLoggerManager=new JLoggerManager();
		 jLoggerManager.log(message);
	}

}
