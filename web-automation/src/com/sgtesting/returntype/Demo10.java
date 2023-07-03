package com.sgtesting.returntype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {
	public static WebDriver obrowser =null;
	public static Actipage opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		flyoutwindow();
		Adduser1();
		logout();
		loginuser1();
		adduser2();
		logout2();
		loginuser2();
		adduser3();
		logout3();
		loginuser3();
		logout4();
		loginuser22();
		modifyuser3();
		logout5();
		loginuser33();
		logout6();
		loginuser11();
		modifyuser2();
		logout7();
		loginuser222();
		logout8();
		login2();
		modifyuser1();
		logout9();
		loginuser111();
		logout10();
		loginuser2222();
		deleteuser3();
		logout11();



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
	private static void Adduser1()
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
	private static void logout()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void loginuser1()
	{
		try 
		{
			opage.getusername().sendKeys("user1");
			opage.getpassword().sendKeys("12345");
			opage.getloginbutton().click();
			Thread.sleep(3000);
			opage.getexploringbutton().click();
			Thread.sleep(2000);
			opage.getflyoutwindow().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void adduser2()
	{
		try 
		{
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstname().sendKeys("user2");
			Thread.sleep(3000);
			opage.getlasttname().sendKeys("demo2");
			Thread.sleep(3000);
			opage.getemail().sendKeys("user2@gmail.com");
			Thread.sleep(3000);
			opage.getuserusername().sendKeys("user2");
			Thread.sleep(2000);
			opage.getuserpassword().sendKeys("12345");
			Thread.sleep(2000);
			opage.getuserpasswordcopy().sendKeys("12345");
			Thread.sleep(2000);
			opage.getcreateuserbutton().click();
			Thread.sleep(2000);	
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout2()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void loginuser2()
	{
		try 
		{
			opage.getusername().sendKeys("user2");
			opage.getpassword().sendKeys("12345");
			opage.getloginbutton().click();
			Thread.sleep(3000);
			opage.getexploringbutton().click();
			Thread.sleep(2000);
			opage.getflyoutwindow().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void adduser3()
	{
		try 
		{
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstname().sendKeys("user3");
			Thread.sleep(3000);
			opage.getlasttname().sendKeys("demo3");
			Thread.sleep(3000);
			opage.getemail().sendKeys("user3@gmail.com");
			Thread.sleep(3000);
			opage.getuserusername().sendKeys("user3");
			Thread.sleep(2000);
			opage.getuserpassword().sendKeys("12345");
			Thread.sleep(2000);
			opage.getuserpasswordcopy().sendKeys("12345");
			Thread.sleep(2000);
			opage.getcreateuserbutton().click();
			Thread.sleep(2000);	
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout3()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void loginuser3()
	{
		try 
		{
			opage.getusername().sendKeys("user2");
			opage.getpassword().sendKeys("12345");
			opage.getloginbutton().click();
			Thread.sleep(3000);
			opage.getexploringbutton().click();
			Thread.sleep(2000);
			opage.getflyoutwindow().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout4()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void loginuser22()
	{
		try 
		{
			opage.getusername().sendKeys("user2");
			opage.getpassword().sendKeys("12345");
			opage.getloginbutton().click();
			Thread.sleep(3000);
			opage.getexploringbutton().click();
			Thread.sleep(2000);
			opage.getflyoutwindow().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser3()
	{
		try 
		{
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getselectuser3info().click();
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
	private static void logout5()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void loginuser33()
	{
		try 
		{
			opage.getusername().sendKeys("user3");
			opage.getpassword().sendKeys("password");
			opage.getloginbutton().click();
			Thread.sleep(3000);
			opage.getexploringbutton().click();
			Thread.sleep(2000);
			opage.getflyoutwindow().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout6()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void loginuser11()
	{
		try 
		{
			opage.getusername().sendKeys("user1");
			opage.getpassword().sendKeys("12345");
			opage.getloginbutton().click();
			Thread.sleep(3000);
			opage.getexploringbutton().click();
			Thread.sleep(2000);
			opage.getflyoutwindow().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser2()
	{
		try 
		{
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getselectuser2info().click();
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
	private static void logout7()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void loginuser222()
	{
		try 
		{
			opage.getusername().sendKeys("user2");
			opage.getpassword().sendKeys("password");
			opage.getloginbutton().click();
			Thread.sleep(3000);
			opage.getexploringbutton().click();
			Thread.sleep(2000);
			opage.getflyoutwindow().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout8()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void login2()
	{
		try 
		{
			opage.getusername().sendKeys("admin");
			opage.getpassword().sendKeys("manager");
			opage.getloginbutton().click();
			Thread.sleep(3000);
		//	opage.getflyoutwindow().click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser1()
	{
		try 
		{
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getselectuser1info().click();
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
	private static void logout9()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void loginuser111()
	{
		try 
		{
			opage.getusername().sendKeys("user1");
			opage.getpassword().sendKeys("password");
			opage.getloginbutton().click();
			Thread.sleep(3000);
			opage.getexploringbutton().click();
			Thread.sleep(2000);
			opage.getflyoutwindow().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout10()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void loginuser2222()
	{
		try 
		{
			opage.getusername().sendKeys("user2");
			opage.getpassword().sendKeys("password");
			opage.getloginbutton().click();
			Thread.sleep(3000);
			opage.getexploringbutton().click();
			Thread.sleep(2000);
			opage.getflyoutwindow().click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser3()
	{
		try 
		{
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getselectuser3info().click();
			Thread.sleep(2000);
			opage.getdeleteuserbutton().click();
			Thread.sleep(2000);
			obrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void logout11()
	{
		try 
		{
			opage.getlogoutbutton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	


	



	

	


	
	
	
		
	
	








	
}

