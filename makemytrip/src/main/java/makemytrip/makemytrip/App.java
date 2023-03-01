package makemytrip.makemytrip;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
	
	static WebDriver driver;
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.makemytrip.com/");
        
        driver.manage().window().maximize();
        
         WebElement from =  driver.findElement(By.xpath("//*[@id='fromCity']/.."));
        
        WebElement to = driver.findElement(By.xpath("//*[@id='toCity']/.."));
        
      //  WebElement frmtext = driver.findElement(By.xpath("//input[@placeholder='From']"));
        
     //   WebElement firstselect = driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']"));
        
     //   List<WebElement> price = driver.findElements(By.xpath("//*[@class='makeFlex top gap-x-10']//p"));
        
        from.click();
        
        WebElement frmtext = driver.findElement(By.xpath("//input[@placeholder='From']"));
        frmtext.sendKeys("New Delhi");
        Thread.sleep(2000);
        
        final WebElement firstselect = driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']"));
        
        firstselect.click();
        
        
        to.click();
        
        WebElement totext = driver.findElement(By.xpath("//input[@placeholder='To']"));
        totext.sendKeys("Mumbai");
        
        WebElement secSelect = driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']"));
        secSelect.click();
        
        WebElement departure = driver.findElement(By.xpath("//span[normalize-space()='Departure']"));
        departure.click();
        
        WebElement date = driver.findElement(By.xpath("//div[@aria-label='Sun Mar 05 2023']//p[contains(text(),'5')]"));
        date.click();
        
        WebElement Search = driver.findElement(By.xpath("//a[normalize-space()='Search']"));
        Search.click();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement notification = driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']"));
        notification.click();
        
        List<WebElement> price = driver.findElements(By.xpath("//*[@class='makeFlex top gap-x-10']//p"));
        
        int siz = price.size();
        for(int i =0; i<price.size();i++) {
        	
        	String va = price.get(i).getText();
        	System.out.print("price"+price.get(i).getText());
        	
        }
        
    }
    
    
   
    
}
