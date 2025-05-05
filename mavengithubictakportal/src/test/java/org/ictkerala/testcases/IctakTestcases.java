package org.ictkerala.testcases;

import org.ictkerala.pages.IctakLoginPage;
import org.ictkerala.presettings.ConfigurationsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IctakTestcases extends ConfigurationsPage{
	
	IctakLoginPage lobj;
	
	@BeforeClass
	public void objinit() {
		lobj=new IctakLoginPage(driver);
	}
	@Test
	public void TC_1_1_1() {
		lobj.btnclk();
		
	}
	public void TC_2_1_1() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		
	}

}
