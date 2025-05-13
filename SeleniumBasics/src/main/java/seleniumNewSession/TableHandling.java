package seleniumNewSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base
{
public void getFullTabledata()
	{
	driver.navigate().to("http://selenium.qabible.in/table-pagination.php");
	WebElement fullTable=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	System.out.println(fullTable.getText());
	
	}
public void selectRow()
	{
	driver.navigate().to("http://selenium.qabible.in/table-pagination.php");
	WebElement rowdata=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));//fulltablesxpath+/tbody/tr[the row we needed]
	System.out.println(rowdata.getText());
	}
public void selectColumndata()
	{
	driver.navigate().to("http://selenium.qabible.in/table-pagination.php");
	List<WebElement> coulmnData=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
	for(WebElement columnFull:coulmnData)
	{
	System.out.println(columnFull.getText());
	}
	}
	public void selectParticularData()
	{
	driver.navigate().to("http://selenium.qabible.in/table-pagination.php");
	WebElement ParticularData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[1]"));
	System.out.println(ParticularData.getText());
	}
	public void searchData()
	{
	driver.navigate().to("http://selenium.qabible.in/table-pagination.php");
	String input="Software Engineer";
	List<WebElement> columnSearch=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
	for(WebElement onedata:columnSearch)
	{
		if(onedata.getText().equals(input))
		{
			System.out.println(onedata.getText());
		}
	}
	}
	public static void main(String[] args) 
	{
		TableHandling tableHandle=new TableHandling();
		tableHandle.initializeBrowser();
		//tableHandle.getFullTabledata();
		//tableHandle.selectRow();
		//tableHandle.selectColumndata();
		//tableHandle.selectParticularData();
		tableHandle.searchData();

	}

}
