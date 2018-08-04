package projectweek4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Contactcreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
System.setProperty("webdriver.chrome.driver", "E:\\TL Selenium\\Workspace\\Selenium\\drivers\\chromedriver.exe");
		
		//ChromeOptions ops = new ChromeOptions();
			//ops.setHeadless(true);
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById(("username")).sendKeys("DemoSalesManager");
		driver.findElementById(("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();
		// in create contact
		driver.findElementById("firstNameField").sendKeys("ganesh");
		driver.findElementById("lastNameField").sendKeys("rajendran");
		driver.findElementByName("firstNameLocal").sendKeys("RBS");
		driver.findElementByName("lastNameLocal").sendKeys("system");
		driver.findElementById("createContactForm_personalTitle").sendKeys("MR");
		driver.findElementByName("generalProfTitle").sendKeys("Manager");
		driver.findElementByName("departmentName").sendKeys("analyzer");
		
		//Drop down selection
		
		WebElement currencysele = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select currency = new Select(currencysele);
		currency.selectByValue("INR");
		//driver.findElementByXPath("//*[@id=\"ext-gen609\"]/a").click();
		driver.findElementById("createContactForm_description").sendKeys("search for implementation");
		driver.findElementById("createContactForm_importantNote").sendKeys("any notes");
		
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("100");
		
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("3125");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9894376");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("ganesh.r@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("ganeshr"); 
		
		driver.findElementById("generalToNameField");
		driver.findElementById("createContactForm_generalAddress1").sendKeys("5/594, anna univ"); 
		driver.findElementById("createContactForm_generalCity").sendKeys("medavakkam");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("641010");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("010");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("usha");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("5/594, anna univ");
			
		String getname = driver.findElementById("generalToNameField").getText();
		System.out.println(" the text captured is "+getname);
		
		WebElement countrydd = driver.findElementById("createContactForm_generalCountryGeoId");
		Select country = new Select(countrydd);
		country.selectByValue("IND");	
		
		WebElement codee = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select state = new Select(codee);
		state.selectByValue("AP");	
		
		driver.findElementByName("submitButton").click();
		//((WebElement) driver.findElementsByClassName("smallSubmit")).click();
		
	
		String name = driver.findElementById("viewContact_firstName_sp").getText();
		if(name.equals(getname))
		{
			System.out.println("value matches");
		}
		else 
		{
			System.out.println("value matches");
			}
		
		driver.findElementByClassName("subMenuButton").click();
		
		WebElement market = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select camp = new Select(market);
		camp.selectByValue("CATRQ_AUTOMOBILE");	
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@value='Add']").click();
		
		//driver.findElementByName("//*[@name=\"submitButton"]".click();
				
		driver.findElementByXPath("//input[@value='Update']").click();
		
		String marketd = driver.findElementById("viewContact_marketingCampaigns_sp").getText();
		
		System.out.println("the captured marketing camph was " +marketd);
		
		driver.close();
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
