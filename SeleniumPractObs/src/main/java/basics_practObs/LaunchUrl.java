package basics_practObs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrl 
{
	public WebDriver driver;
	
	public void launchUrl()
	{
		driver= new ChromeDriver();
		//driver.get("http://selenium.qabible.in/simple-form-demo.php");
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
public static void main(String[]args)
	{
	LaunchUrl launchUrl= new LaunchUrl();
	launchUrl.launchUrl();
	}
}
