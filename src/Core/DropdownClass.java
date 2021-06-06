package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropdownClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://automationpractice.com/index.php";
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement Signinbutton = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		Signinbutton.click();
		Thread.sleep(3000);
		
		WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='email_create']"));
		EnterEmail.sendKeys("vaishali123@yopmail.com");
		WebElement submit = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		submit.click();
		
		Thread.sleep(5000);
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		gender.click();
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		Firstname.sendKeys("Rahul");
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		Lastname.sendKeys("Patil");
		WebElement Password = driver.findElement(By.xpath("//input[@name='passwd']"));
		Password.sendKeys("Test123");
		
		//Select DOB
		WebElement DOB = driver.findElement(By.name("days"));
		Select days = new Select(DOB);
		days.selectByVisibleText("1  ");
		WebElement Month = driver.findElement(By.xpath("//select[@id='months']"));
		Select Month1 = new Select(Month);
		Month1.selectByVisibleText("January ");
		WebElement Year = driver.findElement(By.xpath("//select[@id='years']"));
		Select Year1 = new Select(Year);
		Year1.selectByVisibleText("2004  ");
	
		Thread.sleep(3000);
		WebElement Firstname1 = driver.findElement(By.xpath("//input[@id='firstname']"));
		Firstname1.sendKeys("Rahul");
		WebElement Lastname1 = driver.findElement(By.xpath("//input[@id='lastname']"));
		Lastname1.sendKeys("Patil");
		WebElement Companyname = driver.findElement(By.xpath("//input[@id='company']"));
		Companyname.sendKeys("ABC Company");
		WebElement Address = driver.findElement(By.xpath("//input[@id='address1']"));
		Address.sendKeys("150,GPRA quarters");
		WebElement City = driver.findElement(By.xpath("//input[@id='city']"));
		City.sendKeys("Pune");
		WebElement State = driver.findElement(By.name("id_state"));
		State.sendKeys("Maharashtra");
		WebElement Postcode = driver.findElement(By.xpath("//input[@id='postcode']"));
		Postcode.sendKeys("12342");
		WebElement Country = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select Country1 = new Select(Country);
		Country1.selectByVisibleText("United States");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		Phone.sendKeys("9821389128309");
		WebElement Alias =driver.findElement(By.xpath("//input[@name='alias']"));
		Alias.sendKeys("ABC");
		
		Thread.sleep(3000);
		WebElement Submit = driver.findElement(By.xpath("//button[@name='submitAccount']"));
		Submit.click();
				
		
		
		
	//	teardown();			//to quit the browser
	}
	public static void teardown(){
		driver.quit();
		
	}
}
