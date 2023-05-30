//Write a script to print html source code of the webpage

package sindhu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlCode {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	String htmlcode = driver.getPageSource();
	System.out.println(htmlcode);
	driver.close();
}
}
