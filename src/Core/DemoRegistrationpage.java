package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoRegistrationpage {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		String url ="http://demo.guru99.com/test/newtours/register.php";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		Firstname.sendKeys("Vaishali");
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		Lastname.sendKeys("Akhade");
		WebElement Phone = driver.findElement(By.xpath("//input[@name='phone']"));
		Phone.sendKeys("9099989990");
		
		WebElement EmailId = driver.findElement(By.name("userName"));
		EmailId.sendKeys("vaishali123@yopmail.com");
		
		WebElement Address1 = driver.findElement(By.xpath("//input[@name='address1']"));
		Address1.sendKeys("GPRA quarters,Pune");
		WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
		City.sendKeys("Pune");
		WebElement State = driver.findElement(By.xpath("//input[@name='state']"));
		State.sendKeys("Maharashtra");
		WebElement Postacode = driver.findElement(By.xpath("//input[@name='postalCode']"));
		Postacode.sendKeys("36248732");
		
		WebElement CountryDDL =driver.findElement(By.xpath("//select[@name='country']"));
		Select Country = new Select(CountryDDL);
		Country.selectByVisibleText("AUSTRIA");
		
		WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
		Username.sendKeys("Vaishali123");
		WebElement Pass = driver.findElement(By.xpath("//input[@name='password']"));
		Pass.sendKeys("Test@123");
		WebElement ConfirmPass = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		ConfirmPass.sendKeys("Test@123");
		WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
		Submit.click();
		
		WebElement Signinlink = driver.findElement(By.linkText("sign-in"));
		Signinlink.click();
		
		Thread.sleep(3000);      
		
		teardown();
	}
	
		public static void teardown() {
			driver.quit();
			
		}
}
