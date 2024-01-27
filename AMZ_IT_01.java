package amazontestcases_new;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AMZ_IT_01 {
    
	@Test
	public void validationoftheloginpage() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		WebElement account_button=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(account_button);
		WebElement singin=driver.findElement(By.linkText("Sign in"));
		singin.click();
		WebElement un=driver.findElement(By.xpath("//input[@id='ap_email']"));
		un.sendKeys("yash.pawar1512@gmail.com");
		un.sendKeys(Keys.ENTER);
		WebElement pass=driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Yash@1234");
		pass.sendKeys(Keys.ENTER);
	}
}
