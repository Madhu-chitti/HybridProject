package testscripts.regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sample {

	public static void main(String[] args) throws FileNotFoundException {
		
		// D:\FLM31stJulWS\HybridFrameWork\src\test\resources\properties\config.properties
		
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		
		@SuppressWarnings({ "unused", "resource" })
		FileInputStream fis1= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");

	}

}