package week3.day2;

public class Chrome extends Browser{
public void openIncognito()
{
	System.out.println("Incognito opened ----->from Chrome sub class");
}
public void clearCache()
{
	System.out.println("Cache cleard ----->from Chrome sub class");
}
public static void main(String[] args) {
	Chrome ch = new Chrome();
	ch.closeBrowser();
	ch.openURL();
	ch.navigateBack();
	ch.openIncognito();
	ch.clearCache();
	}
}

