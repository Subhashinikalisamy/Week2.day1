package selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlea {
	

		public static void main(String[] args) {
				// TODO Auto-generated method stubt
						//setup webdriver
						WebDriverManager.chromedriver().setup();
						//creating object for launching the browser
						ChromeDriver driver = new ChromeDriver();
						//launching the browser
						driver.get("http://leaftaps.com/opentaps/control/login");
						// launch the maximize 
						driver.manage().window().maximize();
						
						driver.findElement(By.id("username")).sendKeys("DemoCSR");
						
						driver.findElement(By.id("password")).sendKeys("crmsfa");
						
						driver.findElement(By.className("decorativeSubmit")).click();
						
						driver.findElement(By.linkText("CRM/SFA")).click();
						
						driver.findElement(By.linkText("Leads")).click();
						
						driver.findElement(By.linkText("Create Lead")).click();
						
						driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf Solutions");
						
						driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subhashini");
						
						driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kalisamy");
						
						driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
						
						driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium automation is goo to learn");
			
								
						driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("subhasiniklaisamy@gmail.com");
						
						WebElement eleSource = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
						
						Select dd = new Select(eleSource);
						
						dd.selectByVisibleText("New York");
						
						driver.findElement(By.name("submitButton")).click();
						
					
						driver.findElement(By.linkText("Edit")).click();
						
						WebElement eledesciption =driver.findElement(By.id("updateLeadForm_description"));
						
						eledesciption.clear();
						
						driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edit leads is done");
						
						driver.findElement(By.className("smallSubmit")).click();
						
						String title= driver.getTitle();
						
						System.out.println(title);
						
			}

		

}


