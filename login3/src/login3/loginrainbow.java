package login3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginrainbow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajai\\driv1\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://web.openrainbow.com/rb/2.110.9/index.html#/login");
		driver.findElement(By.id("username")).sendKeys("RKhudear@asaltech.com");
	//	driver.findElement(By.xpath("//*[@id=\"buttonHuaAFtmRax\"]/span[2]")).click();
		//driver.findElement(By.name(""))		
		driver.findElement(By.id("circle0nKXvymKkU")).click();
		driver.findElement(By.id("authPwd")).sendKeys("0000000000");
		driver.findElement(By.xpath("//*[@id=\"buttonfPDJMWJecV\"]/span[2]")).click();
		
	}

}
