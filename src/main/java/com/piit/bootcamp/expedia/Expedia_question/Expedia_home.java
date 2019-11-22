package com.piit.bootcamp.expedia.Expedia_question;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expedia_home {
	WebDriver driver;
	
	@FindBy (xpath ="//span[contains(@class,'tab-label')][contains(text(),'Flights')]")
	WebElement Flights;
	@FindBy (xpath="//input[@id='flight-origin-hp-flight']")
	WebElement From;
	@FindBy (xpath ="//input[@id='flight-destination-hp-flight']")
	WebElement To;
	
	@FindBy(xpath="//input[@id='flight-departing-hp-flight']")
	WebElement DepartBox;
	@FindBy (xpath="/html[1]/body[1]/meso-native-marquee[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/section[1]/form[1]/fieldset[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[2]/td[4]/button[1]")
	WebElement Depart;
	
	@FindBy(xpath="//input[@id='flight-returning-hp-flight']")
	WebElement ReturnBox;
	@FindBy (xpath="/html[1]/body[1]/meso-native-marquee[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/section[1]/form[1]/fieldset[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[4]/button[1]")
	WebElement Return;
	@FindBy (xpath="//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
	WebElement Search;
	@FindBy (xpath="//li[@id='flight-module-2019-12-11t13:20:00-05:00-coach-iad-ewr-ua-1811-coach-ewr-zrh-ua-134-coach-zrh-dxb-ua-9732_2019-12-25t02:15:00+04:00-coach-dxb-zrh-lx-243-coach-zrh-lhr-lx-316-coach-lhr-iad-lx-3062_']//button[@class='btn-secondary btn-action t-select-btn']")
	WebElement PickDepFlight;
	
	@FindBy (xpath="//li[@id='flight-module-2019-12-11t13:20:00-05:00-coach-iad-ewr-ua-1811-coach-ewr-zrh-ua-134-coach-zrh-dxb-ua-9732_2019-12-25t02:15:00+04:00-coach-dxb-zrh-lx-243-coach-zrh-lhr-lx-316-coach-lhr-iad-lx-3062_']//button[@class='btn-secondary btn-action t-select-btn']")
	WebElement PickReFlight;
	@FindBy (xpath="//a[@id='forcedChoiceNoThanks']")
	WebElement NoThanks;

	@FindBy (className="btn-primary btn-action bookButton")
	WebElement Booking;
	@FindBy (id="firstname[0]")
	WebElement Firstname;
	@FindBy (id="lastname[0]")
	WebElement Lastname;
	@FindBy (id="phone-number[0]")
	WebElement Phone;
	@FindBy (id="gender_male[0]")
	WebElement Gender;
	@FindBy (xpath ="//option[contains(text(),'05 - May')]")
	WebElement Month;
	@FindBy (xpath="//select[@id='date_of_birth_day[0]']//option[contains(text(),'15')]")
	WebElement Day;
	@FindBy (xpath="//option[contains(text(),'1983')]")
	WebElement Year;
	
	public Expedia_home (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void ClickFlight () {
		Flights.click();
}
	public void InsertDep (String dep) {
		From.sendKeys(dep);
	}
	public void InsertDis (String rtn) {
		
		To.sendKeys(rtn);
	}
	
	public void ClickDepartBox () {
		DepartBox.click();
		
	}
	public void SelectDepDate () {
		Depart.click();
		
	}
		
	public void ClickRtnBox () {
		
		ReturnBox.click();
	}
	
	public void SelectRtnDate () {
		Return.click();
		
	}
		
		
	public void ClickSearch () {
		Search.click();
		
		
	}
	public void ClickDepFlight () {
		PickDepFlight.click();
		
	}
		
	public void ClickReFlight () {
		PickReFlight.click();

	}
	public void ClickNoThanks () {
		NoThanks.click();
		
	}
	public void ClickBooking () {
		Booking.click();
		
	}
	public void InsertFirstName () {
		Firstname.sendKeys("Jalal");
	}
	public void InsertLastName () {
		Lastname.sendKeys("Kasaat");
	}
	public void InsertPhone () {
		Phone.sendKeys("2021234567");
	}
	public void ClickGender() {
		Gender.click();
	}
	public void SelectMonth () {
		Month.click();
		
	}
	public void SelectDate () {
		Day.click();
	}
	public void SelectYear () {
		Year.click();
		
	}

	}


