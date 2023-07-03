package com.sgtesting.returntype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Demo7 {
	public static WebDriver obrowser =null;
	public static Actipage opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		flyoutwindow();
		Addcustomer();
		addproject();
		addtask();
		deltetask();
		deleteproject();
		deletecustomer();
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
	private static void Addcustomer()
	{
		try 
		{
			opage.getaddtask().click();
			Thread.sleep(2000);
			opage.getaddnew().click();
			Thread.sleep(2000);
			opage.getaddcustomer().click();
			Thread.sleep(2000);
			opage.getcustomername().sendKeys("mani");
			Thread.sleep(2000);
			opage.getcustomerdata().sendKeys("customer data is present");
			Thread.sleep(2000);
			opage.getcreatecustomerbutton().click();
			Thread.sleep(2000);



		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void addproject()
	{
		try 
		{
			opage.getaddnew().click();
			Thread.sleep(2000);
			opage.getaddprojectbutton().click();
			Thread.sleep(2000);
			opage.getprojectname().sendKeys("polavaram");
			Thread.sleep(2000);
			opage.getprojectdesc().sendKeys("intiated by ysr");
			Thread.sleep(2000);
			opage.getcreateprojectbutton().click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void addtask()
	{
		try 
		{
			opage.getcreatetaskbutton().click();
			Thread.sleep(2000);
			opage.getcreatenewtasksbutton().click();
			Thread.sleep(2000);
			opage.gettaskname().click();
			opage.gettaskname().sendKeys("comepleteby2024");
			Thread.sleep(2000);
			opage.getcreatetasksbutton().click();
			Thread.sleep(3000);
			obrowser.switchTo().alert().accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deltetask()
	{
		try 
		{
			opage.getselecttaskbutton().click();
			Thread.sleep(2000);
			opage.gettaskactionbutton().click();
			Thread.sleep(2000);
			opage.gettaskdeletebutton().click();
			Thread.sleep(2000);
			opage.gettaskdeletepermenentlybutton().click();
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try
		{
			opage.getprojectinfobutton().click();
			Thread.sleep(2000);	
			opage.getprojectactionbutton().click();
			Thread.sleep(3000);
			opage.getprojectdeletebutton().click();
			Thread.sleep(3000);
			opage.getprojectdeletepermantly().click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try
		{
			opage.getselectcustomer().click();
			Thread.sleep(2000);
			opage.getactionbutton().click();
			Thread.sleep(2000);
			opage.getdeletebutton().click();
			Thread.sleep(2000);
			opage.getpermanentdeletebutton().click();



		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
