package com.sgtesting.returntype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actipage {
	public Actipage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	//create webelements for username
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	//create webelements for password
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	//create webelement for loginbutton
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oLogin;
	public WebElement getloginbutton()
	{
		return oLogin;
	}
	//create Webelement for flyoutwindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getflyoutwindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//create webelement for  creating user
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
	private WebElement user;
	public WebElement getuser()
	{
		return user;
	}
	//webeelement for create new user
	@FindBy(xpath = " //*[@id=\"createUserDiv\"]/div")
	private WebElement createuser;
	public WebElement getadduser()
	{
		return createuser;
	}
	//fill userdetails(firstname)
	private WebElement userDataLightBox_firstNameField;
	public WebElement getfirstname()
	{
		return userDataLightBox_firstNameField;
	}
	//fill lastname
	private WebElement userDataLightBox_lastNameField;
	public WebElement getlasttname()
	{
		return userDataLightBox_lastNameField;
	}
	//fill email
	private WebElement userDataLightBox_emailField;
	public WebElement getemail()
	{
		return userDataLightBox_emailField;
	}
	//fill username
	private WebElement userDataLightBox_usernameField;
	public WebElement getuserusername()
	{
		return userDataLightBox_usernameField;
	}
	//fill password
	private WebElement userDataLightBox_passwordField;
	public WebElement getuserpassword()
	{
		return userDataLightBox_passwordField;
	}
	//fill passwordcopy
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getuserpasswordcopy()
	{
		return userDataLightBox_passwordCopyField;
	}
	//click on createuserbutton
	private WebElement userDataLightBox_commitBtn;
	public WebElement getcreateuserbutton()
	{
		return userDataLightBox_commitBtn;
	}
	//create WEbelement for selectinuser
	@FindBy (xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement selectuser;
	public WebElement getselectuser1()
	{
		return selectuser;
	}
    //detlet user
	@FindBy(xpath = "//*[@id=\"userDataLightBox_accountInformationSection\"]/div[2]")
	private WebElement deleteuser;
	public WebElement getdeleteuserbutton()
	{
		return deleteuser;
	}

	//create webelement for logoutlink

	private WebElement logoutLink;
	public WebElement getlogoutbutton()
	{
		return logoutLink;
	}
	//create webelement for savechnsgesbutton
	@FindBy(xpath = "//*[@id=\"userDataLightBox_commitBtn\"]")
	private WebElement savechange;
	public WebElement getsavechangebutton()
	{
		return savechange;
	}
	@FindBy(xpath = "//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
	private WebElement Addtask;
	public WebElement getaddtask()
	{
		return Addtask;
	}
	@FindBy(xpath = "//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")
	private WebElement Addnew;
	public WebElement getaddnew()
	{
		return Addnew;
	}
	@FindBy(xpath = "/html/body/div[14]/div[1]")
	private WebElement Addcustomer;
	public WebElement getaddcustomer()
	{
		return Addcustomer;
	}
	private WebElement  customerLightBox_nameField;
	public WebElement getcustomername()
	{
		return customerLightBox_nameField;
	}
	private WebElement  customerLightBox_descriptionField;
	public WebElement getcustomerdata()
	{
		return customerLightBox_descriptionField;
	}
	private WebElement customerLightBox_commitBtn;
	public WebElement getcreatecustomerbutton()
	{
		return customerLightBox_commitBtn;
	}
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement Selectcustomer;
	public WebElement getselectcustomer()
	{
		return Selectcustomer;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement actionbutton;
	public WebElement getactionbutton()
	{
		return actionbutton;
	}
	
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement deletebutton;
	public WebElement getdeletebutton()
	{
		return deletebutton;
	}
	

	@FindBy(xpath = "//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")
	private WebElement permanentdeletebutton;
	public WebElement getpermanentdeletebutton()
	{
		return permanentdeletebutton;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement  descdata;
	public WebElement getdescdata()
	{
		return descdata;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement  wrongbutton;
	public WebElement getwrongbutton()
	{
		return wrongbutton;
	}
	
	//get addprojectbutton
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement  addprojectbutton;
	public WebElement getaddprojectbutton()
	{
		return addprojectbutton;
	}
	private WebElement projectPopup_projectNameField;
	public WebElement getprojectname()
	{
		return projectPopup_projectNameField;
	}

	private WebElement projectPopup_projectDescriptionField;
	public WebElement getprojectdesc()
	{
		return projectPopup_projectDescriptionField;
	}
	
	private WebElement projectPopup_commitBtn;
	public WebElement getcreateprojectbutton()
	{
		return projectPopup_commitBtn;
	}
	
	//get addprojectbutton
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement  projectinfobutton;
		public WebElement getprojectinfobutton()
		{
			return projectinfobutton;
		}
		
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
		private WebElement  projectactionbutton;
		public WebElement getprojectactionbutton()
		{
			return projectactionbutton;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
		private WebElement  projectdeletebutton;
		public WebElement getprojectdeletebutton()
		{
			return projectdeletebutton;
		}
		@FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")
		private WebElement  projectdeletepermantly;
		public WebElement getprojectdeletepermantly()
		{
			return projectdeletepermantly;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")

		private WebElement  modifyprojectname;
		public WebElement getmodifyprojectname()
		{
			return modifyprojectname;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
		private WebElement  projectcancelbutton;
		public WebElement getprojectcancelbutton()
		{
			return projectcancelbutton;
		}
		
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div")
		private WebElement  createtask;
		public WebElement getcreatetaskbutton()
		{
			return createtask;
		}

		@FindBy(xpath="/html/body/div[13]/div[1]")
		private WebElement  createnewtasksbutton;
		public WebElement getcreatenewtasksbutton()
		{
			return createnewtasksbutton;
		}
		@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
		private WebElement  taskname;
		public WebElement gettaskname()
		{
			return taskname;
		}
		//@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
		private WebElement  createTasksPopup_commitBtn;
		public WebElement getcreatetasksbutton()
		{
			return createTasksPopup_commitBtn;
		}
		//private WebElement closeCreateTasksPopupButton
		
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
		private WebElement  selecttaskbutton;
		public WebElement getselecttaskbutton()
		{
			return selecttaskbutton;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")
		private WebElement  taskactionbutton;
		public WebElement gettaskactionbutton()
		{
			return taskactionbutton;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
		private WebElement  taskdeletebutton;
		public WebElement gettaskdeletebutton()
		{
			return taskdeletebutton;
		}
		
		@FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitBtn\"]/div")
		private WebElement  taskdeletepermenentlybutton;
		public WebElement gettaskdeletepermenentlybutton()
		{
			return taskdeletepermenentlybutton;
		}
		
		@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")
		private WebElement  exploringbutton;
		public WebElement getexploringbutton()
		{
			return exploringbutton;
		}
		
		@FindBy(xpath="//span[text()='demo, user']")
		private WebElement  selectuser1info;
		public WebElement getselectuser1info()
		{
			return selectuser1info;
		}
		@FindBy(xpath="//span[text()='demo2, user2']")
		private WebElement  selectuser2info;
		public WebElement getselectuser2info()
		{
			return selectuser2info;
		}@FindBy(xpath="//span[text()='demo3, user3']")
		private WebElement  selectuser3info;
		public WebElement getselectuser3info()
		{
			return selectuser3info;
		}
	
		
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement  selectdeleteuser2info;
		public WebElement getselectdeleteuser2info()
		{
			return selectdeleteuser2info;
		}
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement  selectdeleteuser3info;
		public WebElement getselectdeleteuser3info()
		{
			return selectdeleteuser3info;
		}
	
}
