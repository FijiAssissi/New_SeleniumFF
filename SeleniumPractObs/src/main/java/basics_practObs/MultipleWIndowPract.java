package basics_practObs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWIndowPract extends LaunchUrl
{
	public void multipleWindow()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactUs=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactUs.click();
		String ParentWindowID=driver.getWindowHandle();
		System.out.println(ParentWindowID);
		WebElement loginPortal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginPortal.click();
		Set<String> childWindows=driver.getWindowHandles();
		String titles="";//I want a variable called titles to hold some text, but for now, it’s just empty.
		for(String mutliWindows:childWindows)
		{
			if(!mutliWindows.equals(ParentWindowID))//If this window (mutliWindows) is not the original (parent) window, then do something
			{
				driver.switchTo().window(mutliWindows);//swithch to multiwindows
				 titles=driver.getTitle();//save the titlenames in title variable
				 System.out.println(titles);
			}
			if(titles.equals("WebDriver | Login Portal"))
			{
				WebElement userName= driver.findElement(By.cssSelector("input#text"));
				userName.sendKeys("Hello");
				WebElement password= driver.findElement(By.id("password"));
				password.sendKeys("1234");
				WebElement loginBtn=driver.findElement(By.cssSelector("button#login-button"));
				loginBtn.click();
				driver.switchTo().alert().dismiss();
			}
			if(titles.equals("WebDriver | Contact Us"))
			{
				WebElement firstName=driver.findElement(By.xpath("//input[@class='feedback-input']"));
				firstName.sendKeys("Hello");
				WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
				lastName.sendKeys("Selenium");
				
			}
		}
		
	}

	public static void main(String[] args) 
	{
	MultipleWIndowPract multipleWindPract=new MultipleWIndowPract();
	multipleWindPract.launchUrl();
	multipleWindPract.multipleWindow();

	}

}
