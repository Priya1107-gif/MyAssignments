package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearningDD {

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
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyadarshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sanker");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(source);
		select.selectByIndex(4);
		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select1 = new Select(market);
		select1.selectByVisibleText("Automobile");
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select2 = new Select(owner);
		select2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		//				close webpage
		driver.close();

	}

}
