package pageFactoryPage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestLeafPage {

	WebDriver driver;

	// constructor
	public TestLeafPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// methods
	
	//User name
	@FindBy(how = How.ID, using = "username")
	private WebElement username;

	public WebElement userName(String enterUsernname) {
		username.sendKeys(enterUsernname);
		return username;
	}

	
	//Password
	@FindBy(how = How.ID, using = "password")
	private WebElement password;

	public WebElement password(String enterpassword) {
		password.sendKeys(enterpassword);
		return password;
	}

	//Login Button
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement login;

	public WebElement loginButton() {
		login.click();
		return login;
	}

	// After login click on image
	@FindBy(how = How.XPATH, using = "//div[@id='form']/div[1]/a/img")
	private WebElement afterlogin;

	public WebElement afterLogin() {
		afterlogin.click();
		return afterlogin;
	}

	//create lead click
	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	private WebElement lead;

	public WebElement clickCreateLead() {
		lead.click();
		return lead;
	}

	/* *************create lead***************** */

	// company name
	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement name;

	public WebElement companyName(String enterCompanyName) {
		name.sendKeys(enterCompanyName);
		return name;
	}

	// Fore name
	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement forename;

	public WebElement enterForeman(String enterFore) {
		forename.sendKeys(enterFore);
		return forename;
	}

	// source
	@FindBy(how = How.XPATH, using = "//select[@name='dataSourceId']")
	private WebElement source;

	public WebElement enterSource(int enterSource) {
		Select s = new Select(source);
		s.selectByIndex(enterSource);
		return source;
	}

	// First name
	@FindBy(how = How.NAME, using = "firstNameLocal")
	private WebElement firstname;

	public WebElement enterFirstname(String enterFirstname) {
		firstname.sendKeys(enterFirstname);
		return firstname;
	}

	// salutation
	@FindBy(how = How.NAME, using = "personalTitle")
	private WebElement salutation;

	public WebElement enterSalutation(String enterSalutation) {
		salutation.sendKeys(enterSalutation);
		return salutation;
	}

	// Title
	@FindBy(how = How.NAME, using = "generalProfTitle")
	private WebElement title;

	public WebElement enterTitle(String enterTitle) {
		title.sendKeys(enterTitle);
		return title;
	}

	// Annual Revenue
	@FindBy(how = How.XPATH, using = "//input[@name='annualRevenue']")
	private WebElement annual;

	public WebElement enterAnnualRevenue(String enterAnnualRevenue) {
		annual.sendKeys(enterAnnualRevenue);
		return annual;
	}

	// Industry
	@FindBy(how = How.XPATH, using = "//select[@name='industryEnumId']")
	private WebElement industry;

	public WebElement enterIndustry(int enterIndustry) {
		Select s = new Select(industry);
		s.selectByIndex(enterIndustry);
		return industry;
	}

	// Ownership
	@FindBy(how = How.XPATH, using = "//select[@name='ownershipEnumId']")
	private WebElement ownership;

	public WebElement enterOwnership(int enterOwnership) {
		Select s = new Select(ownership);
		s.selectByIndex(enterOwnership);
		return ownership;
	}

	// SIC Code
	@FindBy(how = How.NAME, using = "sicCode")
	private WebElement code;

	public WebElement enterSICCode(String enterSICCOde) {
		code.sendKeys(enterSICCOde);
		return code;
	}

	// Description
	@FindBy(how = How.ID, using = "createLeadForm_description")
	private WebElement description;

	public WebElement enterDescription(String enterDescription) {
		description.sendKeys(enterDescription);
		return description;
	}

	// Important Note
	@FindBy(how = How.NAME, using = "importantNote")
	private WebElement note;

	public WebElement enterImportantNote(String enterNote) {
		note.sendKeys(enterNote);
		return note;
	}

	/* *******Parent Account******** */

	// parent account image click
	@FindBy(how = How.XPATH, using = "//img[@alt='Lookup']")
	private WebElement parentimage;

	public WebElement parentImage() {
		parentimage.click();
		return parentimage;
	}

	public void openTab() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		String window1 = iterator.next();
		String window2 = iterator.next();
		driver.switchTo().window(window1);
		System.out.println(driver.getTitle());
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
	}

	// Account Id
	@FindBy(how = How.XPATH, using = "//*[@id=\"ext-gen25\"]")
	private WebElement accountid;

	public WebElement accountID(String enterAccountID) {
		accountid.sendKeys(enterAccountID);
		return accountid;
	}

	// Account Name
	@FindBy(how = How.XPATH, using = "//input[@name='accountName']")
	private WebElement accountname;

	public WebElement accountName(String enterAccounName) {
		accountname.sendKeys(enterAccounName);
		return accountname;
	}

	// Find Account
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[1]")
	private WebElement find;

	public WebElement findAccount() {
		find.click();
		return find;
	}

	public void previousPage() {
		driver.navigate().to(
				"http://leaftaps.com/crmsfa/control/createLeadForm;jsessionid=BA0656FBD76294CCF236A88845F36377.jvm1");
		// driver.manage().window().maximize();
	}

	// ParentAccount
	@FindBy(how = How.XPATH, using = "(//input[@name='parentPartyId'])[1]")
	private WebElement account;

	public WebElement enterParentAccount(String enterParentAccount) {
		account.sendKeys(enterParentAccount);
		return account;
	}

	// Surname
	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement surname;

	public WebElement enterSurname(String enterSurname) {
		surname.sendKeys(enterSurname);
		return surname;
	}

	// Marketing Campaign
	@FindBy(how = How.XPATH, using = "//select[@name='marketingCampaignId']")
	private WebElement marketing;

	public WebElement enterMarketingCampaign(int enterMarketing) {
		Select s = new Select(marketing);
		s.selectByIndex(enterMarketing);
		return marketing;
	}

	// Last Name (Local)
	@FindBy(how = How.XPATH, using = "//input[@name='lastNameLocal']")
	private WebElement lastname;

	public WebElement enterLastname(String enterLastname) {
		lastname.sendKeys(enterLastname);
		return lastname;
	}

	// Calendar image click
	@FindBy(how = How.XPATH, using = "//img[@alt='View Calendar']")
	private WebElement calendarimage;

	public WebElement calendaImage() {
		calendarimage.click();
		return calendarimage;
	}

	// select year
	@FindBy(how = How.XPATH, using = "//*[text()='«']")
	private WebElement year;

	public WebElement calendaYear() {
		year.click();
		return year;
	}

	// select month
	@FindBy(how = How.XPATH, using = "//*[text()='›']")
	private WebElement month;

	public WebElement calendaMonth() {
		month.click();
		return month;
	}

	// select date
	@FindBy(how = How.XPATH, using = "(//td[@class='day'])[10]")
	private WebElement day;

	public WebElement calendaDay() {
		day.click();
		return day;
	}

	// Department
	@FindBy(how = How.XPATH, using = "//input[@name='departmentName']")
	private WebElement department;

	public WebElement enterDepartment(String enterDepartment) {
		department.sendKeys(enterDepartment);
		return department;
	}

	// Preferred Currency
	@FindBy(how = How.XPATH, using = "//select[@name='currencyUomId']")
	private WebElement currency;

	public WebElement enterPreferredCurrency(String enterCurrency) {
		Select sec = new Select(currency);
		sec.selectByValue(enterCurrency);
		return currency;
	}

	// Employee Numbers
	@FindBy(how = How.XPATH, using = "//input[@name='numberEmployees']")
	private WebElement employee;

	public WebElement enterEmployeeNo(String enterEmployeeNo) {
		employee.sendKeys(enterEmployeeNo);
		return employee;
	}

	// Ticker Symbol
	@FindBy(how = How.XPATH, using = "//input[@name='tickerSymbol']")
	private WebElement tickerSymbol;

	public WebElement enterTickerSymbo(String enterTickerSymbo) {
		tickerSymbol.sendKeys(enterTickerSymbo);
		return tickerSymbol;
	}

	/* ************Contact Information************** */

	// Country Code
	@FindBy(how = How.XPATH, using = "(//input[@name='primaryPhoneCountryCode'])[4]")
	private WebElement country;

	public WebElement enterCountryCode(String enterCountryCode) {
		country.sendKeys(enterCountryCode);
		return country;
	}

	// Area Code
	@FindBy(how = How.XPATH, using = "(//input[@name='primaryPhoneAreaCode'])[4]")
	private WebElement area;

	public WebElement enterAreaCode(String enterAreaCode) {
		area.sendKeys(enterAreaCode);
		return area;
	}

	// Extension
	@FindBy(how = How.NAME, using = "primaryPhoneExtension")
	private WebElement extension;

	public WebElement enterExtension(String enterExtension) {
		extension.sendKeys(enterExtension);
		return extension;
	}

	// Email
	@FindBy(how = How.XPATH, using = "(//input[@name='primaryEmail'])[4]")
	private WebElement email;

	public WebElement enterEmail(String enterEmail) {
		email.sendKeys(enterEmail);
		return email;
	}

	// Phone number
	@FindBy(how = How.XPATH, using = "(//input[@name='primaryPhoneNumber'])[4]")
	private WebElement phone;

	public WebElement enterPrimaryPhoneNo(String enterPhoneNo) {
		phone.sendKeys(enterPhoneNo);
		return phone;
	}

	// Person to Ask For
	@FindBy(how = How.NAME, using = "primaryPhoneAskForName")
	private WebElement person;

	public WebElement enterPersonAskedFor(String enterPersonAskedFor) {
		person.sendKeys(enterPersonAskedFor);
		return person;
	}

	// web URL
	@FindBy(how = How.ID, using = "createLeadForm_primaryWebUrl")
	private WebElement url;

	public WebElement enterwebURL(String enterwebURL) {
		url.sendKeys(enterwebURL);
		return url;
	}

	/* **************** Primary Address **************** */

	// To Name
	@FindBy(how = How.ID, using = "createLeadForm_generalToName")
	private WebElement toname;

	public WebElement enterToName(String enterToName) {
		toname.sendKeys(enterToName);
		return toname;
	}

	// Attention Name
	@FindBy(how = How.NAME, using = "generalAttnName")
	private WebElement attention;

	public WebElement enterAttentionName(String enterAttentionName) {
		attention.sendKeys(enterAttentionName);
		return attention;
	}

	// Address Line 1
	@FindBy(how = How.NAME, using = "generalAddress1")
	private WebElement address1;

	public WebElement enterAddressLane1(String enterAddress1) {
		address1.sendKeys(enterAddress1);
		return address1;
	}

	// Address Line 2
	@FindBy(how = How.ID, using = "createLeadForm_generalAddress2")
	private WebElement address2;

	public WebElement enterAddressLane2(String enterAddress2) {
		address2.sendKeys(enterAddress2);
		return address2;
	}

	// City
	@FindBy(how = How.ID, using = "createLeadForm_generalCity")
	private WebElement city;

	public WebElement enterCity(String enterCity) {
		city.sendKeys(enterCity);
		return city;
	}

	// State/Province
	@FindBy(how = How.XPATH, using = "//select[@name='generalStateProvinceGeoId']")
	private WebElement state;

	public WebElement enterState(int enterState) {
		Select s = new Select(state);
		s.selectByIndex(enterState);
		return state;
	}

	// Postal Code
	@FindBy(how = How.XPATH, using = "(//input[@class='inputBox'])[27]")
	private WebElement postalcode;

	public WebElement enterPostalCode(String enterPostalCode) {
		postalcode.sendKeys(enterPostalCode);
		return postalcode;
	}

	// Country
	@FindBy(how = How.XPATH, using = "//select[@name='generalCountryGeoId']")
	private WebElement scountry;

	public WebElement enterCountry(String enterCountrys) {
		Select s = new Select(scountry);
		s.selectByValue(enterCountrys);
		return scountry;
	}

	// ZIP /Postal Code Extension
	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCodeExt")
	private WebElement zipcode;

	public WebElement enterZipCode(String enterZipCode) {
		zipcode.sendKeys(enterZipCode);
		return zipcode;
	}

	// create lead
	@FindBy(how = How.XPATH, using = "//input[@name='submitButton']")
	private WebElement createlead;

	public WebElement CreateLead() {
		createlead.click();
		return createlead;
	}

	/* *********** left side of all drop down ************* */

	/* *********create account********* */

	// account name
	@FindBy(how = How.XPATH, using = "//input[@name='accountName']")
	private WebElement accname;

	public WebElement enterAccountName(String enterAccountName) {
		accname.sendKeys(enterAccountName);
		return accname;
	}
	
	
	
	//action(double & delete)
	public void actionPerform() {
	Actions a = new Actions(driver);
	WebElement we = driver.findElement(By.xpath("//*[@id=\"ext-gen19\"]"));
	a.doubleClick(we).perform();
	we.sendKeys(Keys.BACK_SPACE);
	}
	
	
