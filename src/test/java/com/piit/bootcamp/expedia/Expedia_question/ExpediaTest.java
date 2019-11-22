package com.piit.bootcamp.expedia.Expedia_question;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ExpediaTest {
	WebDriver driver;
  @Test
   
  public void f() throws InterruptedException {
	  Expedia_home booking=new Expedia_home (driver);
	  booking.ClickFlight();
	  booking.InsertDep("Washington, DC (IAD-Washington Dulles Intl.)");
	  booking.InsertDis("Dubai, United Arab Emirates (DXB-Dubai Intl.)");
	  booking.ClickDepartBox();
	  booking.SelectDepDate();
	  booking.ClickRtnBox();
	  booking.SelectRtnDate();
	  booking.ClickSearch();
	  Thread.sleep(8000);
	  booking.ClickDepFlight();
	  booking.ClickReFlight();
	  booking.ClickNoThanks();
	  booking.ClickBooking();
	  booking.InsertFirstName();
	  booking.InsertLastName();
	  booking.InsertPhone();
	  booking.ClickGender();
	  booking.SelectMonth();
	  booking.SelectDate();
	  booking.SelectYear();
	
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/jalaluddinkasaat/eclipse-workspace/newBrambleton/src/chromedriver");
		driver = new ChromeDriver();
	  driver.navigate().to("https://www.expedia.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	 // driver.quit();
  }

}
