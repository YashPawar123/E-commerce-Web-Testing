package amazontestcases_new;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AMZ_IT_03 {
    @Test
	public void SearchProduct_Select1() {
    	ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("perfume");
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div/div"));
		auto.get(0).click();
	}
}
