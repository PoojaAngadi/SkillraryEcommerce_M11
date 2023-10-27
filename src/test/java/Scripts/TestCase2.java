package Scripts;

import org.testng.annotations.Test;

import Pom.DemoSkillraryPage;
import Pom.DownloadInvoicePage;
import Pom.SkillraryHomePage;
import generic_library.BaseClass;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() {

	SkillraryHomePage s=new SkillraryHomePage(driver);
	s.gearsButton();//business library of gears in SkillraryHomePage
	//click on skillrarydemo app
	s.skillraryDemoApp();//business library of skillraryDemoApp in SkillraryHomePage
	//new tab switching
	utilities.childBrowser(driver);
	//select testing
	DemoSkillraryPage ds=new DemoSkillraryPage(driver);
	ds.feedBckbtn();//business library of feedBckbtn from DemoSkillraryPage
	DownloadInvoicePage dI=new DownloadInvoicePage(driver);
	dI.downloadInvoiceButton();//business library of downloadInvoiceButton from DownloadInvoicePage
	}

}
