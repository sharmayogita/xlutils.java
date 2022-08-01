package com.ion.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.ion.testcases.BaseClass;

public class createConnection {

	// define elements
	@FindBy(id = "name")
	WebElement cusname;

	@FindBy(id = "SelectSegment")
	WebElement SelectSegmentdropdown;

	@FindBy(id = "serviceTypeId")
	WebElement serviceType;

	@FindBy(id = "mobile")
	WebElement mobileno;

	@FindBy(id = "primaryemail")
	WebElement email;

	@FindBy(id = "Communicationpincode")
	WebElement pincode;

	@FindBy(id = "Communicationarea")
	WebElement commarea;

	@FindBy(id = "Communicationbuilding")
	WebElement houdeno;

	@FindBy(id = "Communicationstate")
	WebElement state;

	@FindBy(id = "Communicationcity")
	WebElement commcity;

	@FindBy(xpath = "//*[@id='my-form']/div/div/div/div[1]/div/div[11]/div/h5/span/div")
	WebElement confirmcheckbox;

	@FindBy(id = "Orgnaization")
	WebElement organization;

	@FindBy(id = "alternatemobile")
	WebElement alterno;

	@FindBy(id = "LandLine")
	WebElement landLine;

	@FindBy(id = "AssociationName")
	WebElement associaltionname;

	@FindBy(id = "AssociationContact")
	WebElement associlationnumber;

	@FindBy(id = "AssociationEmail")
	WebElement associationemail;

	// define functions
	public void createUser(String name, String mob, String Email, String pincod, String area, String Houseno,
			String State, String city, String oranize, String altrno, String landline, String assname, String assno,
			String assemail) {
		cusname.sendKeys(name);
		Select dropdown = new Select(SelectSegmentdropdown);
		dropdown.selectByVisibleText("Education");

		Select type = new Select(serviceType);
		type.selectByVisibleText("High Speed Broadband");

		mobileno.sendKeys(mob);
		email.sendKeys(Email);
		pincode.sendKeys(pincod);
		commarea.sendKeys(area);
		houdeno.sendKeys(Houseno);
		state.sendKeys(State);
		commcity.sendKeys(city);
		confirmcheckbox.click();
		organization.sendKeys(oranize);
		alterno.sendKeys(altrno);
		landLine.sendKeys(landline);
		associaltionname.sendKeys(assname);
		associlationnumber.sendKeys(assno);
		associationemail.sendKeys(assemail);

	}

}
