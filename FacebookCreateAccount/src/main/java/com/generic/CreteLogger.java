package com.generic;

import java.io.File;

public class CreteLogger {

	public static void createLog4JDirectoty() {

		String logfilepath = System.getProperty("user.dir") + "/target/LogFile/log4j-Logger.log";// file extention must
																									// be .log
		File reportfile = new File(logfilepath);
		try {
			if (!reportfile.exists()) {
				new File(System.getProperty("user.dir") + "target/LogFile").mkdir();
				reportfile.createNewFile();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
