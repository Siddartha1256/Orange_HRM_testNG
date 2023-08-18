package projectOrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobHRM {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(2000);
        
        //login
        
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Admin']")).click();
        
        
      //job title
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Job ']")).click(); //job
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Job Titles']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Automation");
        driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("2+ years of exprince in seleium"); 
        	
        //	 driver.findElement(By.xpath("//div[@class='oxd-file-button']")).click();
        
        driver.findElement(By.xpath("//textarea[@placeholder='Add note']") ).sendKeys("Basics of core java");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']") ).click();
        Thread.sleep(2000);
        
        //pay grades
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.='Job ']")).click();
        driver.findElement(By.xpath("//a[.='Pay Grades']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Grade8");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
        //Employee status
        
        driver.findElement(By.xpath("//span[.='Job ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Employment Status']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("full time");      
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
 
        //Job Categories
        
        driver.findElement(By.xpath("//span[.='Job ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Job Categories']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Cloud engineering");      
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.quit();
 
       // driver.findElement(By.xpath("//i[contains(@class,'oxd-icon bi-plus oxd-button-icon')]")).click();
       // driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
       // driver.findElement(By.xpath("(//div[.='Admin'])[5]")).click();

	}
}
