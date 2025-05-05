package hW_seleniumNewSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumNewSession.Base;

public class FindElements_Iterator extends Base 
{
	public void findElementsPract()
	{
		driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> textField=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement fields:textField)
		{
			fields.sendKeys("Hello world");
		}
	}
	public static void main(String[] args) 
	{
		FindElements_Iterator findElements=new FindElements_Iterator();
		findElements.initializeBrowser();
		findElements.findElementsPract();

	}

}
