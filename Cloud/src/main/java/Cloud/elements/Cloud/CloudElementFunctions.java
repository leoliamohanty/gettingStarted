package Cloud.elements.Cloud;


import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloudElementFunctions {
	
	CloudElementXpathDirectory cloudElementXpathDirectory = new CloudElementXpathDirectory();
    
	
	public void gitSignUp(WebDriver driver,Properties prop) {
		
	try { 
		Thread.sleep(5000);
		WebElement git =driver.findElement(By.xpath(cloudElementXpathDirectory.gitXpath));
		git.click();
		Thread.sleep(3000);
		
		WebElement gitEmail= driver.findElement(By.xpath(cloudElementXpathDirectory.gitEmailXpath));
		gitEmail.sendKeys(prop.getProperty("gitUserName"));
		Thread.sleep(3000);
		
		WebElement gitPassword = driver.findElement(By.xpath(cloudElementXpathDirectory.gitPasswordXpath));
		gitPassword.sendKeys(prop.getProperty("gitPassword"));;
		Thread.sleep(3000);
		
		WebElement gitSignUp = driver.findElement(By.xpath(cloudElementXpathDirectory.gitSignUpXpath));
		gitSignUp.click();
		Thread.sleep(3000);
		
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}

	}

	public void signUp(WebDriver driver,Properties prop) {
		try {
		WebElement name = driver.findElement(By.xpath(cloudElementXpathDirectory.userNameXpath));
		name.sendKeys(prop.getProperty("userName"));
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath(cloudElementXpathDirectory.passwordXpath));
		password.sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath(cloudElementXpathDirectory.loginXpath));
		login.click();
		Thread.sleep(10000);
		
		WebElement decline =driver.findElement(By.xpath(cloudElementXpathDirectory.decline));
		decline.click();
		
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
      }
	public void addInctance(WebDriver driver,Properties prop) {
		
		try {
			
			WebElement instance =driver.findElement(By.xpath(cloudElementXpathDirectory.instanceXpath));
			instance.click();
			Thread.sleep(10000);
			
			WebElement createButton =driver.findElement(By.xpath(cloudElementXpathDirectory.createInstanceXpath));
		    createButton.click();
		    Thread.sleep(3000);
		    
		    WebElement driveSreach = driver.findElement(By.xpath(cloudElementXpathDirectory.searchElementXpath));
		    driveSreach.sendKeys(prop.getProperty("folderSearch"));
		    Thread.sleep(5000);
		    
		    WebElement add = driver.findElement(By.xpath(cloudElementXpathDirectory.addButtonXpath));
		    add.click();
		    Thread.sleep(5000);
		    
		    WebElement instanceName = driver.findElement(By.xpath(cloudElementXpathDirectory.instanceNameXpath));
		    instanceName.sendKeys(prop.getProperty("instanceCreate"));
		    Thread.sleep(2000);
		    
		    WebElement addInstance =driver.findElement(By.xpath(cloudElementXpathDirectory.addInstanceButtonXpath));
		    addInstance.click();
		    Thread.sleep(8000);
		    
			ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTab.get(1));
			
			WebElement instanceEmail = driver.findElement(By.xpath(cloudElementXpathDirectory.instanceEmailXpath));
			instanceEmail.sendKeys(prop.getProperty("gmailName"));
			Thread.sleep(5000);
			
			WebElement next =driver.findElement(By.xpath(cloudElementXpathDirectory.nextXpath));
			next.click();
			Thread.sleep(5000);
			
			WebElement instancepassword = driver.findElement(By.xpath(cloudElementXpathDirectory.instancePasswordXpath));
			instancepassword.sendKeys(prop.getProperty("gmailPassword"));
			Thread.sleep(5000);
			
            WebElement next1 = driver.findElement(By.xpath(cloudElementXpathDirectory.nextXpath1));
            next1.click();
            Thread.sleep(5000);
			
			WebElement allow = driver.findElement(By.xpath(cloudElementXpathDirectory.allowXpath));
			allow.click();

				
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}
	
	public void sreachInstance(WebDriver driver,Properties prop) {
		try {
			
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(0));
		Thread.sleep(10000);
		WebElement instance = driver.findElement(By.xpath(cloudElementXpathDirectory.instanceXpath));
		instance.click();
		Thread.sleep(5000);
		
		WebElement searchInstance =driver.findElement(By.xpath(cloudElementXpathDirectory.searchInstance));
		searchInstance.sendKeys(prop.getProperty("instanceCreate"));
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	 
	
}
