package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.Utility;

public class L2ItemEdit {

	@FindBy (name = "itemNumber")
	public static WebElement txtbx_ItemNumber;
	
	@FindBy (name = "itemTypeId")
	public static WebElement drdwn_ItemType;
	
	@FindBy (name = "isRecurring")
	public static WebElement drdwn_Recurring;
	
	@FindBy (name = "title")
	public static WebElement txtbx_ItemTitle;
	
	@FindBy (name = "shortDescription")
	public static WebElement txtbx_Description;
	
	@FindBy (name = "price")
	public static WebElement txtbx_Price;
	
	@FindBy (name = "cost")
	public static WebElement txtbx_Cost;

	@FindBy (name = "includedMinutes")
	public static WebElement txtbx_IncludedMinutes;

	@FindBy (name = "includedExtensions")
	public static WebElement txtbx_IncludedExtensions;
	
	@FindBy (name = "isActive")
	public static WebElement drdwn_Active;

	@FindBy (id = "showOnProposal")
	public static WebElement chckbx_ShowOnProposal;

	@FindBy (name = "usfPercentage")
	public static WebElement txtbx_UsfPercentage;

	@FindBy (id = "available_tax_classes")
	public static WebElement slctbx_AvailableTaxItems;
	
	@FindBy (className = "add_selected")
	public static WebElement btn_AddItem;

	@FindBy (className = "remove_selected")
	public static WebElement btn_RemoveItem;
	
	@FindBy (id = "selected_tax_classes")
	public static WebElement slctbx_SelectedTaxItems;
	
	@FindBy (id = "isTaxFeeOn")
	public static WebElement btn_TaxFeeNo;

	@FindBy (id = "isTaxFeeOff")
	public static WebElement btn_TaxFeeYes;

	@FindBy (className = "btn-save-new")
	public static WebElement btn_SaveNew;	

	@FindBy (className = "btn-save")
	public static WebElement btn_Save;	

	@FindBy (linkText = "Cancel")
	public static WebElement btn_Cancel;	

// Methods
	String ReccuringType = "";

	public void SelectMonthlyRecurringType() {
		Select Recurring = new Select(drdwn_Recurring);
		Recurring.selectByVisibleText("Monthly Recurring Charge");
		this.ReccuringType = "MRC";
	}
	
	public void SelectNonRecurringType() {
		Select Recurring = new Select(drdwn_Recurring);
		Recurring.selectByVisibleText("Non Recurring Charge");
		this.ReccuringType = "NRC";
	}
	
	public void EnterItemNumber() {
		txtbx_ItemNumber.sendKeys( ReccuringType+ " - "+ Utility.Release + Utility.StringRandom(3));
	}
	
	public void EnterItemTitle() {
		txtbx_ItemTitle.sendKeys( ReccuringType+ " - "+ Utility.Release);
	}
	
	public void EnterItemDescription() {
		txtbx_Description.sendKeys( "Description for "+ ReccuringType+ " Item - "+ Utility.Release);
	}
	
	public void SelectItemTypeByIndex(int Index) {
		Select ItemType = new Select(drdwn_ItemType);
		ItemType.selectByIndex(Index);
	}
	
	public void EnterPriceValue() {
		txtbx_Price.clear();
		txtbx_Price.sendKeys(Utility.NumberRandom(2)+"."+Utility.NumberRandom(2));
	}
	
	public void EnterPriceValue(String Value) {
		txtbx_Price.clear();
		txtbx_Price.sendKeys(Value);
	}
	
	public void EnterCostValue() {
		txtbx_Cost.clear();
		txtbx_Cost.sendKeys(Utility.NumberRandom(2)+"."+Utility.NumberRandom(2));
	}
	
	public void EnterCostValue(String Value) {
		txtbx_Cost.clear();
		txtbx_Cost.sendKeys(Value);
	}
	
	public void EnterUsfPercentageValue() {
		txtbx_UsfPercentage.clear();
		txtbx_UsfPercentage.sendKeys(Utility.NumberRandom(2)+"."+Utility.NumberRandom(2));
	}	
	
	public void EnterUsfPercentageValue(String Value) {
		txtbx_UsfPercentage.clear();
		txtbx_UsfPercentage.sendKeys(Value);
	}
	
	public void SelectTaxItemByIndex(int Index) {
		Select TaxItem = new Select(slctbx_AvailableTaxItems);
		TaxItem.selectByIndex(Index);
		btn_AddItem.click();
	}

	public void SaveItem() {
		btn_Save.click(); 
		Utility.waiting();
	}	
	
}
