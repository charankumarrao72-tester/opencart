package testCases;

import testBase.BaseClass;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pageObjects.AccountRegistration;
import pageObjects.HomePage;

public class TC001_AccountRegistration extends BaseClass{
	
	

	
	@Test
	void testRegister() {
		
		log.info("program started");
		HomePage obj=new HomePage(driver);
		log.info("account cloicked");
		obj.clickMyAccount();
		log.info("register clicked");
		obj.resgisterMyAccount();
		log.info("accout regsitartion started");
		AccountRegistration a=new AccountRegistration(driver);
		a.setFirstname("admin123");
		a.setLastname("456");
		a.setEmail(randGen()+"@gmail.com");
		a.setMno("46547686798");
		a.setPassword(p.getProperty("password"));
		a.setConfirmPassword(p.getProperty("password"));
		a.clickPolicy();
		a.clickSubmit();
		log.info("registration completed");
         
		String result=a.getStatus();		
		System.out.println(result);
		
		log.info("Login Page Started");
		

	
	
	
	}
	
	String randGen()
	{
		return (RandomStringUtils.insecure().nextAlphabetic(7));
	}


}
