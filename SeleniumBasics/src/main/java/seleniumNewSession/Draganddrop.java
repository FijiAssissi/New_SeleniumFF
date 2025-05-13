package seleniumNewSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop extends Base 
{
	public void dragAndDropPract1()
	{
		driver.navigate().to("http://selenium.qabible.in/drag-drop.php");
		WebElement dragAndDrop1= driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(dragAndDrop1).click();
		actions.doubleClick(dragAndDrop1).perform();
		WebElement drop1= driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(dragAndDrop1, drop1).build().perform();
		driver.navigate().to("http://selenium.qabible.in/drag-drop.php");
		WebElement dragAndDrop2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	//	Actions actions= new Actions(driver);
		actions.moveToElement(dragAndDrop2).click();
		actions.doubleClick(dragAndDrop2).perform();
		WebElement drop2=driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(dragAndDrop2, drop2).build().perform();	
	}
	public void dragANdDrop2()
	{
		driver.navigate().to("http://selenium.qabible.in/drag-drop.php");
		WebElement dragAndDrop2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		Actions actions= new Actions(driver);
		actions.moveToElement(dragAndDrop2).click();
		actions.doubleClick(dragAndDrop2).perform();
		WebElement drop2=driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(dragAndDrop2, drop2).build().perform();	
	}
	public static void main(String[] args)
	{
		Draganddrop dragAndDrop=new Draganddrop();
		dragAndDrop.initializeBrowser();
		dragAndDrop.dragAndDropPract1();
		//dragAndDrop.dragANdDrop2();
	}

}
