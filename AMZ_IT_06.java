package amazontestcases_new;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AMZ_IT_06 {
        
	@Test
	public void proceedtobuy() {
		ChromeDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		driver.get("https://www.amazon.in");
 		
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
 		
 		WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
 		addtocart.click();
 		
 		WebElement proceedtobuy=driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
 		proceedtobuy.click();
 		
 		WebElement un=driver.findElement(By.xpath("//input[@id='ap_email']"));
		un.sendKeys("yash.pawar1512@gmail.com");
		un.sendKeys(Keys.ENTER);
		WebElement pass=driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Yash@1234");
		pass.sendKeys(Keys.ENTER);
	}
	
}
