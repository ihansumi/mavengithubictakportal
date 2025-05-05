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

}
