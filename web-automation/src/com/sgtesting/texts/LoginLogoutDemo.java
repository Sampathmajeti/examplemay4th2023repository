package com.sgtesting.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		logout();
		closeapp();
	}
	private static void launchbrowser()
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
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void minimizeflyoutwindow()
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
	private static void logout()
	{
		try
		{
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapp()
	{
		try
		{
			obrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
