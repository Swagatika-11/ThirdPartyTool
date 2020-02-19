package autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToFacebook {
	public WebDriver driver=null;
	public static String drivername="webdriver.chrome.driver";
	public static String driverpath="C:\\Users\\Mamalima\\eclipse-workspace\\ThirdPartyToolsDemo\\Drivers\\chromedriver.exe";
	public static WebDriverWait wait=null;
	@BeforeMethod
	public void PreCondition() {
		System.setProperty(drivername, driverpath);
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement convertEng=driver.findElement(By.xpath("//a[text()='English (US)']"));
		convertEng.click();
		wait=new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void LoginToFacebook()throws Exception {
		Screen screen=new Screen();
		Pattern username=new Pattern("E:\\Sikuli\\Username.png");
		Pattern password=new Pattern("E:\\Sikuli\\Password.png");
		Pattern login=new Pattern("E:\\Sikuli\\LogIn.png");
		Thread.sleep(1000);
		screen.wait(password, 10);
		screen.type(username,"9658729492");
		screen.type(password,"Mama@lima11");
		screen.click(login);
		
		
	}
	

}

