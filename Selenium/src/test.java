import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	
	
	public test() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("http://www.mortgagecalculator.org/");
		
		WebElement homeValue=driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[1]/input"));
		homeValue.clear();
		homeValue.sendKeys("250000");
		WebElement loanAmt=driver.findElement(By.xpath("//*[@id=\"loanamt\"]"));
		loanAmt.clear();
		loanAmt.sendKeys("110000");
		
		
		WebElement loanErm=driver.findElement(By.xpath("//*[@id=\"loanterm\"]"));
		loanErm.clear();
		loanErm.sendKeys("12");

		driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[11]/input")).click();

		WebElement paymentwithPMI=driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[2]/div[2]/div[1]/div[1]/h3"));
		
		System.out.println("payment with PMI = "+paymentwithPMI.getText().replaceAll("[$]+|[,]+", ""));
		
		WebElement after26M=driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[2]/div[2]/div[1]/div[2]/h3"));
		
		System.out.println("payment with PMI after 26 Months = "+after26M.getText().replaceAll("[$]+|[,]+", ""));
		
			
	
	}

	
}
