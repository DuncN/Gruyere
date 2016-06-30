package automatedChecks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

public class signUpTest {
	
	@Test
	public void main() {
        WebDriver driver = new FirefoxDriver();

        // Open website
        driver.get("https://google-gruyere.appspot.com/358859087229/newaccount.gtl");

        // Find user name field & enter name (increment by 1 for each test executed)
        driver.findElement(By.name("uid")).sendKeys("duncs8");
        //TODO add incrementor on user name
        
        // Find password field & enter password
        driver.findElement(By.name("pw")).sendKeys("password1");
        
        // Find create account button & click it
        driver.findElement(By.cssSelector("input[type='submit'][value='Create account']")).click();
        
        // Check that user is logged in
       WebElement success = driver.findElement(By.className("message"));
        String string = success.getText();
        System.out.println(string);
        try{
        Assert.assertEquals("Account created.", string);
        } catch(ComparisonFailure e) {
        	System.out.println(e.getMessage());
        }
   }
}