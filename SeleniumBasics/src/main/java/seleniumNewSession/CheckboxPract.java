import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumNewSession.Base;

public class CheckboxPract extends Base
{
	public void checkboxPract()
	{
		driver.navigate().to("http://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbox.click();
	}
	public void radioBtnPract()
	{
		driver.navigate().to("http://selenium.qabible.in/radio-button-demo.php");
		WebElement radibtnF= driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radibtnF.click();
		WebElement showMessage=driver.findElement(By.cssSelector("button[id='button-one']"));
		showMessage.click();
	}
	
	public static void main(String[] args) 
	{
		CheckboxPract checkboxPract=new CheckboxPract();
		checkboxPract.initializeBrowser();
		checkboxPract.checkboxPract();
		checkboxPract.radioBtnPract();
		

	}

}
