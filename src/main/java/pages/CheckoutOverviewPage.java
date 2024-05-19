package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends PageBase
{

	public CheckoutOverviewPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="a.btn_action.cart_button")
	WebElement finish_button ;
	
public void Click_on_finish_button() {
		
		clickButton(finish_button);
	}
   
}
