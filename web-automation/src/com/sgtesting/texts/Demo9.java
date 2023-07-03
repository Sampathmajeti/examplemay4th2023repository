package com.sgtesting.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {
	public static WebDriver obrowser=null;
	public static void main(String[]args) {
		launchBrowser();
		navigate();
		login();
		minimizewindow();
		adduser();
		adduser2();
		adduser3();
		loginadmin();
		modifypassword();
		logout11();
		loginuser1();
		logout();
		loginuser2();
		logout2();
		loginuser3();
		logout3();
		login2();
		 minimizewindow1();
		 deleteuserdata();
		//logout();
		//closeapp();
	}
	private static void launchBrowser()
	{
		try
		{
			obrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			obrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizewindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void adduser()
	{
		try 
		{

			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(5000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("user1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("User1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("password");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("password");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void adduser2()
	{
		try
		{
			
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("user2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("User2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("password");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("password");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		private static void adduser3()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo3");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("user3");
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).sendKeys("demo3@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("User3");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("password");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("password");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		private static void loginadmin()	
		{
			try
			{
				obrowser.findElement(By.id("username")).sendKeys("admin");
				obrowser.findElement(By.name("pwd")).sendKeys("manager");
				obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifypassword()
		{
			try
			{
				obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
				Thread.sleep(3000);
				obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
				Thread.sleep(3000);
				obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
				Thread.sleep(3000);
				obrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(3000);
				obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
				Thread.sleep(3000);
				obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
				Thread.sleep(3000);
				obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
				Thread.sleep(3000);
				obrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(3000);
				obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
				Thread.sleep(3000);
				obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
				Thread.sleep(3000);
				obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
				Thread.sleep(3000);
				obrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(3000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}


		private static void logout11()
		{
			try
			{
				obrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(5000);

				
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	private static void loginuser1()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("User1");
			obrowser.findElement(By.name("pwd")).sendKeys("12345");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();

			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	private static void logout()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser2()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("User2");
			obrowser.findElement(By.name("pwd")).sendKeys("12345");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();

			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	private static void logout2()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser3()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("User3");
			obrowser.findElement(By.name("pwd")).sendKeys("12345");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	private static void logout3()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login2()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizewindow1()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuserdata()
	{
		try 
		{
			
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			obrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			obrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			obrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	



	


}
