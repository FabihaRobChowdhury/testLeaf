package pageFactoryTest;

import org.testng.annotations.Test;

import pageFactoryPage.TestLeafPage;
import testLeaf_BaseTest.BaseTest;

public class TestLeafTest extends BaseTest{
	
	TestLeafPage tl;
	
	@Test (priority=1)
	public void logIn() {
		 tl = new TestLeafPage(driver);
		
		tl.userName("DemoSalesManager");
		tl.password("crmsfa");
		tl.loginButton();
		tl.afterLogin();
	}
	
	@Test (priority=2)
	public void buttion() {
		 tl = new TestLeafPage(driver);
		 
		tl.clickCreateLead();
	}
	
	@Test (priority=3)
	public void createLad() {
		 tl = new TestLeafPage(driver);
		 
		tl.companyName("Tep Solution");
		tl.enterForeman("Chowdhury");
		tl.enterSource(3);
		tl.enterFirstname("Tahi");
		tl.enterSalutation("abc");
		tl.enterTitle("Testing");
		tl.enterAnnualRevenue("30k");
		tl.enterIndustry(3);
		tl.enterOwnership(6);
		tl.enterSICCode("147 852");
		tl.enterDescription("This is a testing environment which is used for automation testing");
		tl.enterImportantNote("Automation Testing");
		
		
		tl.enterParentAccount("Moni Chowdhury");
		tl.enterSurname("Chowdhury");
		tl.enterMarketingCampaign(2);
		tl.enterLastname("Rob");
		tl.calendaImage();
		tl.calendaYear();
		tl.calendaMonth();
		tl.calendaDay();
		
		tl.enterDepartment("Automation Testing");
		tl.enterPreferredCurrency("TRY");
		tl.enterEmployeeNo("10012");
		tl.enterTickerSymbo("Grey");
		
		
		tl.enterCountryCode("123");
		tl.enterAreaCode("789 523");
		tl.enterExtension("copy");
		tl.enterEmail("abc123@gmail.com");
		tl.enterPrimaryPhoneNo("+1 862 3694551");
		tl.enterPersonAskedFor("Rijve");
		tl.enterwebURL("http:facebook.com");
		
		
		tl.enterToName("Gn");
		tl.enterAttentionName("Rijve");
		tl.enterAddressLane1("avenue 38, parkness");
		tl.enterAddressLane2("Gucci warehouse inventory");
		tl.enterCity("Paterson");
		tl.enterState(13);
		tl.enterPostalCode("3116");
		tl.enterCountry("USA");
		tl.enterZipCode("5412");
		tl.CreateLead();
//		
		/*  create account   */
		tl.accountName("Tahi");
		tl.actionPerform();
		tl.enterPhoneBox1("+1");
		tl.enterPhoneBox2("862");
		tl.enterPhoneBox3("147 963");
		tl.enterEmailAdress("abc@gmail.com");
		//tl.CreateAccount();
//		
		
		/*  create contact   */
		tl.enterContactFirstName("Fabiha");
		tl.enterContactLastName("Chowdhury");
		tl.ContactAccountName("Tahi");
		tl.clearNumber();
		tl.enterContactPhoneBox1("+1");
		tl.enterContactPhoneBox2("369");
		tl.enterContactPhoneBox3("1235852");
		tl.enterContactEmailAdress("okm52@yahoo.com");
		//tl.CreateContact();
//		
		
		/*  create case  */
		tl.caseSubject("Automation Testing");
		tl.caseAccountName("Automation");
		//tl.CreateCase();
		
		
		/*  create lead  */
		tl.leadCompanyName("Tep Solution");
		tl.createLeadFirstName("Tafhim");
		tl.createLeadLastName("Chowdhury");
		tl.clearNumber1();
		tl.leadPhoneBox1("+88");
		tl.leadPhoneBox2("017");
		tl.leadPhoneBox3("258 3689");
		tl.leadEmailAdress("tafim57@gmail.com");
		//tl.leftCreatelead();
		
		
		/*  create opportunity  */
		tl.accountOrLead("Automation");
		tl.opportunityName("Testing");
		tl.removeInitial();
		tl.opportunityInitialStage("prospects");
		tl.opportunityAmount("3500$");
		tl.opportunityEstimateDate("30 Dec 2022");
		tl.leftCreateOpportunity();
		
		//click on myHome
		tl.myHome();
		
		tl.menuCreateAccont();
		
	}
	
	
	//@Test (priority=2)
	public void createLead() {
		tl = new TestLeafPage(driver);
		
		tl.userName("DemoSalesManager");
		tl.password("crmsfa");
		tl.loginButton();
		tl.afterLogin();
		
		tl.clickCreateLead();
		
		tl.parentImage();
		tl.openTab();
		tl.accountID("10035");
		tl.accountName("abcd");
		tl.findAccount();
		//tl.previousPage();
	}
	
}
