package modules;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pageobjects.AddressPage;

import java.util.HashMap;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
public class VerifyAddressProceed {
	@SuppressWarnings("deprecation")
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		assertEquals("百度一下", AddressPage.page_heading.getAttribute("value"));
		Reporter.log("Address page verify and proceed successful");
	}
}
