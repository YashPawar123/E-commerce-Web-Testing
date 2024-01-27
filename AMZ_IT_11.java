package amazontestcases_new;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AMZ_IT_11 {
       @Test
	public void validationtoaddwishlisttocart() {
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
      		
      		driver.findElement(By.linkText("Add to Cart")).click();
	}
}
