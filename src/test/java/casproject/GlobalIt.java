package casproject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalIt {
	public WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions actions;
	//Constructor
	GlobalIt(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);

	}
	
	//WebElement locators + identifications
	
	@FindBy(xpath="(//img[@data-automation-id='HeroImage'])[1]")
	WebElement slider_App1;
	
	@FindBy(xpath="(//img[@data-automation-id='HeroImage'])[2]")
	WebElement slider_App2;
	
	@FindBy(xpath="(//img[@data-automation-id='HeroImage'])[3]")
	WebElement slider_App3;
	
	@FindBy(xpath="(//img[@data-automation-id='HeroImage'])[4]")
	WebElement slider_App4;
	
	@FindBy(xpath="(//img[@data-automation-id='HeroImage'])[5]")
	WebElement slider_App5;
	
	@FindBy(xpath="//div[@title='Global IT']")
	WebElement txt_title;
	
	@FindBy(xpath="//div[text()='S&T Policy Hub']")
	WebElement txt_img_ST;
	
	@FindBy(xpath="//*[text()='IT News']")
	WebElement txt_header;
	
	@FindBy(xpath="//div[@data-automation-id='gridNewsLayout']//a[@role='presentation']")
	List<WebElement> countnews;
	
	@FindBy(xpath="//*[text()='Implementing Roster-Based Seat Booking on My WorkSpace']")
	WebElement scroll_2;
	
	@FindBy(xpath="//h4[@id='it-awards']")
	WebElement it_awards;
	
	@FindBy(xpath="(//div[@data-automation-id='listNewsLayout']//a[@role='presentation'])[1]")
	WebElement it_awards1;
	
	@FindBy(xpath="(//div[@data-automation-id='listNewsLayout']//a[@role='presentation'])[2]")
	WebElement it_awards2;
	
	@FindBy(xpath="(//div[@data-automation-id='listNewsLayout']//a[@role='presentation'])[3]")
	WebElement it_awards3;
	
	
	
	
	
	
	//Actions
	//app1
	public void exploreApps1()  {
		slider_App1.click();
		
		}
	public String getTitleApp1() {
	String app1=driver.getTitle();
	driver.navigate().back();
	return app1;
	}
	//app2
	public void exploreApps2()  {
		slider_App2.click();
		
		}
	public String getTitleApp2() {
	String app2=driver.getTitle();
	driver.navigate().back();
	return app2;
	}
	//app3
	public void exploreApps3()  {
		slider_App3.click();
		
		}
	public String getTitleApp3() {
	String app3=driver.getTitle();
	driver.navigate().back();
	return app3;
	}
	//app4
	public void exploreApps4()  {
		slider_App4.click();
		
		}
	public String getTitleApp4() {
	String app4=driver.getTitle();
	driver.navigate().back();
	return app4;
	}
	//app5
	public void exploreApps5()  {
		slider_App5.click();
		
		}
	public String getTitleApp5() {
	String app5=driver.getTitle();
	driver.navigate().back();

	return app5;
	}
	public void scroll1() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",txt_img_ST );

	}
	
	public void scroll2()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",scroll_2);
		js.executeScript("arguments[0].scrollIntoView()",it_awards);
	}
	
	public String getItNews() {

		String validate=txt_header.getText();
		return validate;
	}
	
	public void countPrint() {
		System.out.println("The count of news is: "+countnews.size());
	}
	
	public Map<String,String> newsHeaderTitle() {
		Map<String, String> map = new HashMap<String, String>();
        for (WebElement newsHeader : countnews) {
            String newshead=newsHeader.getText();
            String toolTip = newsHeader.getAttribute("title");
            
            map.put(newshead, toolTip);
            
        }
        return map;
	}
	public String getItAwards() {
		String validateITAwards=it_awards.getText();
		return validateITAwards;
	}
	public void award1() throws InterruptedException {
		it_awards1.click();
		Thread.sleep(3000);
		
	}
	public void award2() throws InterruptedException {
		it_awards2.click();
		Thread.sleep(3000);
		
	}
	public void award3() throws InterruptedException {
		it_awards3.click();
		Thread.sleep(3000);
		
	}
	
}


