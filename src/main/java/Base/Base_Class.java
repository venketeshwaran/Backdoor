package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browsername) {
		
		try {
		
		if (browsername.equalsIgnoreCase("chrome")) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Desknew\\Cucumberjava_Project\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		
		else if (browsername.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\Desktop\\Desknew\\Selenium_project2\\Drivers\\IEDriverServer.exe");
			 driver= new InternetExplorerDriver();
		}
			
			else {
				System.out.println("invaild Browser");
				
			
		}
				
	}catch (Exception e) {
		e.printStackTrace();
					
				}
		driver.manage().window().maximize();
		
		
		return driver;
				
				
			
					
			
		}		
	
	
	
	public static void getUrl(String Url) {
		try {
			driver.get(Url);
		}catch (Exception e) {
				e.printStackTrace();
		
		}
    	
		
		
			
		}



	
	public static void inputValueofElement(WebElement element,String value) {
		waitForElementVisibility();
		try {
			element.sendKeys(value);
		}catch (Exception e) {
				e.printStackTrace();
		
		}
		
		
	}
	
	 
	public static void clickonElement(WebElement element) {
		waitForElementVisibility();
		try {
			element.click();
		}catch (Exception e) {
				e.printStackTrace();
		
		}
		
		
	}


	private static void waitForElementVisibility() {
		
		
	}



	
	}
	

	
	

