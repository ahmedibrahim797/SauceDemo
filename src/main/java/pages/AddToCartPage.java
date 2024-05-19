package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends PageBase
{

	public AddToCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="div.cart_item")
	public WebElement cartItem ;
	
	@FindBy(css="a.btn_action.checkout_button")
	WebElement checkout_button ;
	
public void Click_on_checkout_button() {
		
		clickButton(checkout_button);
	}
}
