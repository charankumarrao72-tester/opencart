package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {

	public AccountRegistration(WebDriver driver)
	
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']") WebElement lastname;
	
	@FindBy(xpath="//input[@name='email']") WebElement email;
	
	@FindBy(xpath="//input[@name='telephone']") WebElement mobilenumber;
	
	@FindBy(xpath="//input[@name='password']") WebElement password;
	
	@FindBy(xpath="//input[@name='confirm']") WebElement confirm_password;
	
	@FindBy(xpath="//input[@name='agree']") WebElement chkPolicy;
	
	
	@FindBy(xpath="//input[@value='Continue']") WebElement submit;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']") WebElement result;
	
	
	public void setFirstname(String fname)
	
	
	{
		firstname.sendKeys(fname);
	}
	
	public void setLastname(String lname)
	
	
	{
		lastname.sendKeys(lname);
	}
	
	public void setEmail(String mail)
	{
		email.sendKeys(mail);
		
	}
	
	public void setMno(String number)
	{
		mobilenumber.sendKeys(number);
		
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
		
	}
	public void setConfirmPassword(String cnfpwd)
	{
		confirm_password.sendKeys(cnfpwd);
		
	}
	
	public void clickPolicy()
	
	{
		chkPolicy.click();
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	
	
	//in poms we dont do any validation so 
public String getStatus( ) {	
	try
	{
		
		{
			return result.getText();
		}
	}
	
	catch(Exception e)
	
	{
		
		return e.getMessage();
	}
}
	
}
