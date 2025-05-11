package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		//launch browser driver 
				WebDriver driver = new ChromeDriver();
				//open facebook url
				driver.get("https://en-gb.facebook.com/");
				//				maximize window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//				store title of webpage in a string
				String title1 = driver.getTitle();
				//				print title of webpage
				System.out.println(title1);
				driver.findElement(By.partialLinkText("Create new account")).click();
				driver.findElement(By.name("firstname")).sendKeys("Priyadarshini");
				driver.findElement(By.name("lastname")).sendKeys("Balaji");
				WebElement day = driver.findElement(By.id("day"));
				Select selectday = new Select(day);
				selectday.selectByVisibleText("11");
				WebElement month = driver.findElement(By.id("month"));
				Select selectmonth = new Select(month);
				selectmonth.selectByVisibleText("Jul");
				WebElement year = driver.findElement(By.id("year"));
				Select selectyear = new Select(year);
				selectyear.selectByVisibleText("1991");
				driver.findElement(By.xpath("//input[@value='1']")).click();
				driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9962249828");
				driver.findElement(By.id("password_step_input")).sendKeys("PR3003@ba");
//				driver.findElement(By.name("websubmit")).click();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//				System.out.println(driver.findElement(By.id("reg_error_inner")).getText());
				driver.close();
	}

}
