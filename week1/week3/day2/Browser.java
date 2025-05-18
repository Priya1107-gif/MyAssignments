package week3.day2;

public class Browser {
	String browserName;
	String browserVersion;
	public void openURL()
	{
		System.out.println("URL Opened ----->from Browser super class");
	}
	public void closeBrowser()
	{
		System.out.println("Browser closed ----->from Browser super class");
	}
	public void navigateBack()
	{
		System.out.println("Navigated back ----->from Browser super class");
	}
}
