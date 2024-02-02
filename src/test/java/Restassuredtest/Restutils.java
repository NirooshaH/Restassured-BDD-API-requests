package Restassuredtest;

import org.apache.commons.lang3.RandomStringUtils;

public class Restutils {
	
	public  static String getname(){
		String generatedname=RandomStringUtils.randomAlphabetic(1);
		return ("morpheus"+"generatedname");
		
	}
	public  static String getjob(){
		String generatedjob=RandomStringUtils.randomAlphabetic(1);
		return ("job"+"generatedjob");
		
	}
	

}
