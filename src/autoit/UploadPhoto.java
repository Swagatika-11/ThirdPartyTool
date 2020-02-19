package autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadPhoto {
	public static WebDriver driver=null;
	public static String drivername="webdriver.chrome.driver";
	public static String driverpath="C:\\Users\\Mamalima\\eclipse-workspace\\ThirdPartyToolsDemo\\Drivers\\chromedriver.exe";
	public static WebDriverWait wait=null;
	ChromeOptions options = new ChromeOptions();
	@BeforeMethod
	public void PreCondition() {
		System.setProperty(drivername, driverpath);
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		wait=new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void RunAutoIt() {
		try {
			Thread.sleep(1000);
			Runtime.getRuntime().exec("E:\\ToUpload\\Attachment1.exe");
		}catch(Exception e){
			System.out.println("Unable to upload the attachment");
			
			
		}
	}
	@Test
	public void UploadPhoto() throws Exception{
		driver.get("https://www.facebook.com");
		WebElement convertEng=driver.findElement(By.xpath("//a[text()='English (US)']"));
		convertEng.click();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("9658729492");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Mama@lima11");
		WebElement btnLogIn=driver.findElement(By.xpath("//input[@value='Log In']"));
		btnLogIn.click();
		wait.until(ExpectedConditions.titleContains("Facebook"));
		driver.findElement(By.xpath("//a[@data-testid=\"left_nav_item_Swagatika Kar\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@label='Photo/Video']")).click();
		RunAutoIt();
		
		//driver.findElement(By.xpath("//span[text()='Create post']")).click();
		//Thread.sleep(1000);
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//*[@id=\"js_5s\"]")).click();
		//driver.findElement(By.xpath("//div[text()='Photo/Video']")).click();
		
		
		
		
		
		
	}
	
	@AfterMethod
	public static void CloseBrowser() {
		
	}
	
	

}
