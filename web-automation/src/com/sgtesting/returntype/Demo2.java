package com.sgtesting.returntype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static WebDriver obrowser =null;
    public static Actipage opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		flyoutwindow();
		Adduser();
		modifyuser();
		logout();
		closeapp();
	}
	public static void launchbrowser()
	{
		try
		{
			obrowser =new ChromeDriver();
			opage= new Actipage(obrowser);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			obrowser.get("http://localhost/login.do");
			Thread.sleep(3000);

		} catch (Exception e)
		{
			e.printStackTrace();	
		}

	}
	private static void login()
	{
		try 
		{
			opage.getusername().sendKeys("admin");
			opage.getpassword().sendKeys("manager");
			opage.getloginbutton().click();
			Thread.sleep(3000);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void flyoutwindow()
	{
		try 
		{
			opage.getflyoutwindow().click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Adduser()
	{
		try 
		{
		 opage.getuser().click();
		 Thread.sleep(2000);
		opage.getadduser().click();
		Thread.sleep(2000);
		opage.getfirstname().sendKeys("user");
		Thread.sleep(3000);
		opage.getlasttname().sendKeys("demo");
		Thread.sleep(3000);
		opage.getemail().sendKeys("user1@gmail.com");
		Thread.sleep(3000);
		opage.getuserusername().sendKeys("user1");
		Thread.sleep(2000);
		opage.getuserpassword().sendKeys("12345");
		Thread.sleep(2000);
		opage.getuserpasswordcopy().sendKeys("12345");
		Thread.sleep(2000);
		opage.getcreateuserbutton().click();
		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	{
		try 
		{
			opage.getselectuser1().click();
			Thread.sleep(2000);
			opage.getuserpassword().clear();
			Thread.sleep(2000);
			opage.getuserpassword().sendKeys("password");
			Thread.sleep(2000);
			opage.getuserpasswordcopy().sendKeys("password");
			Thread.sleep(2000);
			opage.getsavechangebutton().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			}
	}
	private static void logout()
	{
		try 
		{
			opage.getlogoutbutton().click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	private static void closeapp()
	{
		try 
		{
			obrowser.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


		
	


}
