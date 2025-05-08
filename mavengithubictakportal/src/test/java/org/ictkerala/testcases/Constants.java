package org.ictkerala.testcases;

import org.ictkerala.listeners.ScreenshotListener;
import org.testng.annotations.Listeners;

@Listeners(ScreenshotListener.class)
public class Constants {
	
	public static final String Expected_Message="Invalid username or password";
	public static final String Expected_msg="404: NOT_FOUND";
	public static final String Expected_Home="Admin Dashboard";
	public static final String SCREENSHOT_PATH = "D:\\ICTAK_SW_TESTING_COURSE\\Screenshots";

}
