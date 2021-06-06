package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String url = "http://automationpractice.com/index.php";
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
		WebElement Signinbutton = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		Signinbutton.click();
		
		WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='email_create']"));
		EnterEmail.sendKeys("vaishali.canwill@yopmail.com");
		WebElement submit = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		submit.click();
		
//		WebElement gender = driver.findElement(By.id("customer_firstname"));
//		gender.sendKeys("ABC");
		
		WebElement SearchBox = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		SearchBox.sendKeys("kurties for women");
		WebElement Submit_button = driver.findElement(By.xpath("//button[@name='submit_search']"));
		Submit_button.click();
		
		
		

		
		
		//teardown();			//to quit the browser
	}
	public static void teardown(){
		driver.quit();
		
	}
}