//	public void clear1() {
//		driver.findElement(By.xpath("//*[@id=\"ext-gen124\"]")).clear();
//	}

	// phone number box1
	@FindBy(how = How.XPATH, using = "//input[@name='primaryPhoneCountryCode']")
	private WebElement phone1;

	public WebElement enterPhoneBox1(String enterPhoneBox1) {
		phone1.sendKeys(enterPhoneBox1);
		return phone1;
	}

	// phone number box2
	@FindBy(how = How.XPATH, using = "//input[@name='primaryPhoneAreaCode']")
	private WebElement phone2;

	public WebElement enterPhoneBox2(String enterPhoneBox2) {
		phone2.sendKeys(enterPhoneBox2);
		return phone2;
	}

	// phone number box3
	@FindBy(how = How.XPATH, using = "//input[@name='primaryPhoneNumber']")
	private WebElement phone3;

	public WebElement enterPhoneBox3(String enterPhoneBox3) {
		phone3.sendKeys(enterPhoneBox3);
		return phone3;
	}

	// email address
	@FindBy(how = How.XPATH, using = "//input[@name='primaryEmail']")
	private WebElement emailadress;

	public WebElement enterEmailAdress(String enterEmailAdress) {
		emailadress.sendKeys(enterEmailAdress);
		return emailadress;
	}

	// create account
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[2]")
	private WebElement createaccount;

	public WebElement CreateAccount() {
		createaccount.click();
		return createaccount;
	}

	/* *********create account********* */

	// First name
	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private WebElement fname;

	public WebElement enterContactFirstName(String enterContactFirstName) {
		fname.sendKeys(enterContactFirstName);
		return fname;
	}

		// Last name
		@FindBy(how = How.XPATH, using = "//input[@name='lastName']")
		private WebElement lname;

		public WebElement enterContactLastName(String enterContactLastName) {
			lname.sendKeys(enterContactLastName);
			return lname;
	}

		//Account
		
		  @FindBy(how = How.XPATH, using = "//input[@id='ext-gen116']") 
		  private WebElement acnname;
		  
		  public WebElement ContactAccountName(String enterContactContactName) {
		  acnname.sendKeys(enterContactContactName); 
		  return acnname; 
		  }
		 
		//action perform by control+a and then backspace
		  public void clearNumber() {
			  Actions a = new Actions(driver);
			  WebElement we = driver.findElement(By.id("ext-gen124"));
			  we.sendKeys(Keys.CONTROL);
			  we.sendKeys("a");
			  we.sendKeys(Keys.BACK_SPACE);
		  }
		
		// phone number box1
		@FindBy(how = How.XPATH, using = "(//input[@name='primaryPhoneCountryCode'])[2]")
		private WebElement cphone1;

		public WebElement enterContactPhoneBox1(String enterContactPhoneBox1) {
			cphone1.sendKeys(enterContactPhoneBox1);
			return cphone1;
		}

		// phone number box2
		@FindBy(how = How.XPATH, using = "(//input[@name='primaryPhoneAreaCode'])[2]")
		private WebElement cphone2;

		public WebElement enterContactPhoneBox2(String enterContactPhoneBox2) {
			cphone2.sendKeys(enterContactPhoneBox2);
			return cphone2;
		}

		// phone number box3
		@FindBy(how = How.XPATH, using = "(//input[@name='primaryPhoneNumber'])[2]")
		private WebElement cphone3;

		public WebElement enterContactPhoneBox3(String enterContactPhoneBox3) {
			cphone3.sendKeys(enterContactPhoneBox3);
			return cphone3;
		}
		
		//email address
		@FindBy(how = How.XPATH, using = "(//input[@name='primaryEmail'])[2]")
		private WebElement emailad;

		public WebElement enterContactEmailAdress(String enterContactEmailAdress) {
			emailad.sendKeys(enterContactEmailAdress);
			return emailad;
		}
		
		//create contact
		@FindBy(how = How.XPATH, using = "(//button[@type='button'])[2]")
		private WebElement createcontact;

		public WebElement CreateContact() {
			createcontact.click();
			return createcontact;
		}
		
		/* ************ Create Case ************** */
		
		//subject
		@FindBy (how=How.XPATH, using="//input[@name='custRequestName']") 
		private WebElement subject;
		
		public WebElement caseSubject(String entercaseSubject) {
			subject.sendKeys(entercaseSubject);
			return subject;
		}
		
		//account
		@FindBy (how=How.ID, using="ext-gen428") 
		private WebElement caseaccname;
		
		public WebElement caseAccountName(String entercaseAccountName) {
			caseaccname.sendKeys(entercaseAccountName);
			return caseaccname;
		}
		
		//create case
		@FindBy(how = How.ID, using = "ext-gen444")
		private WebElement createcase;

		public WebElement CreateCase() {
			createcase.click();
			return createcase;
		}
		

		/* *************** Create Lead ******************* */
		//Company Name
		@FindBy (how=How.ID, using="ext-gen232") 
		private WebElement companyname;
		
		public WebElement leadCompanyName(String entereadCompanyName) {
			companyname.sendKeys(entereadCompanyName);
			return companyname;
		}
		
		//First Name
		@FindBy(how = How.XPATH, using = "(//input[@name='firstName'])[2]")
		private WebElement firname;

		public WebElement createLeadFirstName(String enterLeadFirstName) {
			firname.sendKeys(enterLeadFirstName);
			return firname;
		}

			// Last name
			@FindBy(how = How.XPATH, using = "(//input[@name='lastName'])[2]")
			private WebElement laname;

			public WebElement createLeadLastName(String enterLeadLastName) {
				laname.sendKeys(enterLeadLastName);
				return laname;
		}
			
			//action perform by control+a and then delete
			  public void clearNumber1() {
				  Actions a = new Actions(driver);
				  WebElement we = driver.findElement(By.id("ext-gen244"));
				 a.doubleClick(we).perform();
				  we.sendKeys(Keys.DELETE);
			  }
		
		//Phone Number Box1
		
			@FindBy(how = How.XPATH, using = "(//input[@name='primaryPhoneCountryCode'])[3]")
			private WebElement lphone1;

			public WebElement leadPhoneBox1(String enterLeadPhoneBox1) {
				lphone1.sendKeys(enterLeadPhoneBox1);
				return lphone1;
			}

			// phone number box2
			@FindBy(how = How.XPATH, using = "(//input[@name='primaryPhoneAreaCode'])[3]")
			private WebElement lphone2;

			public WebElement leadPhoneBox2(String enterLeadPhoneBox2) {
				lphone2.sendKeys(enterLeadPhoneBox2);
				return lphone2;
			}

			// phone number box3
			@FindBy(how = How.XPATH, using = "(//input[@name='primaryPhoneNumber'])[3]")
			private WebElement lphone3;

			public WebElement leadPhoneBox3(String enterLeadPhoneBox3) {
				lphone3.sendKeys(enterLeadPhoneBox3);
				return lphone3;
			}

			// email address
			@FindBy(how = How.XPATH, using = "(//input[@name='primaryEmail'])[3]")
			private WebElement lemailadress;

			public WebElement leadEmailAdress(String enterLeadEmailAdress) {
				lemailadress.sendKeys(enterLeadEmailAdress);
				return lemailadress;
			}
			
			//create lead
			@FindBy(how = How.ID, using = "ext-gen444")
			private WebElement crlead;

			public WebElement leftCreatelead() {
				crlead.click();
				return crlead;
			}
		
		
		
			/* *************** Create Opportunity ******************* */
		
			//Account Or Lead
			@FindBy(how = How.ID, using = "ext-gen344")
			private WebElement aclead;

			public WebElement accountOrLead(String enterAccountOrLead) {
				aclead.sendKeys(enterAccountOrLead);
				return aclead;
			}

			//Opportunity Name
			@FindBy(how = How.XPATH, using = "//input[@name='opportunityName']")
			private WebElement opportunity;

			public WebElement opportunityName(String enteropportunityLead) {
				opportunity.sendKeys(enteropportunityLead);
				return opportunity;
			}

			//
			public void removeInitial() {
				driver.findElement(By.id("ext-gen348")).clear();
			}
			
			//Initial Stage
			@FindBy(how = How.ID, using = "ext-gen348")
			private WebElement initial;

			public WebElement opportunityInitialStage(String enteropportunityInitialStage) {
				initial.sendKeys(enteropportunityInitialStage);
				return initial;
			}

			//Opportunity Amount
			@FindBy(how = How.XPATH, using = "//input[@name='estimatedAmount']")
			private WebElement amount;

			public WebElement opportunityAmount(String enteropportunityAmount) {
				amount.sendKeys(enteropportunityAmount);
				return amount;
			}
			
			//Estimated Close Date
			@FindBy(how = How.XPATH, using = "//input[@name='estimatedCloseDate']")
			private WebElement estimate;

			public WebElement opportunityEstimateDate(String enterOpportunityEstimateDate) {
				estimate.sendKeys(enterOpportunityEstimateDate);
				return estimate;
			}
		
			//Create Opportunity
			@FindBy(how = How.ID, using = "ext-gen368")
			private WebElement cropportunity;

			public WebElement leftCreateOpportunity() {
				cropportunity.click();
				return cropportunity;
			}
		
		   //My home click
			@FindBy (how=How.LINK_TEXT, using="My Home")
			private WebElement home;
			
			public WebElement myHome() {
				home.click();
				return home;
			}
			
			/*  ****************** Create Account Page*************************  */
			
			//click on create account on menu bar
			@FindBy (how=How.XPATH, using="//div[@class='frameSectionBody']/ul[1]/li[2]/a")
			private WebElement createaccontmenu;
			
			public WebElement menuCreateAccont() {
				createaccontmenu.click();
				return createaccontmenu;
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
}
