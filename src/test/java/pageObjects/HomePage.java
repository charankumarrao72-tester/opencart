package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

		
		public HomePage(WebDriver driver)
		
		{
			super(driver);

	}

		@FindBy(xpath="//span[@class='caret']") WebElement account;
		
		@FindBy(xpath="//a[text()='Register']") WebElement register_link;
		
		@FindBy(xpath="//a[text()='Login']") WebElement login_link;
		
		public void clickMyAccount()
		{
			account.click();
		}
		
		public void resgisterMyAccount()
		{
			register_link.click();
		}
		
		public void loginMyAccount()
		{
			login_link.click();
		}
		
		
}