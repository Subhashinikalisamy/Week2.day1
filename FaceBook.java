package selnium;

//import java.util.concurrent.TimeUnit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		//launching the browser
		driver.get("https://en-gb.facebook.com/");
		// launch the maximize 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("subha");
		
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("naveen");
		
				
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("aaaa@testleaf.com");
		
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("aaaa@testleaf.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("testleaf");
		
		WebElement birthDay = driver.findElement(By.id("day"));
		
		Select selectDay = new Select(birthDay);
		
		selectDay.selectByValue("14");
		
		WebElement birthMonth = driver.findElement(By.id("month"));
		
		Select selectMonth = new Select(birthMonth);
		
		selectMonth.selectByVisibleText("May");
		
		WebElement birthYear = driver.findElement(By.id("year"));
		
		Select selectYear = new Select(birthYear);
		
		selectYear.selectByValue("1995");
		
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}
