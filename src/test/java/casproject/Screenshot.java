package casproject;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class Screenshot {
	WebDriver driver;
	public Screenshot(WebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver,this);
	}
	public void takeScreenshot(String screenshotName) throws IOException, InterruptedException {
		Thread.sleep(3000);
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File s = ts.getScreenshotAs(OutputType.FILE);
	    File trg = new File("C:\\Users\\2317554\\Downloads\\casproject (3)\\casproject\\ScreenShot//" + screenshotName + ".png");
	    FileHandler.copy(s, trg);
	}
}
