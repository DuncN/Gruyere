package automatedChecks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

public class userChangePasswordTest {

	@Test
	public void main() {
		WebDriver driver = new FirefoxDriver();

		// Open website
		driver.get("https://google-gruyere.appspot.com/358859087229/login");

		// Find user name field & enter name
		driver.findElement(By.name("uid")).sendKeys("duncs9");
		// TODO : this step needs to know about available user names...

		// Find password field & enter password
		driver.findElement(By.name("pw")).sendKeys("password1");

		// Find log in button & click it
		driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();

		// Find profile button & click it
		driver.findElement(By.cssSelector("a[href='/358859087229/editprofile.gtl']")).click();

		// Find OLD password field & enter password
		driver.findElement(By.name("oldpw")).sendKeys("password1");

		// Find NEW password field & enter password
		driver.findElement(By.name("pw")).sendKeys("password2");

		// Find update button & click it
		driver.findElement(By.cssSelector("input[type='submit'][value='Update']")).click();

		// User is returned to Gruyere: Home page
		if (driver.getPageSource().contains("Gruyere: Home")) {
			System.out.println("snippet found");
		} else {
			System.out.println("snippet not found ");
		}
	}

}
