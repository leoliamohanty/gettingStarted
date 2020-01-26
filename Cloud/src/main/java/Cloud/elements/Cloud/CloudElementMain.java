package Cloud.elements.Cloud;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloudElementMain {

public static void main (String arg[]) {
	
	CloudElementFunctions cloudElementFunctions = new CloudElementFunctions();
	CloudElementMain  clMain = new CloudElementMain();

  try {
	try {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/Cloud/elements/ChromeExecutable/chromedriver");
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	WebDriver driver = new ChromeDriver();
	
	try {
		Properties prop =clMain.loadConfig();
		driver.get("http://my.cloudelements.io/");
		driver.manage().window().maximize();
		cloudElementFunctions.gitSignUp(driver, prop);
		driver.get("http://my.cloudelements.io/");
		cloudElementFunctions.signUp(driver, prop);
		cloudElementFunctions.addInctance(driver, prop);
		cloudElementFunctions.sreachInstance(driver, prop);
	}catch(Exception e) {
		e.printStackTrace();
	}
}catch(Exception e) {
	e.printStackTrace();
	
}
}
public Properties loadConfig()  {
  try {  Properties prop = new Properties();
			String gitUserName = "leolia.mohanty05@gmail.com";
			String gitPassword = "sarit1487";
			String userName = "leolia.mohanty@gmail.com";
			String password = "abc@1234";
			String folderSearch = "drive";
			String instanceCreate = "neww10";
			String gmailName = "info.leoliamohanty@gmail.com";
			String gmailPassword = "Abcd@1234";
			prop.setProperty("gitUserName", gitUserName);
			prop.setProperty("gitPassword", gitPassword);
			prop.setProperty("userName", userName);
			prop.setProperty("password", password);
			prop.setProperty("folderSearch", folderSearch);
			prop.setProperty("instanceCreate", instanceCreate);
			prop.setProperty("gmailName", gmailName);
			prop.setProperty("gmailPassword", gmailPassword);
			return prop;
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    	return null;
	}
}

}
