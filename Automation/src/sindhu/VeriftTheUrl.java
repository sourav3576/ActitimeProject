//write  a script to check whether the selenium.hq.org is navigating to selenium.dev

package sindhu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeriftTheUrl {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(5000);
	driver.get("http://selenium.hq.org/");
	Thread.sleep(5000);
	String expectedurl = "https://www.selenium.dev/";
	Thread.sleep(5000);
	String actualurl = driver.getCurrentUrl();
	Thread.sleep(5000);
	if(expectedurl.equals(actualurl)) {
		System.out.println("Url is successfully navigating and pass");
	}
	else
	{
		System.out.println("url is not successfully navigating and fail");
	}
	driver.close();
}
}
