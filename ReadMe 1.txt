Overview

This project aims to automate the Global IT portal of Cognizant using Selenium WebDriver. The automation process involves navigating through the Be.Cognizant portal, extracting user information, click on Corporate Functions, MouseHover To Security and Technology, click on IT and validating the details.

Libraries and Dependencies
	Maven Repository: Maven 4.0.0
	TestNG: 7.10.1
	Selenium WebDriver: 4.19.1
Automation Flow
	Navigate to Be.Cognizant portal.
	Extract user information from the profile.
	Click on Corporate Functions.
	MouseHover on Security and Technology.
	Click on IT and it will navigate to Global IT page.
	Explore the apps.
	Scroll Down to IT News Section.
	Verify the presence of IT News Section.
	Print count of IT News Headers.
	Verify IT News Headers and ToolTips.
	Scroll Down to IT Awards Section.
	Verify the presence of IT Awards Section.
	Click on each IT Award and print all the information.



Libraries Explanation
	Maven Repository: Used for project management and dependency resolution.
	TestNG: Facilitates test case organization and execution.
	Selenium WebDriver: Automates browser interactions.
Screenshots
	Screenshots are captured at relevant steps for documentation and analysis.

How to Run
	Open Eclipse IDE:

		Launch Eclipse IDE on your machine.
	Import Project:

		Select File -> Import from the menu.
		Choose Existing Maven Projects and click Next.
		Browse to the directory where you cloned the repository and select the project.
	Update Maven Project:

		Right-click on the project in the Project Explorer.
		Choose Maven -> Update Project.
		Click OK to update dependencies.

	Run Test Suite:

		Locate the test suite file (testng.xml)
		Right-click on the file and choose Run As -> TestNG Suite.
	View Reports:

		After execution, open the test-output folder.
		Find the TestNG file (index.html) for detailed test case reports.
Reporting
	Locate Test Reports:

		After the execution, navigate to the test-output folder in the project directory.
	Open Test Report:

		Inside the test-output folder, find the Extent Report HTML file named index.html.
	View Test Reports:

		Open the index.html file using any web browser. This report provides a detailed overview of test executions, including passed and failed tests, test duration, and any exceptions encountered.
	Screenshots:

		screenshots captured during test execution for relevant test cases.
	Analyze Results:

		Utilize the visual representation in the TestNG Report to quickly identify test status and any issues encountered during the test run.
