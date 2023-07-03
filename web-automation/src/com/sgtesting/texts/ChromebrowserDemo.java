package com.sgtesting.texts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromebrowserDemo {
	public static WebDriver obrowser=null;
	public static void main(String[]args) {
		launchBrowser();
		navigate();
		closeapplication();
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
	private static void closeapplication()
	{
		try
		{
			obrowser.close();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

