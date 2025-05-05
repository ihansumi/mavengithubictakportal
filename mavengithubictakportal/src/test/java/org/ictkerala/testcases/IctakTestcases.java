package org.ictkerala.testcases;

import static org.testng.Assert.assertEquals;

import org.ictkerala.pages.IctakLoginPage;
import org.ictkerala.presettings.ConfigurationsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IctakTestcases extends ConfigurationsPage{
	
	IctakLoginPage lobj;
	String Expected_Message="Invalid username or password";
	String Expected_msg="404: NOT_FOUND";
	
	@BeforeClass
	public void objinit() {
		lobj=new IctakLoginPage(driver);
	}
	@Test
	public void TC_1_1_1() {
		lobj.btnclk();
		
	}
	@Test
	public void TC_2_1_1() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		
	}
	@Test
	public void TC_2_1_2() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("1111");
		lobj.btnclklog();
		String errmsg=lobj.errorMessage();
		assertEquals(errmsg, Expected_Message);		
	}
	@Test
	public void TC_2_1_3() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("icexample.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		String errmsg=lobj.errorMessage();
		assertEquals(errmsg, Expected_Message);
	}
	@Test
	public void TC_2_1_4() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.blankusername();
		lobj.getPasswd("0000");
		lobj.btnclklog();
		
	}
	@Test
	public void TC_2_1_5(){
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.blankpassword();
		lobj.btnclklog();
		
	}
	@Test
	public void TC_2_1_6() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.blankemailpassword();
		lobj.btnclklog();
	}
	@Test
	public void TC_3_1_1() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("Software Testing");
		lobj.pjduration("6");
		lobj.butadd();

	}
	@Test
	public void TC_3_1_2() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("Software Testing");
		lobj.pjduration("6 months");
		lobj.butadd();
	}
	@Test
	public void TC_3_1_3() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("Software Testing");
		lobj.butadd();
		lobj.blankDurtopic();	
	}
	@Test
	public void TC_3_1_4() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjduration("6 months");
		lobj.butadd();
		lobj.blankDurtopic();
		
	}
	@Test
	public void TC_3_1_5() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.butadd();
		lobj.blankDurtopic();
	}
	@Test
	public void TC_3_1_6() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("@#$%%%&**(");
		lobj.pjduration("6 months+-**///");
		lobj.butadd();
		lobj.invalidFormats();
	}
	@Test
	public void TC_3_1_7() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("@#$%%%&**( ");
		lobj.pjduration("8888");
		lobj.butadd();
		lobj.invalidFormats();
	}
	@Test
	public void TC_3_1_8() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("abcdef+*-/*/*/");
		lobj.pjduration("+*-*/**-++");
		lobj.butadd();
		lobj.invalidFormats();
		
	}
	@Test
	public void TC_3_1_9() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("Software Tester");
		lobj.pjduration("Months");
		lobj.butadd();
		lobj.invalidFormats();
	}
    @Test
	public void TC_3_2_1() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("Software Tester");
		lobj.pjduration("6 Months");
		lobj.butadd();
		lobj.editmodifybutton();
		lobj.clearfields();
		lobj.pjtopic("Software Engineer");
		lobj.pjduration("6");
		lobj.updatebutton();		
	}
    @Test
    public void TC_3_2_2() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("Software Tester");
		lobj.pjduration("6 Months");
		lobj.butadd();
		lobj.editmodifybutton();
		lobj.clearfields();
		lobj.pjtopic("Software Tester");
		lobj.pjduration("8");
		lobj.updatebutton();				
	}
    @Test
    public void TC_3_2_3() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("Software Tester");
		lobj.pjduration("6 Months");
		lobj.butadd();
		lobj.editmodifybutton();
		lobj.clearfields();
		lobj.pjtopic("Python");
		lobj.pjduration("4");
		lobj.updatebutton();	
		
	}
       @Test
    	public void TC_3_3_1() {
		driver.get("https://ictak-internship-portal-client.vercel.app/");
		lobj.btnclk();
		lobj.getUsername("ictak@example.com");
		lobj.getPasswd("0000");
		lobj.btnclklog();
		lobj.addProj();
		lobj.pjtopic("COBOL");
		lobj.pjduration("1");
		lobj.butadd();
		lobj.deletebut();
		lobj.okbutton();
	}
       @Test
       public void TC_4_1_1() {
   		driver.get("https://ictak-internship-portal-client.vercel.app/");
   		lobj.btnclk();
   		lobj.getUsername("ictak@example.com");
   		lobj.getPasswd("0000");
   		lobj.btnclklog();
   		lobj.logout();
   		driver.get("https://ictak-internship-portal-client.vercel.app/admin");
   		String error=lobj.errorcode();
   		assertEquals(error, Expected_msg); 		
   	}	
}
