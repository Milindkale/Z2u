package Test;

import org.testng.annotations.Test;

import Controller.GetQuote_Scenarios;
import Controller.LaunchBrowser_inCrossBrowser;
import RequiredClassesfor_EachModule.LoginCredentialsfor_Login;
import bsh.ParseException;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.json.JSONException;
import org.testng.annotations.AfterTest;

public class GetQuote_Part18Test extends GetQuote_Scenarios {
 
	LoginCredentialsfor_Login objGetQuoteeopen = new LoginCredentialsfor_Login();

	@Test (priority=1)
	 public void GQ122() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		 objGetQuoteeopen.GetQuoteopen("farji123@gmail.com", "123456");	

		 RoadInterstatePriceVerification("VIC", "QLD");
		}
	
	@Test (priority=2)
	 public void GQ123() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		RoadInterstatePriceVerification("VIC", "ACT");		}
	
	@Test (priority=3)
	 public void GQ124() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		RoadInterstatePriceVerification("QLD", "NSW");		}
	
	@Test (priority=4)
	 public void GQ125() throws InterruptedException, ParseException, JSONException, IOException, java.text.ParseException
	{
		RoadInterstatePriceVerification("QLD", "VIC");		
		}
	
	
	
	
  @BeforeTest
  public void beforeTest() throws Exception {
	  LaunchBrowser_inCrossBrowser.OpenBrowser("Chrome", "61*64", "Windows 7 64-bit", "GetQuoteModule_Part6Test");

  }

  @AfterTest
  public void afterTest() {
	  LaunchBrowser_inCrossBrowser.driverclose();

  }

}
