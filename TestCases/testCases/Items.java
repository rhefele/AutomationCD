package testCases;

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
	  ItemEditPage.SelectMonthlyRecurringType();
	  ItemEditPage.EnterItemNumber();
	  ItemEditPage.EnterItemTitle();
	  ItemEditPage.EnterItemDescription();
	  ItemEditPage.EnterPriceValue();
	  ItemEditPage.EnterCostValue();
	  ItemEditPage.EnterUsfPercentageValue();
	  ItemEditPage.SelectItemTypeByIndex(2);
	  ItemEditPage.SelectTaxItemByIndex(1);
	  ItemEditPage.SaveItem();
  }
  
  @Test 
  public void createNewNRCItem() {

	  ItemListPage.goTo();
	  ItemListPage.clickNewItemButton();
	  ItemEditPage.SelectNonRecurringType();
	  ItemEditPage.EnterItemNumber();
	  ItemEditPage.EnterItemTitle();
	  ItemEditPage.EnterItemDescription();
	  ItemEditPage.EnterPriceValue();
	  ItemEditPage.EnterCostValue();
	  ItemEditPage.EnterUsfPercentageValue();
	  ItemEditPage.SelectItemTypeByIndex(1);
	  ItemEditPage.SelectTaxItemByIndex(2);
	  ItemEditPage.SaveItem();
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
  }

}
