package seleniumNewSession;

public class BrowserCommands extends Base 
{
	public void browserCommands()
	{
		String title= driver.getTitle();
		System.out.println(title);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
		
	}

	public static void main(String[] args) 
	{
		BrowserCommands browserCommands = new BrowserCommands();
		browserCommands.initializeBrowser();
		browserCommands.browserCommands();
	}

}
