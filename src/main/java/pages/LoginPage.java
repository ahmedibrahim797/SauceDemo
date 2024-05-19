package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="user-name")
	WebElement usernameTxt ; 

	@FindBy(id="password")
	WebElement passwordTxtBox ; 

	@FindBy(id="login-button")
	WebElement loginBtn ; 
	
	public void UserLogin(String username , String password) 
	{
		setTextElementText(usernameTxt, username);
		setTextElementText(passwordTxtBox, password);
		clickButton(loginBtn);
	}

}
