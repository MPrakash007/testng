package selinium.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GmailCheck {
@Test
	public static void createlead() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mprakash\\Desktop\\PROJECT\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Altimetrik");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prakash");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mihir");
		
		 
			WebElement month = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		   Select dropdown = new Select(month); 
		   
		  dropdown.selectByVisibleText("Direct Mail"); 
		 
		/*
		 * dropdown.selectByValue("5"); // Thread.sleep(2000); //
		 * dropdown.selectByIndex(8);
		 */
		 
		driver.findElement(By.className("smallSubmit")).click();
		
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();

		String tt = "Mihir";
		driver.close();
		if (name.equalsIgnoreCase(tt)) {
			System.out.println("Test successfull");
		} else {
			System.out.println("Test Failure");
		}

	}
}
