package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase
{
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="first-name")
	WebElement firstNameTxt ; 

	@FindBy(id="last-name")
	WebElement lastNameTxt ; 
	
	@FindBy(id="postal-code")
	WebElement postalCodeTxt ; 
	
	@FindBy(css="input.btn_primary.cart_button")
	WebElement continue_button ;
	
public void CheckOutMethod(String firstName , String lastName , String postalCode) {
	setTextElementText(firstNameTxt, firstName);
	setTextElementText(lastNameTxt, lastName);
	setTextElementText(postalCodeTxt, postalCode);
	clickButton(continue_button);
	}
}
