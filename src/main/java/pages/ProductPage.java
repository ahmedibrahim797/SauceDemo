package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase
{
	public ProductPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[1]/div[3]/div")
	public WebElement productLable ;
	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")
	WebElement addToCartBtn ; 
	
	@FindBy(id = "shopping_cart_container")
	WebElement addToCartIcon;

	public void AddProductToCart() 
	{
		clickButton(addToCartBtn);
	}

	public void ViewItemInCart() {
		
		clickButton(addToCartIcon);
	}


	

}
