package seleniumNewSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsEx extends Base
{
	public void findElements()
	{
		driver.navigate().to("http://selenium.qabible.in/check-box-demo.php");
		//
		List<WebElement> multiplecheckbox= driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement multiplebox:multiplecheckbox)
		{
			multiplebox.click();
		}
		
	}

	public static void main(String[] args) 
	{
		FindElementsEx findelements=new FindElementsEx();
		findelements.initializeBrowser();
		findelements.findElements();

	}

}
