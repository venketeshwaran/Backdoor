package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	   
    public  WebDriver launchChromeBrowser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\New folder\\TaskCucumber\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        getBrowser("chrome");
		getUrl("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
        return driver;
	}
    private void getUrl(String string) {
		// TODO Auto-generated method stub
		
	}
	private void getBrowser(String string) {
		// TODO Auto-generated method stub
		
	}
	public  WebDriver launchfirefoxBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\New folder\\TaskCucumber\\lib\\geckodriver.exe");
        return driver = new FirefoxDriver();
	}
    public  void launchUrl(String url) {
	    driver.get(url);
	   
		}
    public void implicitWait() {
    	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
    
    public  void maximizeWindow() {
		driver.manage().window().maximize();
			}
	public  String getTitle() {
		String title = driver.getTitle();	
		System.out.println(title);
		return title;
	}
	public  String getPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}

	public  void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	public  void btnClick(WebElement element) {
		if((isDisplayed(element)&&isEnable(element))) {
			element.click();
		}
		
	}
	
	public void submitForm(WebElement element) {
		
		if((isDisplayed(element)&&isEnable(element))) {
			element.click();
		}
	}

	public boolean isEnable(WebElement element) {
		return element.isEnabled();

	}
	public boolean isSelected(WebElement element) {
		return element.isSelected();
	}
	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	public void selectVisibleText(WebElement element,String slvalue) {
		Select st=new Select(element);
		st.selectByVisibleText(slvalue);
		
	}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public static void getAttributrValue(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	
	public static  void quitBrowser() {
		driver.quit();
	}
	
	public static  void closeBrowser() {
		driver.close();
	}
	
}
