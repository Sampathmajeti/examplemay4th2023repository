package com.sgtesting.returntype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginlogout {
	public static WebDriver oBrowser=null;
	public static  Actipage opage=null;
	public static void main(String[]args) {
		launchbrowser();
		navigate();
		login();
		flyoutwindow();
		logout();
		closeapp();
	}
	public static void launchbrowser()
	{
		try
		{
			oBrowser =new ChromeDriver();
			opage= new Actipage(oBrowser);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost/login.do");
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
			oBrowser.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
