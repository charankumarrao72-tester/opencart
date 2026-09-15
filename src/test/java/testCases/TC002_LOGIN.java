package testCases;

import org.testng.annotations.Test;
import utilities.TestDataProviders;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LOGIN extends BaseClass{

	
	@Test(dataProvider="login",dataProviderClass=TestDataProviders.class)
	void testLogin(String user,String pwd,String exp)
	{
		
        
	   String exp_res=exp;
		log.info("program started");
		HomePage obj=new HomePage(driver);
		obj.clickMyAccount();
		log.info("login clicked");
		obj.loginMyAccount();
		 System.out.println("wadad");
		 System.out.println("wadad");
		LoginPage login=new LoginPage(driver);
	
	login.setLoginUser(user);
	login.setLoginPassword(pwd);
	login.clickLogin();
	MyAccountPage my=new MyAccountPage(driver);
	String accountResult=my.checkLogin();
	 my.clickLogout();
	
	
	if(accountResult.equals("My Account"))
	{
		System.out.println("SUCESSFULLY LOGGED IN");
	}else
	{
		System.out.println("NOT SUCESSFULLY LOGGED IN");
	}
	}
	/*catch(Exception e)
	
	{
		System.out.println("NOT SUCESSFULLY LOGGED IN");
	}
		
	*/
	
}

