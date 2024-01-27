package amazontestcases_new;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AMZ_IT_10 {
     @Test     
	public void creatingthediffrentlist() {
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
  		pass.sendKeys("*****");
  		pass.sendKeys(Keys.ENTER);
   		
   		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
   		search.sendKeys("perfume");
   		search.sendKeys(Keys.ENTER);
   		
   		WebElement fp=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
   		fp.click();
   		
   		Set<String>  pc=driver.getWindowHandles();
   		Iterator<String> cid=pc.iterator();
   		
   		String pc1=cid.next();
   		System.out.println(pc1);
   		String pc2=cid.next();
   		System.out.println(pc2);
   		driver.switchTo().window(pc2);
   		
   		String xpath = "//a[@id='nav-link-accountList']/span[2]";
   		
   		WebElement addtowish=driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
   		addtowish.sendKeys(Keys.ENTER);
   		
   		
   		
   		WebElement viewlist=driver.findElement(By.linkText("View Your List"));
   		viewlist.click();
   		
//   		String pc3=cid.next();
//   		System.out.println(pc2);
//   		driver.switchTo().window(pc2);
   		
   		WebElement createlist=driver.findElement(By.linkText("Create a List"));
   		createlist.click();
   		
//   		String pc4=cid.next();
//   		System.out.println(pc4);
//   		driver.switchTo().window(pc2);
   		WebElement newlist=driver.findElement(By.xpath("//input[@id='list-name']"));
   		newlist.sendKeys(Keys.CLEAR);
   		newlist.sendKeys("My new List");
   		
   		driver.findElement(By.xpath("(//input[@class='a-button-input a-declarative'])[5]")).click();
   		
	}
}
