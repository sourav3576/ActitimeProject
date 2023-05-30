package sourav;

import org.openqa.selenium.WebDriver;

public class Demo11 {
static void testA(WebDriver driver) {
	driver.get("https://www..com");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
}
}
