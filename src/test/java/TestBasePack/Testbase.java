package TestBasePack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testbase {
public static WebDriver driver;
public static Properties prop;
public static String path;
public Testbase()
{
	try {
		//Step - 1 Giving path of the configuration file
		FileInputStream ip=new FileInputStream("C:\\Java_Codes\\com.POMFramework\\src\\test\\java\\configuration\\config.properties");
		
		//Initialize Properties class
		prop=new Properties();
		
		//Load properties file
		prop.load(ip);
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void initialization()
{
	path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	
}
}
