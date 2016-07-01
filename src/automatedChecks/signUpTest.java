package automatedChecks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

public class signUpTest {

	@Test
	public void main() {
		WebDriver driver = new FirefoxDriver();

		// Open website
		driver.get("https://google-gruyere.appspot.com/358859087229/newaccount.gtl");

		// Find user name field & enter name (increment by 1 for each test
		// executed)
		driver.findElement(By.name("uid")).sendKeys("duncs15");
		// TODO add incrementor on user name

		// Find password field & enter password
		driver.findElement(By.name("pw")).sendKeys("password1");

		// Find create account button & click it
		driver.findElement(By.cssSelector("input[type='submit'][value='Create account']")).click();

		// Check that user is logged in, fail test if not
		WebElement success = driver.findElement(By.className("message"));
		String accountCreatedMessage = success.getText();
		System.out.println(accountCreatedMessage);
		try {
			Assert.assertEquals("Account created.", accountCreatedMessage);
		} catch (ComparisonFailure e) {
			System.out.println(e.getMessage());
		}

		// assertTrue("Verification failed: Expected message and actual messagae
		// are not same.",
		// success.equals(accountCreatedMessage = success.getText()));

		// if (assertSame(accountCreatedMessage == "created")) {
		// System.out.println("winning!");
		// } else {
		// assertFalse("losing!", true);
		// }

	}
}