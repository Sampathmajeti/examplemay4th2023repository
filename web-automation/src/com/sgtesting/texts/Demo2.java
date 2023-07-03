package com.sgtesting.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchobr();
		navigate();
		login();
		minimizewindow();
		user();
		adduser();
		modify();
		
	}
	private static void  launchobr()
	{
		try 
		{
			obrowser=new ChromeDriver();

		} catch (Exception e) 
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
		}catch (Exception e) {
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
	private static void user()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void adduser()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(2000);
			//	obrowser.findElement(By.name("middleName")).sendKeys("demo");
			obrowser.findElement(By.name("lastName")).sendKeys("user1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("demoUser1");
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
	private   static void modify()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("12345678");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("12345678");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			
		} catch (Exception e) 
		{
		e.printStackTrace();
		}
	}
	


}
