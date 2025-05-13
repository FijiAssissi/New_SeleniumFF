package seleniumNewSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base
{
	public void alertPract1()
	{
	driver.navigate().to("http://selenium.qabible.in/javascript-alert.php");
	WebElement firstClick=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	firstClick.click();
	driver.switchTo().alert().accept();
	}
	public void alertPract2()
	{
		driver.navigate().to("http://selenium.qabible.in/javascript-alert.php");
		WebElement secondClick= driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		secondClick.click();
		driver.switchTo().alert().dismiss();
	}
	public void alertPract3()
	{
		driver.navigate().to("http://selenium.qabible.in/javascript-alert.php");
		WebElement thirdClick= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		thirdClick.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
	}
	public static void main(String[] args) 
	{
		AlertHandling alertHandling=new AlertHandling();
		alertHandling.initializeBrowser();
		alertHandling.alertPract1();
		alertHandling.alertPract2();
		alertHandling.alertPract3();

	}

}
