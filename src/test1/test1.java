package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 功能自动化测试实验
 *
 */
public class test1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver s=new FirefoxDriver();
		s.get("http://www.baidu.com");
		WebElement loginLink=s.findElement(By.partialLinkText("登"));
		loginLink.click();
		WebElement button=s.findElement(By.id("/html/body/div/input[@value='查询']"));
		
	}

}

