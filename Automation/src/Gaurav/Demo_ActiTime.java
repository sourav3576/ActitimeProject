package Gaurav;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_ActiTime {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
//enter the url
driver.get("https://demo.actitime.com/");
driver.findElement(By.id("username")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(2000);
driver.findElement(By.linkText("Login")).click();
driver.findElement(By.id("logoutLink")).click();
driver.close();

	}

}
