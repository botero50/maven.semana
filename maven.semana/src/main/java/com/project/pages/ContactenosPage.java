package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactenosPage {
	
	public enum contact {
		  servicioAlCliente {
		      public String toString() {
		          return "Servicio al Cliente";
		      }
		  },

		  webMaster {
		      public String toString() {
		          return "Web Master";
		      }
		  }
		}
	
	@FindBy(id="txtName")
	private WebElement Name;
	
	@FindBy(id="txtEmail")
	private WebElement Email;
	
	@FindBy(id="ddlContacts")
	private WebElement Contact;
	
	@FindBy(id="txtSubject")
	private WebElement Subject;
	
	@FindBy(id="txtPhone")
	private WebElement Phone;
	
	@FindBy(id="btnEnviar")
	private WebElement Send;
	
	@FindBy(id="validationContactUs")
	private WebElement validationLbl;
	
	public ContactenosPage fillName(String name){
		Name.sendKeys(name);
		return this;
	}
	public ContactenosPage fillEmail(String email)
	{
		Email.sendKeys(email);
		return this;
	}
	public ContactenosPage selectContact(contact strContact)
	{
		new Select(Contact).selectByVisibleText(strContact.toString());
		return this;
	}
}