package seleniumNewSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown extends Base
{
	public void dropDownEx()
	{
		driver.navigate().to("http://selenium.qabible.in/select-input.php");
		WebElement dropdownField= driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropdownField);
		//select.selectByValue("Red");
		//select.selectByVisibleText("Yellow");
		select.selectByIndex(3);
	}

	public static void main(String[] args) {
		HandleDropDown handleDropdown= new HandleDropDown();
		handleDropdown.initializeBrowser();
		handleDropdown.dropDownEx();

	}

}
