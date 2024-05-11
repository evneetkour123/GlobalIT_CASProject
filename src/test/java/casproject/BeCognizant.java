package casproject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeCognizant {
	public WebDriver driver;
	Actions actions; 
	
	
	// Constructor
	BeCognizant(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);

	}

	// WebElement locators + identifications
	
	@FindBy(xpath="//button[@id='O365_MainLink_Me']") 
	WebElement button_userinfo;
	
	@FindBy(xpath="//div[@class='mectrl_accountDetails']/div[1]")
	WebElement txt_username;
	
	@FindBy(xpath="//div[@class='mectrl_accountDetails']/div[2]")
	WebElement txt_useremail;
	
	@FindBy(name="Corporate Functions")
	WebElement option_corporate;

	@FindBy(name="Security and Technology")
	WebElement option_security;
	
	@FindBy(name="IT")
	WebElement option_IT;

	// Action methods

	public void clickUserinfo() throws InterruptedException {
		
		Actions actions = new Actions(driver);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();",button_userinfo);
//		button_userinfo.click();
		actions.moveToElement(button_userinfo).click().build().perform();
        Thread.sleep(3000);
        button_userinfo.click();
        Thread.sleep(3000);
		
		Thread.sleep(3000);
		System.out.println("USER INFORMATON");
		System.out.println(txt_username.getText());
		System.out.println(txt_useremail.getText());
		
	}
	public void selectSecurityAndTechnology() throws InterruptedException {
		option_corporate.click();
		Thread.sleep(3000);
		actions = new Actions(driver);
		actions.moveToElement(option_security).perform();
		
		
	}
	public void clickIT() {
		option_IT.click();
	}

	

}
