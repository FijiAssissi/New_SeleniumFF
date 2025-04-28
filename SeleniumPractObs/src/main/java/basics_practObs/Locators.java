package basics_practObs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends LaunchUrl
{
	public void idLocator()
	{
		WebElement idlo= driver.findElement(By.id("message-one"));
		WebElement entervalue= driver.findElement(By.id("value-a"));
		WebElement entervalueb= driver.findElement(By.id("value-b"));	
	}
	public void nameLocator()
	{
		WebElement email=driver.findElement(By.name("email"));
		WebElement passwd= driver.findElement(By.name("pass"));
		WebElement forgotpasswd= driver.findElement(By.name("email"));
	}
	public void classLocator()
	{
		WebElement enterDate= driver.findElement(By.className("form-control datepicker"));
		WebElement datRange= driver.findElement(By.className("form-control"));
		WebElement burgericon= driver.findElement(By.className("navbar-toggler-icon"));
	}
	  public void linktextLocator()
	  {
		  WebElement checkbox= driver.findElement(By.linkText("check-box-demo.php"));
		  WebElement radiobtn= driver.findElement(By.linkText("radio-button-demo.php"));
		  
	  }
	  public void partiallinkLocator()
	  {
		WebElement radiobtn= driver.findElement(By.partialLinkText("radio-button"));
		WebElement formsubmt= driver.findElement(By.partialLinkText("form-sub"));
	  }
	  public void cssSelctorBytagId()
	  {
		  WebElement tagId= driver.findElement(By.cssSelector("input#single-input-field")); //by using tagname#id
		  WebElement btnTagId=driver.findElement(By.cssSelector("button#button-one"));
		  WebElement valueAtagId= driver.findElement(By.cssSelector("value-a"));
	  }
	  public void cssBytagClass()//by using tagnane.classvalue
	  {
		  WebElement fbUsername= driver.findElement(By.cssSelector("input#email"));
		  WebElement loginBtn= driver.findElement(By.cssSelector("button#loginbutton"));
		WebElement findAccount= driver.findElement(By.cssSelector("input#identify_email"));
	  }
	  public void cssByAttribute()//by using tagname[Attribute type= attribute value]
	  {
		  WebElement enterMessage= driver.findElement(By.cssSelector("input[id=single-input-field]"));
		  WebElement showMesssagebtn= driver.findElement(By.cssSelector("button[id=button-one]"));
		  WebElement enterValueA= driver.findElement(By.cssSelector("input[id=value-a]"));
		  
	  }
	  public void cssByclassAndAttribute()
	  {
		  WebElement radioBtnM= driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio1]"));
		  WebElement radioBtnF=driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio2]"));
		  WebElement getResultsbtn=driver.findElement(By.cssSelector("button.navbar-toggler[class=navbar-toggler]"));
	  }
	public static void main(String[] args) 
	{
		Locators locators= new Locators();
		locators.cssByAttribute();
		locators.cssByclassAndAttribute();
		locators.cssSelctorBytagId();
		locators.cssBytagClass();

	}

}
