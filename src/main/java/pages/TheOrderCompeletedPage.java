package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheOrderCompeletedPage extends PageBase
{
	public TheOrderCompeletedPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="div.complete-text")
	public WebElement orderCompeleteLable ;
	
}
