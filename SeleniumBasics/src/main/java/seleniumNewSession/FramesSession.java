package seleniumNewSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSession 
{
	public WebDriver driver;
	public void framePract()
	{
	driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	WebElement jmeterIframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	driver.switchTo().frame(jmeterIframe);
	WebElement jmeterFrame=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	jmeterFrame.click();
	}
	public static void main(String[] args) 
	{
		FramesSession framesession= new FramesSession();
		framesession.framePract();

	}

}
