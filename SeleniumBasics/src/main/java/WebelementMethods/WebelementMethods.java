package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jerri\\OneDrive\\Documents\\JAVA Programs\\Selenium\\Chromedriver\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement message= driver.findElement(By.id("single-input-field"));
		System.out.println(message.getText());
		WebElement showmessage= driver.findElement(By.id("button-one"));
		System.out.println(showmessage.getText());
		
		
	}

}
