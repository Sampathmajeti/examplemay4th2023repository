package com.sgtesting.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {
	public static WebDriver obrowser=null;
	public static void main(String[]args) {
		launchBrowser();
		navigate();
	    login();
		minimizewindow();
		adduser();
		logout();
		loginuser1();
		adduser2();
		logout2();
		adduser3();
		logout3();
		loginuser22();
		modifyuser3();
		logout4();
		loginuser33();
		 logout5();
		 login1();
		 modifyuser22();
		 logout6();
		 login11();
		 modifyuser11();
		 logout7();
		 login122();
		 deleteuser3();
		 logout8();
		 login101();
		 deleteuser2();
		 logout9();
		 loginadmin();
		 deleteuser1();
		 logout10();
		 
		
		//deleteuser();
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
	private static void loginuser1()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("User1");
			obrowser.findElement(By.name("pwd")).sendKeys("password");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();		}
	}
	private static void adduser2()
	{
		try
		{
			

			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
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
	private static void logout2()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	private static void loginuser2()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("User2");
			obrowser.findElement(By.name("pwd")).sendKeys("password");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();		}
	}
	
	private static void adduser3()
	{
		try
		{
			

			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
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
	private static void logout3()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	private static void loginuser22()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("User2");
			obrowser.findElement(By.name("pwd")).sendKeys("password");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();		}
	}
	private static void modifyuser3()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.name("password")).clear();
			Thread.sleep(3000);
			obrowser.findElement(By.name("password")).sendKeys("12345");
			Thread.sleep(3000);
			obrowser .findElement(By.name("passwordCopy")).sendKeys("12345");
			Thread.sleep(3000);
			obrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(3000);
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		 
		}
	}
	private static void logout4()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	private static void loginuser33()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("User3");
			obrowser.findElement(By.name("pwd")).sendKeys("12345");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();		
			
		}
	}
	private static void logout5()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	private static void login1()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("user1");
			obrowser.findElement(By.name("pwd")).sendKeys("12345");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser22()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.name("password")).clear();
			Thread.sleep(3000);
			obrowser.findElement(By.name("password")).sendKeys("12345");
			Thread.sleep(3000);
			obrowser .findElement(By.name("passwordCopy")).sendKeys("12345");
			Thread.sleep(3000);
			obrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(3000);
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		 
		}
	}
	private static void logout6()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void login11()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			

			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser11()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.name("password")).clear();
			Thread.sleep(3000);
			obrowser.findElement(By.name("password")).sendKeys("12345");
			Thread.sleep(3000);
			obrowser .findElement(By.name("passwordCopy")).sendKeys("12345");
			Thread.sleep(3000);
			obrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(3000);
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		 
		}
	}
	private static void logout7()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void login122()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("user2");
			obrowser.findElement(By.name("pwd")).sendKeys("12345");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			

			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser3()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_accountInformationSection\"]/div[2]")).click();
			obrowser.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	private static void logout8()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void login101()
	{
		try 
		{
			obrowser.findElement(By.id("username")).sendKeys("user1");
			obrowser.findElement(By.name("pwd")).sendKeys("12345");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			

			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser2()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_accountInformationSection\"]/div[2]")).click();
			obrowser.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	private static void logout9()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);


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
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[2]")).click();
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			

			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser1()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_accountInformationSection\"]/div[2]")).click();
			obrowser.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	private static void logout10()
	{
		try 
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	
	


	

	
	
	

	

	
	

	
	
	



}
