package org.ictkerala.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.ictkerala.presettings.BaseTest;
import org.ictkerala.presettings.ConfigurationsPage;
import org.ictkerala.testcases.Constants;


public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Object testClass = result.getInstance();

        if (testClass instanceof ConfigurationsPage) {
            WebDriver driver = ((ConfigurationsPage) testClass).getDriver();

            // Ensure screenshot folder exists
            //String folderPath = System.getProperty("user.dir") + "/screenshots";
            String folderPath=Constants.SCREENSHOT_PATH;
            File screenshotDir = new File(folderPath);
            if (!screenshotDir.exists()) {
                screenshotDir.mkdirs(); // create folder if it doesn't exist
            }

            // Save screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String testName = result.getName();
            String destinationPath = folderPath + "/" + testName + ".png";

            try {
            	System.out.println("Screenshot should be saved at: " + destinationPath);
                FileUtils.copyFile(screenshot, new File(destinationPath));
                System.out.println("Saved screenshot for failed test: " + testName);
            } catch (IOException e) {
                System.err.println("Failed to save screenshot for: " + testName);
                e.printStackTrace();
            }
        }
    }
}


