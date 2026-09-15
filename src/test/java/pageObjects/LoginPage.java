package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@name='email']")  WebElement login_email;
	@FindBy(xpath="//input[@name='password']")  WebElement login_password;
	@FindBy(xpath="//input[@value='Login']")  WebElement login_button;
	
	
	
	public void setLoginUser(String user)
	{
		login_email.sendKeys(user);
	}
	
	public void setLoginPassword(String pwd)
	{
		login_password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login_button.click();
		
	}
	

	

}
