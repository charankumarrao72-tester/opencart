package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//THIS IS THE PARENT OF ALL PAGE OBJECT CLASEES 

public class BasePage {


		
		 protected WebDriver driver;
		
		public BasePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

	}


