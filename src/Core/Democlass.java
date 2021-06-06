package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
		driver.manage().window().maximize();
//	String CurrentTitle = driver.getTitle();
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		gender.click();
//		System.out.println(CurrentTitle);
		
		
	}

}
