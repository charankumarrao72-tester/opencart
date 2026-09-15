package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//h2[text()='My Account']")  WebElement checkLoggedin;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")  WebElement logout;
	
	
	public String checkLogin() {
		
		return checkLoggedin.getText();
	}
	
	public void clickLogout()
	{
		logout.click();
	}
	
}
