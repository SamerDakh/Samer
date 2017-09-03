import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Facebook {

	public Facebook() throws InterruptedException {
		String email="samer.dakhlalla@gmail.com";
		String pass="";
		//	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		//
		//	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//	capabilities.setCapability("chrome.binary",	"C:\\Users\\New\\Desktop\\chromedriver.exe");
		//
		//	
		//	ChromeOptions options = new ChromeOptions();
		//	options.addArguments("test-type");
		//	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//	//WebDriver driver = new ChromeDriver();
		//	WebDriver driver = new FirefoxDriver();
		//	driver.get("https://www.facebook.com/");
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		

		driver.get("http://facebook.com");
		
		//WebElement email= driver.findElement(By.id("identifierId"));
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//*[@title='Profile']")).click();	
		//	driver.findElement(By.id("identifierNext")).click();;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Friends']")).click();
		Thread.sleep(5000);
//		driver.manage().window().maximize();
		//List<WebElement> list=(List<WebElement>) driver.findElement(By.xpath("//div[@xlass='fsl fwb fcb']/a"));
int cnt=0;
List<WebElement> myElements;
WebElement scroll = driver.findElement(By.xpath("//*[@id=\"pagelet_timeline_medley_movies"));
scroll.sendKeys(Keys.PAGE_DOWN);
		
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		By mySelector = By.xpath("//div[@class='fsl fwb fcb']");
		 myElements = driver.findElements(mySelector);
	//	cnt=cnt+myElements.size();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
	//	jse.executeScript("window.scrollBy(0,450)", "");
		
		
		
	for(WebElement e : myElements) {
		
		System.out.println(e.getText());
	}
	}
}
