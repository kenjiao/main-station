package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressPage extends BaseClass {
	
	public AddressPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"su\"]")
	public static WebElement page_heading;

}
