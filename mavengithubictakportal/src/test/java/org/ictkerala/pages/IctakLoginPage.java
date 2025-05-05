package org.ictkerala.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IctakLoginPage {
	
	WebDriver driver;
	
	public IctakLoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void btnclk() {
		WebElement button =driver.findElement(By.xpath("//button[@class='btn2']"));
		button.click();
	}
	public void getUsername(String user) {
		WebElement userbox=driver.findElement(By.xpath("//input[@name='email']"));
		userbox.sendKeys(user);
	}
	public void getPasswd(String pass) {
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pass);
	}
	public void btnclklog()
	{
		WebElement logbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		logbutton.click();
		
	}




}
