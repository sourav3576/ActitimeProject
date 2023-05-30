package sourav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTheUrl {
	static {
		System.setProperty("webdriver.chrome.driver", "./:driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumhq.org/");
		String expectedUrl=driver.getCurrentUrl();
		String actualUrl=driver.getCurrentUrl();
		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Url is succesfully navigating and pass");
		}else {
				System.out.println("Url is not successfully navigating and fail");
			}
	   driver.close();
	}
}
   
	


