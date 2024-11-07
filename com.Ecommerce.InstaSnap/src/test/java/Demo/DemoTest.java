package Demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
	@Test
	public void verify() throws IOException {
		//Configure the Browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to the Application
		driver.get("https://mvnrepository.com/artifact/com.aventstack/extentreports/5.1.2");
		
		WorkbookFactory.create(false);
		
		
	}

}
