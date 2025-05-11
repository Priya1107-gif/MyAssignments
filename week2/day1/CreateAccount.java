package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		WebDriver driver=new ChromeDriver(options);
		//open url
		driver.get("http://leaftaps.com/opentaps/");
		//				maximize window
		driver.manage().window().maximize();
		//				store title of webpage in a string
		String title = driver.getTitle();
		//				print title of webpage
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Priya Corp");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("10");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.xpath("//input[contains(@value,'Account')]")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
