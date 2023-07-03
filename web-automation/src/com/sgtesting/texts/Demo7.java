package com.sgtesting.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizewindow();
		createcustomer();
		createproject();
		createtask();
		deletetask();
		deleteproject();
		Deletecustomer();
		logout();
		closeapp();
	} 
	private static void  launchbrowser()
	{
		try
		{
			obrowser=new ChromeDriver();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			obrowser.get("http://localhost/login.do");
			Thread.sleep(5000);

		} catch (Exception e)
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
	private static void createcustomer()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("mani");
			Thread.sleep(3000);
			obrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("customer data");
			Thread.sleep(3000);
			obrowser.findElement(By.id("customerLightBox_commitBtn")).click();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createproject()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("mbaja");
			Thread.sleep(3000);
			obrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("held at oithampur indore");
			Thread.sleep(3000);
			obrowser.findElement(By.id("projectPopup_commitBtn")).click();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createtask()
	{
		try 
		{
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("fix transamission");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[6]")).click();
			Thread.sleep(2000);
			obrowser.switchTo().alert().accept();
		} catch (Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void deletetask()
	{
		try 
		{
			obrowser.findElement(By.id("closeCreateTasksPopupButton")).click();
			obrowser.switchTo().alert().accept();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Deletecustomer()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(1000);
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
