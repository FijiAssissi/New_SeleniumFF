package seleniumNewSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

	public class Locators extends Base 
{
	public void idLocator()
	{
		WebElement messageField=driver.findElement(By.id("single-input-field"));
	}
	public void nameLocator()
	{
	WebElement namelocator=driver.findElement(By.name("description"));
	}
	public void classLocator()
	{
	WebElement classLocator= driver.findElement(By.className("header-top"));
	}
	public void linkTextLocator()
	{
	WebElement linkText=driver.findElement(By.linkText("radio-button-demo.php"));
	}
	public void partialLinkText()
	{
	WebElement partialLink= driver.findElement(By.partialLinkText("radio-button"));
	}
	public void cssSelector()
	{
		WebElement cssselcid= driver.findElement(By.cssSelector("input#single-input-field"));//tag#id
		WebElement cssClass=driver.findElement(By.cssSelector("div.my-2")); //tag.class
		WebElement cssAttribute=driver.findElement(By.cssSelector("input[placeholder=Message]"));//tag[attributetype=attributevalue]
		WebElement cssClassAndAttribute=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));//tag.class[attributetype=attributevalue]
	}
	public static void main(String[] args) 
	{
		Locators locators=new Locators();
		locators.initializeBrowser();
		locators.idLocator();
	}

}
