import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\cnbna\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//System.setProperty("webdriver.edge.driver", projectPath+"\\drivers\\edgedriver\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		driver.get("http://biphrm-biplah-stg1.pegacloud.io/prweb/app/");
		
		//driver.findElement(By.id("txtUserID")).sendKeys("DK_TAMAManager");
		WebElement textBox = driver.findElement(By.id("txtUserID"));
		textBox.sendKeys("DK_TAMAManager");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement textBoxp = driver.findElement(By.id("txtPassword"));
		textBoxp.sendKeys(" Rules#137");
		driver.findElement(By.id("sub")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//driver.close();
	//driver.quit();
	}
}
