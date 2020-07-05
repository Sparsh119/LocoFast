//Created a Simple Automation Scripts for better  understanding
package Automation;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
public class GitVaidation {

	public static void main(String[] args) throws Exception
	{
		 WebDriver driver;
		    Properties properties = new Properties();
		  System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\Jayantilal\\chromedriver.exe");
	        driver = new ChromeDriver();
			driver.manage().window().maximize();
			
//			In this Step it will Login with ID/Pass provided below
			driver.get("https://github.com/login");
			 WebElement userName = driver.findElement(By.id("login_field"));
		        userName.sendKeys("SparshBasal");
		                
		        WebElement passwordElement = driver.findElement(By.id("password"));
		        passwordElement.sendKeys("Z1901pass");
		        
		        driver.findElement(By.xpath("//input[@type='submit']")).click();		  
		        
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
		        
//				Below Step will Click on Create repository	
		        driver.findElement(By.xpath("//div[@id='repos-container']//a[contains(.,'Create repository')]")).click();

		        
//				Details will be updated as mentioned below
		        WebElement RepositoryName = driver.findElement(By.id("repository_name"));
		        RepositoryName.sendKeys("QATaskLocofast");
		        
		        WebElement RepositoryDescription = driver.findElement(By.id("repository_description"));
		        RepositoryDescription.sendKeys(":memo: This Repository Contain QA Task for LOCOFast Company");
		        
		        
		        driver.findElement(By.xpath("//button[contains(.,'Create repository')]")).click();
		        
//		  		Clicking on Issue Creation      
		        driver.findElement(By.xpath("//span[contains(.,'Issues')]")).click();
		        
		        
		        driver.findElement(By.xpath("//span[contains(.,'New issue')]")).click();
//				Issue Creation Details as well as Emoji's for All Descriptions
		        
		        WebElement NewIssueTitle = driver.findElement(By.id("issue_title"));
		        NewIssueTitle.sendKeys("QATASK_New-issue");
		      
		        WebElement NewIssueBody = driver.findElement(By.id("issue_body"));
		        NewIssueBody.sendKeys(":memo: The issue is created as a part of Challenge part #2 for LOCOFAST Company");
		        
		        driver.findElement(By.xpath("//div[@class='timeline-comment']//button[contains(.,'Submit new issue')]")).click();

		        driver.findElement(By.xpath("//div[@class='gh-header-show ']//a[contains(.,'New issue')]")).click();
		        
		        WebElement NewIssueTitle1 = driver.findElement(By.id("issue_title"));
		        NewIssueTitle1.sendKeys("QATASK_New-issue");
		      
		        WebElement NewIssueBody1 = driver.findElement(By.id("issue_body"));
		        NewIssueBody1.sendKeys(":memo: The issue is created as a part of Challenge part #2 for LOCOFAST Company");
		        
		        driver.findElement(By.xpath("//div[@class='timeline-comment']//button[contains(.,'Submit new issue')]")).click();
		        
//		        Keeping Comments in the Issue
		        
		        WebElement Comment = driver.findElement(By.id("new_comment_field"));
		        Comment.sendKeys("The Comment is hiven as a part of Challenge part #3 for LOCOFAST Company");
		        driver.findElement(By.xpath("//button[contains(.,'Comment')]")).click();
		 
//		        Clicking on Header
		        driver.findElement(By.xpath("//div[@class='Header-item d-none d-lg-flex']//a[@class='Header-link']")).click();

		        
//		        Action class will help you to view the Emoji for a while
		        Actions actions = new Actions(driver);
		        WebElement hover = driver.findElement(By.xpath("//li[@class='public source ']"));
		        actions.moveToElement(hover).perform();
		        
		        driver.findElement(By.xpath("//li[@class='public source ']")).click();
		        
//		        Clicking on Issue 
		        driver.findElement(By.xpath("//span[contains(.,'Issues')]")).click();
		        driver.findElement(By.xpath("//a[@id='issue_2_link']")).click();
		        
//		        Adding Comment And Providing Git URl for other issue		        
		        WebElement CommentURL = driver.findElement(By.id("new_comment_field"));
		        CommentURL.clear();
		        CommentURL.sendKeys("https://github.com/SparshBasal/QATaskLocofast/issues/1");
		        driver.findElement(By.xpath("//button[contains(.,'Comment')]")).click();
		        
//		        Clicking on Issue link
		        driver.findElement(By.xpath("//a[contains(.,'#1')]")).click();
		        driver.findElement(By.xpath("//span[contains(.,'Settings')]")).click();
		        
//		        Deleting the Repository
		        driver.findElement(By.xpath("//li//summary[contains(.,'Delete this repository')]")).click();
		        WebElement getname = driver.findElement(By.xpath("//div//p//strong[2]"));
		        String a =  getname.getText();
		        System.out.println(a);
		        WebElement DeleteRepo = driver.findElement(By.xpath("//div[@class='Box-body overflow-auto']//form//p//input[@type='text']"));
		        DeleteRepo.sendKeys(a);
		        driver.findElement(By.xpath("//button[@type='submit' and contains(.,'I understand the consequences, delete')]")).click();
		         driver.quit();
	}
	

	
}
