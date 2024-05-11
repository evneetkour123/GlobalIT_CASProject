package casproject;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class ITAward1 {
 
	public WebDriver driver;
	//Constructor
	ITAward1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
 
	}
	
	//WebElement locators + identifications
 
	@FindBy(xpath="//div[@data-automation-id='TitleTextId']")
	WebElement it_awards_title;
	
	@FindBy(xpath="(//span[@class='fontSizeMediumPlus'])[1]")
	WebElement it_awards_info1;

	@FindBy(xpath="(//span[@class='fontSizeMediumPlus'])[3]")
	WebElement it_awards_info3;
	
	//Actions
	public void awardInformation1() {
		System.out.println("Award-1 Information");
		System.out.println("Title - "+it_awards_title.getText());
		System.out.println("Info:");
		System.out.println(it_awards_info1.getText());
		System.out.println(it_awards_info3.getText());
		driver.navigate().back();
		driver.navigate().refresh();
	}
}