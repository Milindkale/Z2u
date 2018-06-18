package RequiredClassesfor_EachModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import CommonLibraries.AddressesForEachstate;
import CommonLibraries.Driverwaitclass;
import CommonLibraries.GetQuoteLocators;
import CommonLibraries.URL_Staging;
import Controller.LaunchBrowser_inCrossBrowser;

public class DirectDriveRedirect_Verification extends LaunchBrowser_inCrossBrowser {
   
	GetQuoteLocators objGetQuote = new GetQuoteLocators();
	AddressesForEachstate objAddress = new AddressesForEachstate();
	URL_Staging objurl = new URL_Staging();
	WebElement element;
	public void DirectDriveRedirect_Verify(String Pickupstate,String Dropoffstate, String Weight,String Shipment,String quantityvalue) throws InterruptedException{
		System.out.println("GQ20:" + Shipment + ":" + " " + "with" + " " + Pickupstate + " " + "and" + Dropoffstate + " " + "started");
	
		   String Pick;
		   String Drop;
		   String Documentquan = null;
		   String laptopsquan = null;
		   String flowersquan = null;
		   String SmallBoxquan = null;
		   String LargeBoxquan = null;
		   String PriceValue = null;
		   
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentShipmentLocator())));

		   
		   if(Shipment.equals("Documents")){
			   			   
			   driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			   }
		   if(Shipment.equals("Satchel, laptops")){
			   
			   driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			  
			   }

		   if(Shipment.equals("Cakes, flowers, delicates")){
	   
			   driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			  
		      
	   }

		   if(Shipment.equals("Small Box")){
	   
			   driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			  
		       
	   }
		   if(Shipment.equals("Large Box")){
			   
			   driver.findElement(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())).sendKeys(quantityvalue);
			   driver.findElement(By.xpath(objGetQuote.PickupaddresstextfieldLocator())).sendKeys(Keys.TAB);
			   
		       
	   }   
    if(Pickupstate.equalsIgnoreCase("NSW")) {
			   
			   Pick = objAddress.PickNSWState();
			   if (Dropoffstate.equalsIgnoreCase("ACT")){
				   Drop = objAddress.DropACTState();
			   }
		    }
          else  if(Pickupstate.equalsIgnoreCase("ACT")) {
					   
					   Pick = objAddress.PickACTState();
					   if (Dropoffstate.equalsIgnoreCase("NSW")){
					       Drop = objAddress.DropNSWState();
					   }
		    }
    
		   driver.findElement(By.xpath(objGetQuote.PickupGetQuoteDateLocator())).sendKeys(Keys.TAB);
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")));

		   WebElement element1 = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input"));
		    ((JavascriptExecutor) driver).executeScript(
		            "arguments[0].scrollIntoView();", element1);
		   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).sendKeys(Keys.TAB);
		   driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).sendKeys(Weight);
		   String weight = driver.findElement(By.xpath(".//*[@id='quoteForm']/div[1]/div/div[6]/div[2]/input")).getAttribute("value");
		   int InWeight = Integer.parseInt(weight);
		   driver.findElement(By.xpath(objGetQuote.Getquotebtn())).sendKeys(Keys.TAB);
		   driver.findElement(By.xpath(objGetQuote.Getquotebtn())).sendKeys(Keys.ENTER);
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())));

		   
		   if(Shipment.equals("Documents")){
			   
			   Documentquan = driver.findElement(By.xpath(objGetQuote.DocumentQuantitytextfieldLocator())).getAttribute("value");
			   System.out.println("quantity value is" + Documentquan);
			   }
		   if(Shipment.equals("Satchel, laptops")){
			   
			   laptopsquan = driver.findElement(By.xpath(objGetQuote.LaptopsQuantitytextfieldLocator())).getAttribute("value");
			   System.out.println("quantity value is" + laptopsquan);
			   }

		   if(Shipment.equals("Cakes, flowers, delicates")){
	   
			   flowersquan = driver.findElement(By.xpath(objGetQuote.FlowersQuantitytextfieldLocator())).getAttribute("value");
			   System.out.println("quantity value is" + flowersquan);
		      
	   }

		   if(Shipment.equals("Small Box")){
	   
			   SmallBoxquan = driver.findElement(By.xpath(objGetQuote.SmallBoxQuantitytextfieldLocator())).getAttribute("value");
			   System.out.println("quantity value is" + SmallBoxquan);
		       
	   }
		   if(Shipment.equals("Large Box")){
			   
			   LargeBoxquan = driver.findElement(By.xpath(objGetQuote.LargeBoxQuantitytextfieldLocator())).getAttribute("value");
			   System.out.println("quantity value is" + LargeBoxquan);
		       
	   }   
           
		   String Pickupstreetname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[3]/div[2]/div[1]/div/input[2]")).getAttribute("value");
		   System.out.println("pickup street name is" + Pickupstreetname);
		   String Dropoffstreetname = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[3]/div[2]/div[2]/div/input[2]")).getAttribute("value");
		   System.out.println("pickup street name is" + Dropoffstreetname);
		   String Weightvalue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[6]/div[2]/input")).getAttribute("value");
		   System.out.println("Weightvalue is" + Weightvalue);
		   
		   if((Pickupstate.equalsIgnoreCase("NSW") && Dropoffstate.equalsIgnoreCase("ACT")) || (Pickupstate.equalsIgnoreCase("ACT") && Dropoffstate.equalsIgnoreCase("NSW"))){
			   {
				   PriceValue = driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[3]/div[2]/span")).getText();
	   				driver.findElement(By.xpath(".//*[@id='quoteForm']/div/div/div[7]/div[3]/button")).sendKeys(Keys.ENTER);
	   }
	   		
			   
		   }
		   element= Driverwaitclass.Driverwait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]")));				   
		   String currenturl = driver.getCurrentUrl();
		   Assert.assertEquals(currenturl, objurl.BookingPage());
		   
		   if(Shipment.equals("Documents")){
			   
			   String ActualDocumentquan = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[3]/input")).getAttribute("value");
			   System.out.println("quantity value is" + ActualDocumentquan);
			   org.testng.Assert.assertEquals(ActualDocumentquan, Documentquan);
			   }
		   if(Shipment.equals("Satchel, laptops")){
			   
			   String Actuallaptopsquan = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[4]/input")).getAttribute("value");
			   System.out.println("quantity value is" + Actuallaptopsquan);
			   org.testng.Assert.assertEquals(laptopsquan, Actuallaptopsquan);			   }

		   if(Shipment.equals("Cakes, flowers, delicates")){
	   
			   String Actualflowersquan = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[6]/input")).getAttribute("value");
			   System.out.println("quantity value is" + Actualflowersquan);
			   org.testng.Assert.assertEquals(flowersquan, Actualflowersquan);
		      
	   }

		   if(Shipment.equals("Small Box")){
	   
			   String ActualSmallBoxquan = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[5]/input")).getAttribute("value");
			   System.out.println("quantity value is" + ActualSmallBoxquan);
			   org.testng.Assert.assertEquals(SmallBoxquan, ActualSmallBoxquan);
		       
	   }
		   if(Shipment.equals("Large Box")){
			   
			   String ActualLargeBoxquan = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[2]/div/div[7]/input")).getAttribute("value");
			   System.out.println("quantity value is" + ActualLargeBoxquan);
			   org.testng.Assert.assertEquals(LargeBoxquan, ActualLargeBoxquan);
		       
	   }   
		   
		   String ActualPickstreetnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
		   String ActualPickstreetname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[4]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
		   
		   System.out.println("Pickup address is" + " " + ActualPickstreetnumber + " " + ActualPickstreetname);
		   Assert.assertEquals(ActualPickstreetnumber + " " + ActualPickstreetname, Pickupstreetname);
		   driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[4]/div[2]/div/input")).sendKeys(Keys.TAB);
		   String ActualDropstreetnumber = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[4]/div[2]/div/input")).getAttribute("value");
		   String ActualDropstreetname = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[6]/div/div[2]/div[1]/div[5]/input")).getAttribute("value");
		   if(Dropoffstate.equals("NSW")){
			   System.out.println("Dropoff address is" + " " + ActualDropstreetname);
			   Assert.assertEquals(ActualDropstreetnumber + " " +ActualDropstreetname, Dropoffstreetname);
		   }
		   else{
		   System.out.println("Dropoff address is" + " " + ActualDropstreetname);
		   Assert.assertEquals(ActualDropstreetname, Dropoffstreetname);
		   }
		   
		   String Actualweight = driver.findElement(By.xpath(".//*[@id='weight']")).getAttribute("value");
		   System.out.println("weight is" + Actualweight);
		   Assert.assertEquals(Actualweight, Weightvalue);
		   
		   if((Pickupstate.equalsIgnoreCase("NSW") && Dropoffstate.equalsIgnoreCase("ACT")) || (Pickupstate.equalsIgnoreCase("ACT") && Dropoffstate.equalsIgnoreCase("NSW"))){
			   				   
				   String ActualPricevalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[1]/div/div[10]/div[3]/div[2]/span")).getText();
				   System.out.println("boolean another value is=" + ActualPricevalue);
			       Assert.assertEquals(ActualPricevalue, PriceValue);
	   }
	   			
		   
		   
		   String footervalue = driver.findElement(By.xpath(".//*[@id='bookingForm']/div[2]/span[1]")).getText();
		   Assert.assertEquals(footervalue, PriceValue);
		   driver.findElement(By.xpath(objGetQuote.Getquotetextlocator_AvailableinHambergerMenu())).click();
	        Thread.sleep(5000);
	        System.out.println("GQ20:" + Shipment + ":" + " " + "with" + " " + Pickupstate + " " + "and" + Dropoffstate + " " + "completed");

}

		
	
}
