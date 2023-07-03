package com.sgtesting.texts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIreFoxDemo {
	public static WebDriver obrowser=null;
	public static void main(String[]args) {
		launchbrowser();
		navigation();
		//closeapp();
	}
	private static void launchbrowser()
	{
		try
		{
			obrowser=new FirefoxDriver();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	private static void navigation()
	{
		try
		{
		obrowser.get("https://www.youtube.com/");
		Thread.sleep(2000);
	}catch(Exception e)
		{
		 e.printStackTrace();
		}
	}
}
