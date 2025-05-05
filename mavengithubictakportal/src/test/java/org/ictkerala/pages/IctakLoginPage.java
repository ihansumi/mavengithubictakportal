package org.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
	public String errorMessage()
	 {
		WebElement errormsg = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-1tmw1eq']"));
		String error=errormsg.getText();
		return error;
	 }
	public void blankusername() {
		WebElement emailField = driver.findElement(By.name("email"));
		String validationMessage = (String)((JavascriptExecutor) driver)
		    .executeScript("return arguments[0].validationMessage;", emailField);
		System.out.println("Validation Message: " + validationMessage);

	}
	public void blankpassword() {
		WebElement passwordField = driver.findElement(By.name("password"));
		String validationMessage = (String)((JavascriptExecutor) driver)
		        .executeScript("return arguments[0].validationMessage;", passwordField);

		    System.out.println("Validation Message (blank password): " + validationMessage);
	}
	public void blankemailpassword() {
		 WebElement emailField = driver.findElement(By.name("email"));
		    WebElement passwordField = driver.findElement(By.name("password"));
		    String validationMessage = (String)((JavascriptExecutor) driver)
		            .executeScript("return arguments[0].validationMessage;", emailField);

		        System.out.println("Validation Message (blank email and password): " + validationMessage);
	}
	
	public void addProj() {
		WebElement addpj=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']"));
		addpj.click();
	}
	public void pjtopic(String top) {
		WebElement topic=driver.findElement(By.xpath("//input[@name='topic']"));
		topic.sendKeys(top);
	}
	public void pjduration(String duration) {
		WebElement dur=driver.findElement(By.xpath("//input[@name='duration']"));
		dur.sendKeys(duration);
	}
	public void butadd() {
		WebElement add=driver.findElement(By.xpath("//button[text()='Add']"));
		add.click();
	}
	public void blankDurtopic() {
		try {
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        System.out.println("Alert Message: " + alertText);
	        alert.accept();
	    } catch (NoAlertPresentException e) {
	        System.out.println("No alert is present.");
	    }
	}
	public void invalidFormats(){
		try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Message: " + alertText);

            // Check the message
            Assert.assertEquals(alertText.trim(), "Please enter a valid topic", "Unexpected alert message.");
            alert.accept();  // Dismiss the alert
        } catch (NoAlertPresentException e) {
            // Fail test if alert is not present
            Assert.fail("Alert not displayed for invalid credentials(Invalid topic or duration/Invalid topic and duration)");
        }
    }
	public void editmodifybutton() {
		WebElement editbut=driver.findElement(By.xpath("//button[.//*[name()='svg' and @data-testid='EditIcon']]"));
		editbut.click();
	}
	public void updatebutton() {
		WebElement updbut=driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		updbut.click();
	}
	public void clearfields() {
		WebElement topicField = driver.findElement(By.xpath("//input[@name='topic']"));  
		WebElement durationField = driver.findElement(By.xpath("//input[@name='duration']"));

		// Clear existing content
		topicField.clear();
		durationField.clear();	
	}
	public void deletebut() {
		
		WebElement delete=driver.findElement(By.xpath("//button[normalize-space()='DeleteIcon']"));
		delete.click();

	}
	public void okbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
		okButton.click();

	}
	public void logout() {
		WebElement logoutbutt=driver.findElement(By.xpath("//div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-16e9raa']"));
		logoutbutt.click();
	}
	public String errorcode() {
		WebElement err=driver.findElement(By.xpath("//span[@class='error-code']"));
		String code=err.getText();
		return code;
	}

	}

