package seleniumNewSession;

public class NavigationCommands extends Base //navigationcommands is the child class it inherits from the Base class(Parent)
//parent to child relationship by extends keyword
{
	
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		
		NavigationCommands navigationCommands =new NavigationCommands();
		navigationCommands.initializeBrowser();
		navigationCommands.navigationCommands();
		//navigationCommands.quitAndClose();
	}

}
