package aol.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://mail.aol.com");
	        
	        driver.manage().window().maximize();
	        
	        WebElement login = driver.findElement(By.xpath("//*[@class='login']"));
	        login.click();
	        
	        WebElement userid = driver.findElement(By.xpath("//input[@id='login-username']"));
	        userid.sendKeys("Manish2441@aol.com");
	        
	        WebElement next = driver.findElement(By.xpath("//input[@id='login-signin']"));
	        next.click();
	        
	        WebElement password = driver.findElement(By.xpath("//input[@id='login-passwd']"));
	        password.sendKeys("Mann@2441");
	        
	        WebElement next2 = driver.findElement(By.xpath("//button[@id='login-signin']"));
	        next2.click();
	        

	}

}
