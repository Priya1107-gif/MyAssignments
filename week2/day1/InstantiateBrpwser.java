package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstantiateBrpwser {

	public static void main(String[] args) {
		//launch browser driver 
		WebDriver driver = new ChromeDriver();
		//open facebook url
		driver.get("https://www.facebook.com/");
//		maximize window
		driver.manage().window().maximize();
//		store title of webpage in a string
		String title = driver.getTitle();
//		print title of webpage
		System.out.println(title);
//		close webpage
		driver.close();

	}

}
