package ListHomeAssign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
  WebElement search= driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
     search.sendKeys("Bags");
     search.submit();
     driver.findElement(By.xpath("//Label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//Label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
    WebElement ItemFound= driver.findElement(By.xpath("//div[@class='length']"));
   
    List<WebElement> brandElements = driver.findElements(By.className("brand"));
    System.out.println("Brands:");
    for (WebElement brand : brandElements) {
        System.out.println(brand.getText());
    }
    List<WebElement> BagsElement = driver.findElements(By.className("nameCls"));
    System.out.println("Bag:");
    for (WebElement bag : BagsElement) {
        System.out.println(bag.getText());
    }
    
	}
}
