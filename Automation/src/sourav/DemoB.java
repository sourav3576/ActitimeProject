package sourav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {
    static {
    	System.setProperty("webdriver.chrome.driver", "./driver/geckodriver.exe");
    }
	public static void main(String[] args) {
     WebDriver driver=new FirefoxDriver();
     Demo11.testA(driver);
	},
}
