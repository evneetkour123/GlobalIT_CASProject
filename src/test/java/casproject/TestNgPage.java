package casproject;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestNgPage {
	WebDriver driver;
	SoftAssert sa;

	BeCognizant beco;
	GlobalIt git;
	Screenshot sc;
	ITAward1 it1;
	ITAward2 it2;
	ITAward3 it3;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException {
		if(br.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
		}
		else if(br.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			}
		else {
			System.out.println("Invalid");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void captureUserInfo() throws InterruptedException, IOException {

		beco=new BeCognizant(driver);
		sc=new Screenshot(driver);
		beco.clickUserinfo();
		sc.takeScreenshot("CaptureInfo");
		Thread.sleep(5000);
		
		
		
	}
	@Test(priority = 2)
	void mousehover() throws IOException, InterruptedException {
		beco.selectSecurityAndTechnology();
		sc.takeScreenshot("MouseHover");
		beco.clickIT();
	}
	
	@Test(priority = 3,dependsOnMethods = {"mousehover"})
	void exploreapp() throws InterruptedException, IOException  {
		git=new GlobalIt(driver);
		sa=new SoftAssert();
		//app1
		git.exploreApps1();
		Thread.sleep(1000);
		sc.takeScreenshot("App1");
		sa.assertEquals(git.getTitleApp1(),"IT Outage Alert");
		
		//app2
		git.exploreApps2();
		Thread.sleep(1000);
		sc.takeScreenshot("App2");
		sa.assertEquals(git.getTitleApp2(),"Microsoft Teams");
		
		//app3
		git.exploreApps3();
		Thread.sleep(1000);
		sc.takeScreenshot("App3");
		sa.assertEquals(git.getTitleApp3(),"One Drive");
		
		//app4
		git.exploreApps4();
		Thread.sleep(1000);
		sc.takeScreenshot("App4");
		sa.assertEquals(git.getTitleApp4(),"Global IT Internal Events");
		
		//app5
		git.exploreApps5();
		Thread.sleep(1000);
		sc.takeScreenshot("App5");
		sa.assertEquals(git.getTitleApp5(),"Global Information Technology Documents");		
		
	}
	
	@Test(priority=4,dependsOnMethods = {"mousehover"})
	void validateItNews() throws InterruptedException, IOException {
		Thread.sleep(1000);
		git.scroll1();
		Thread.sleep(3000);
		sc.takeScreenshot("ItNews");
		sa.assertEquals(git.getItNews(),"IT News");
	}
	
	@Test(priority = 5,dependsOnMethods = {"mousehover","validateItNews"})
	void countnews() {
		git.countPrint();
	}
	
	@Test(priority=6,dependsOnMethods = {"mousehover","validateItNews"})
	void compareMapOfHT() {
		 Map<String, String> map = new HashMap<String, String>();
		 map.put("What's happening in IT – March '24 Edition", "What's happening in IT – March '24 Edition");
		 map.put("GBS-GIC Dashboard Goes Live!", "GBS-GIC Dashboard Goes Live!");
		 map.put("Customer Analytics Dashboard Goes Live!", "Customer Analytics Dashboard Goes Live!");
		 map.put("Deere Compute Hardware PV&V RFP Win for Cognizant!", "Deere Compute Hardware PV&V RFP Win for Cognizant!");
		 map.put("Integrating Contino and Inawisdom Email to Cognizant", "Integrating Contino and Inawisdom Email to Cognizant");
		 map.put("Integrating Devbridge to the Cognizant Network", "Integrating Devbridge to the Cognizant Network");
		 map.put("New Network for Servian Office Opening", "New Network for Servian Office Opening");
		 map.put("Global Assignment Application Goes Live!", "Global Assignment Application Goes Live!");
		 map.put("Wolfsburg Office Set-up and Certification", "Wolfsburg Office Set-up and Certification");
		 map.put("What's happening in IT – February '24 Edition", "What's happening in IT – February '24 Edition");
		 map.put("Upgrading Services to Keep our Infrastructure Up to Date", "Upgrading Services to Keep our Infrastructure Up to Date");
		 map.put("Implementing Roster-Based Seat Booking on My WorkSpace", "Implementing Roster-Based Seat Booking on My WorkSpace");
		 
		 sa.assertEquals( git.newsHeaderTitle().equals(map), true);
	}
	
	@Test(priority = 7,dependsOnMethods = {"mousehover","validateItNews"})
	void validateItAwards() throws IOException, InterruptedException {
		git.scroll2();
		sc.takeScreenshot("ItAwards");
		sa.assertEquals(git.getItAwards(),"IT Awards");
	}
	@Test(priority = 8,dependsOnMethods = {"mousehover","validateItNews","validateItAwards"})
	void awardInfo1() throws InterruptedException, IOException{
		it1=new ITAward1(driver);
		git.award1();
		sc.takeScreenshot("ItAwards1");
		it1.awardInformation1();
		Thread.sleep(2000);
		git.scroll1();
		git.scroll2();
	}
	@Test(priority = 9,dependsOnMethods = {"mousehover","validateItNews","validateItAwards"})
	void awardInfo2() throws InterruptedException, IOException{
		it2=new ITAward2(driver);
		git.award2();
		sc.takeScreenshot("ItAwards2");
		it2.awardInformation2();
		Thread.sleep(2000);
		git.scroll1();
		git.scroll2();
	}
	@Test(priority = 10,dependsOnMethods = {"mousehover","validateItNews","validateItAwards"})
	void awardInfo3() throws InterruptedException, IOException{
		it3=new ITAward3(driver);
		git.award3();
		sc.takeScreenshot("ItAwards3");
		it3.awardInformation3();
		Thread.sleep(2000);
		git.scroll1();
		git.scroll2();
	}


	@AfterClass
	void tearDown() {
		driver.close();
	}

}
