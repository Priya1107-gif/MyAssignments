package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

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
		String giveAccountName = "Priya & Co3";
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(giveAccountName);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		WebElement industryLov = driver.findElement(By.name("industryEnumId"));
		Select selectindustry = new Select(industryLov);
		selectindustry.selectByVisibleText("Computer Software");
		WebElement ownershipLov = driver.findElement(By.name("ownershipEnumId"));
		Select selectownership = new Select(ownershipLov);
		selectownership.selectByVisibleText("S-Corporation");
		WebElement sourceLov = driver.findElement(By.name("dataSourceId"));
		Select selectsource = new Select(sourceLov);
		selectsource.selectByValue("LEAD_EMPLOYEE");
		WebElement campaignLov = driver.findElement(By.name("marketingCampaignId"));
		Select selectcampaign = new Select(campaignLov);
		selectcampaign.selectByIndex(6);
		WebElement stateLov = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select selectstate = new Select(stateLov);
		selectstate.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String getAccountName = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")).getText();
		System.out.println("Given Account Name " +giveAccountName);
		System.out.println("Get Account Name " +getAccountName);
//		String[] getName = getAccountName.split("(");
//		System.out.println(getName[0]);
//		if (giveAccountName==getName[0])
//		{
//			System.out.println("Given Account Name " +giveAccountName);
//			System.out.println("Get Account Name " +getAccountName);
//			System.out.println("Both are same");
//
//		}
//		else
//		{
//			System.out.println("Given Account Name " +giveAccountName);
//			System.out.println("Get Account Name " +getAccountName);
//			System.out.println("Both are NOT same");
//		}

driver.close();
	}
}