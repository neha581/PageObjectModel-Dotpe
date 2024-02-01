package in.dotpe.merchant.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
//import java.lang.reflect.Method;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//import in.dotpe.merchant.util.*;
import in.dotpe.merchant.util.WebEventListener; 
//import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListener eventListener;
	
	public Base(){
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/neha/eclipse-workspace/DOTPE-MARCHANTPANEL-AUTOMATION/"
					+ "src/main/java/in/dotpe/merchant/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

public static void initiatization() {
	
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/chromedriver-mac-x64/chromedriver");	
		driver = new ChromeDriver(); 
		
		

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    //driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get(prop.getProperty("url"));
}
}
