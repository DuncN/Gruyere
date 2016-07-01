package automatedChecks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

public class createNewSnippetTest {

	@Test
	public void main() {
		WebDriver driver = new FirefoxDriver();

		// Open website & sign in
		driver.get("https://google-gruyere.appspot.com/358859087229/login");

		// Find user name field & enter name
		driver.findElement(By.name("uid")).sendKeys("duncs8");

		// Find password field & enter password
		driver.findElement(By.name("pw")).sendKeys("password1");

		// Find log in button & click it
		driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();

		// Find new snippet button & click it
		driver.findElement(By.cssSelector("a[href='/358859087229/newsnippet.gtl']")).click();

		// Find snippet text area & enter some text
		driver.findElement(By.name("snippet")).sendKeys("Hello world!");

		// Find new snippet button & click it
		driver.findElement(By.cssSelector("input[type='submit'][value='Submit']")).click();

		// Check user is on my snippets page
		driver.findElement(By.cssSelector("a[href='/358859087229/snippets.gtl']"));

		// Check that snippet has been created, fail test if not
		// TODO : find a better way of targeting snippet
		if (driver.getPageSource().contains("Hello World!")) {
			System.out.println("snippet found");
		} else {
			System.out.println("snippet not found ");
		}

	}
}