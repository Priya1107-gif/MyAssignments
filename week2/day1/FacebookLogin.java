package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		//launch browser driver 
		WebDriver driver = new ChromeDriver();
		//open facebook url
		driver.get("https://www.facebook.com/");
		//				maximize window
		driver.manage().window().maximize();
		//				store title of webpage in a string
		String title1 = driver.getTitle();
		//				print title of webpage
		System.out.println(title1);
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Find your account and log in.")).click();
		String title2 = driver.getTitle();
		//				print title of webpage
		System.out.println(title2);
		//				close webpage
		driver.close();


	}

}
