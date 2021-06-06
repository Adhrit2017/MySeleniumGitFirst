package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2class {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//String url = "https://cadencedev.logapps.com/";
		String url = "https://www.flipkart.com/";
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
//		WebElement Username = driver.findElement(By.xpath("//input[@name='emailId']"));
//		Username.sendKeys("vaishali123@yopmail.com");
//		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
//		Password.sendKeys("Test@123");
//		WebElement ClickNext = driver.findElement(By.xpath("//button[@type='submit']"));
//		ClickNext.click();
		
//		WebElement Forgetpass = driver.findElement(By.xpath("//a[@class='d-block m-t-15 label underline colorWhite']"));
//		Forgetpass.click();
//		WebElement emailid = driver.findElement(By.xpath("//input[@name='emailId']"));
//		emailid.sendKeys("vaishali123@yopmail.com");
//		WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
//		click.click();
		
		WebElement closebutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closebutton.click();
		WebElement searchbyname = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		searchbyname.sendKeys("Kurties for women");
		
		Thread.sleep(5000);

		WebElement Submit = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		Submit.click();

	}

}
