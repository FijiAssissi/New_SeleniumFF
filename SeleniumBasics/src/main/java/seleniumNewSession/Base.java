package seleniumNewSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;//declared as a global variable so it can be used in multiple methods
	
	public void initializeBrowser()
	{
		driver= new ChromeDriver();//to launch chromeDriver
		//driver= new EdgeDriver();//to launch edgeDriver
		//driver=new FirefoxDriver();//to launch firefoxDriver
		
		driver.get("http://selenium.qabible.in/index.php");
		driver.manage().window().maximize();//to maximize the window
	}
	public void quitAndClose()
	{
	//driver.close();//closes the current browser
	driver.quit();//closes all the associated windows
	}
	public static void main(String[] args) {
		
	Base base=new Base();//creating object-classname object name= new classname();
	
	base.initializeBrowser();//calling instance method
	//base.quitAndClose();	
	}
}
