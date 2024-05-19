package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import data.JsonDataReader;
import pages.AddToCartPage;
import pages.CheckoutOverviewPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;
import pages.TheOrderCompeletedPage;

public class OrderCycleTestWithDDTAndJSON extends TestBase
{
	
	 
	LoginPage loginObject ; 
	
	ProductPage productItem;
	
	AddToCartPage addToCartObj ;
	
	CheckoutPage CheckoutObj ;
	
	CheckoutOverviewPage CheckoutOverviewObj ;
	
	TheOrderCompeletedPage TheOrderCompeletedObj ;

	@Test(priority=1,alwaysRun=true)
	public void UserCanLoginSuccssfully() throws IOException, ParseException 
	{
		JsonDataReader jsonReader = new JsonDataReader(); 
		jsonReader.JsonReader();
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin(jsonReader.username, jsonReader.password);
		
	}


	@Test(priority=2)
	public void UserCanViewProductPageAndAddItemToCart() throws InterruptedException {
		
		productItem = new ProductPage(driver);
		Assert.assertTrue(productItem.productLable.getText().contains("Products"));
		productItem.AddProductToCart();
		productItem.ViewItemInCart();
	}
	
	@Test(priority=3)
	public void UserCanViewAddToCartPageAndCheckOut() throws InterruptedException {
		
		addToCartObj = new AddToCartPage(driver);
		Assert.assertTrue(addToCartObj.cartLable.getText().contains("Your Cart"));
		Assert.assertTrue(addToCartObj.cartItem.isDisplayed());
		addToCartObj.Click_on_checkout_button();
	}
	
	@Test(priority=4)
	public void UserCanEnterCheckOutData() throws IOException, ParseException 
	{
		JsonDataReader jsonReader = new JsonDataReader(); 
		jsonReader.JsonReader();
		CheckoutObj = new CheckoutPage(driver); 
		Assert.assertTrue(CheckoutObj.cartLable.getText().contains("Checkout: Your Information"));
		CheckoutObj.CheckOutMethod(jsonReader.firstname, jsonReader.lastname ,jsonReader.postalcode );
		
	}
	
	@Test(priority=5)
	public void UserCanViewCheckOutOverview() throws IOException, ParseException 
	{
		CheckoutOverviewObj = new CheckoutOverviewPage(driver); 
		Assert.assertTrue(CheckoutObj.cartLable.getText().contains("Checkout: Overview"));
		CheckoutOverviewObj.Click_on_finish_button();
		
		
	}
	
	@Test(priority=6)
	public void UserCanViewTheCompeletedOrder() throws IOException, ParseException, InterruptedException 
	{
		TheOrderCompeletedObj = new TheOrderCompeletedPage(driver); 
		Assert.assertTrue(TheOrderCompeletedObj.orderCompeleteLable.getText().contains("Your order has been dispatched,"));
		Thread.sleep(1000);
		
	}
	

}
