package seleniumNewSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathLocator extends Base
{
	public void relativeXpath()
	{
		//tagname[@attribute='value']
		WebElement x= driver.findElement(By.xpath("//button[@id='button-one']"));
	}
	public void contains()
	{
		//tagname[contains(@attribute,'value')]
		WebElement y= driver.findElement(By.xpath("//button[contains(@id,'one')]"));
	}
	public void startsWith()
	{
		//tagname[starts-with(@attribute,'value')]
		WebElement a= driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]"));
	}
	public void text()
	{
		//tagname[text()='value']
		WebElement text= driver.findElement(By.xpath("//label[text()='Enter Message']"));
	}
	public void and()
	{
		//tagname[@attribute='value' and @attribute='value']
		WebElement andXpath=driver.findElement(By.xpath("//input[@id='single-input-field' and @class=\"form-control\"]"));
	}
	public void or()
	{
		//tagname[@attribute='value' or @attribute='value']
		WebElement orXpath= driver.findElement(By.xpath("//button[@id='button-two' or @class='btn btn-primary']"));
	}
	public void test()
	{
		driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
		WebElement x= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		x.sendKeys("abcd");
		WebElement y= driver.findElement(By.xpath("//button[@id='button-one']"));
		y.click();
	} 
	
	public static void main(String[] args)
	{
		XpathLocator xpathlocator= new XpathLocator();
		xpathlocator.initializeBrowser();
		xpathlocator.test();
	}

}
