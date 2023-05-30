package sourav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintHtml1{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		String htmlcode=driver.getPageSource();
		Thread.sleep(3000);
		System.out.println(htmlcode);
		driver.quit();
	}
}

	



	
		


