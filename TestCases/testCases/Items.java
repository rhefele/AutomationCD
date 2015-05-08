package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import utilities.Pages;

public class Items extends Pages{
 
  @Test 
  public void createNewMRCItem() {

	  ItemListPage.goTo();
	  ItemListPage.clickNewItemButton();
	  ItemEditPage.selectMonthlyRecurringType();
	  ItemEditPage.enterItemNumber();
	  ItemEditPage.enterItemTitle();
	  ItemEditPage.enterItemDescription();
	  ItemEditPage.enterPriceValue();
	  ItemEditPage.enterCostValue();
	  ItemEditPage.enterUsfPercentageValue();
	  ItemEditPage.selectItemTypeByIndex(2);
	  ItemEditPage.selectTaxItemByIndex(1);
	  ItemEditPage.clickSave();
	  Assert.assertEquals(true, ItemListPage.searchForText("Item successfully created").isDisplayed()); 
  }
  
  @Test 
  public void createNewNRCItem() {

	  ItemListPage.goTo();
	  ItemListPage.clickNewItemButton();
	  ItemEditPage.selectNonRecurringType();
	  ItemEditPage.enterItemNumber();
	  ItemEditPage.enterItemTitle();
	  ItemEditPage.enterItemDescription();
	  ItemEditPage.enterPriceValue();
	  ItemEditPage.enterCostValue();
	  ItemEditPage.enterUsfPercentageValue();
	  ItemEditPage.selectItemTypeByIndex(1);
	  ItemEditPage.selectTaxItemByIndex(2);
	  ItemEditPage.clickSave();
	  Assert.assertEquals(true, ItemListPage.searchForText("Item successfully created").isDisplayed()); 
  }
   
  @Test 
  public void FieldsValidation() {

	  ItemListPage.goTo();
	  ItemListPage.clickNewItemButton();
	  //Check for negative values and empty fields 
	  ItemEditPage.enterPriceValue("-45.12");
	  ItemEditPage.enterCostValue("-9.45");
	  ItemEditPage.enterUsfPercentageValue("-64.99");
	  ItemEditPage.clickSave();
 	  Assert.assertEquals(true, ItemEditPage.searchForText("Item # must not be blank.").isDisplayed()); 
	  Assert.assertEquals(true, ItemEditPage.searchForText("You must select an item type.").isDisplayed()); 
	  Assert.assertEquals(true, ItemEditPage.searchForText("You must enter an item title.").isDisplayed()); 
	  Assert.assertEquals(true, ItemEditPage.searchForText("You must enter a short description.").isDisplayed()); 
	  Assert.assertEquals(true, ItemEditPage.searchForText("Price must not be negative.").isDisplayed()); 
	  Assert.assertEquals(true, ItemEditPage.searchForText("Cost must not be negative.").isDisplayed()); 
	  Assert.assertEquals(true, ItemEditPage.searchForText("USF Percentage must not be negative.").isDisplayed()); 
	  Assert.assertEquals(true, ItemEditPage.searchForText("Please select a Tax Class. If no Tax Classes are listed, you must first set them up in the Settings module.").isDisplayed()); 
	
	  //Check for invalid values  
	  ItemEditPage.enterPriceValue("test");
	  ItemEditPage.enterCostValue("test");	  
	  ItemEditPage.clickSave();
	  Assert.assertEquals(true, ItemEditPage.searchForText("Price is not a valid currency format").isDisplayed());
	  Assert.assertEquals(true, ItemEditPage.searchForText("Cost is not a valid currency format").isDisplayed());
	  ItemEditPage.clickCancel();
  }
  
  @BeforeClass
	@Parameters(value = { "URL", "Release" })
	public void beforeClass(String URL, String Release) {
	  openUrl(URL);
	  LoginPage.loginInto(); 
	  setRelease(Release);
  }

  @AfterClass
  public void afterClass() {
	  HomePage.SignOut();
  }

  @AfterSuite
  public void afterSuite() {
	  closeBrowser();
  }
}
