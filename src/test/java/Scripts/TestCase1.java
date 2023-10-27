package Scripts;

import org.testng.annotations.Test;

import Pom.DemoSkillraryPage;
import Pom.SkillraryHomePage;
import Pom.TestingPage;
import generic_library.BaseClass;

public class TestCase1 extends BaseClass{
	@Test
	public void tc1() throws Throwable {
		//click on gears
		SkillraryHomePage s=new SkillraryHomePage(driver);
		s.gearsButton();//business library of gears in SkillraryHomePage
		//click on skillrarydemo app
		s.skillraryDemoApp();//business library of skillraryDemoApp in SkillraryHomePage
		//new tab switching
		utilities.childBrowser(driver);
		//select testing
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		utilities.dropDown(ds.getSelectDd(),pdata.getpropertydata("coursedd"));
		//scroll down till facebook
		TestingPage t=new TestingPage(driver);
		utilities.Scrolling(driver,t.getFacebook());
		Thread.sleep(3000);
		t.FacebookWebElement();//business library of FacebookWebElement in TestingPage
		
	}

}
