package basics_practObs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPract extends LaunchUrl
{
	public void dropdown1()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(dropdown1);
		select.selectByValue("sql");
	}
	
	public void dropdown2()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown2=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select=new Select(dropdown2);
		select.selectByVisibleText("JUnit");
	}
	public static void main(String[] args) 
	{
		DropdownPract dropdownPract=new DropdownPract();
		dropdownPract.launchUrl();
		//dropdownPract.dropdown1();
		dropdownPract.dropdown2();

	}

}
