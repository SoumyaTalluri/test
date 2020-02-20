package stepdefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	public void launchingDriver() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\QAInfotech\\Desktop\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://s2.demo.opensourcecms.com/orangehrm/index.php");
	 driver.manage().window().maximize();
	}
}
