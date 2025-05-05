package basics_practObs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsPract extends LaunchUrl 
{
	public void find_Elements()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkbox_field:checkboxes) 
		{
			
			System.out.println(checkbox_field.isSelected());
			if(checkbox_field.isSelected()==true) 
			{
				continue;
			}
			checkbox_field.click();
			
		}
	}

	public static void main(String[] args) 
	{
		FindElementsPract findElements =new FindElementsPract();
		findElements.launchUrl();
		findElements.find_Elements();

	}

}
