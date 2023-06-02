package Pages;


import Utility.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "span[class='nav-link-title']")
    public WebElement dashboard;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;
    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;
    @FindBy(xpath = "//div[contains(text(),'already')]")
    public WebElement alreadyExist;
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;
    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    private WebElement toggleBar;
    @FindBy(xpath = "//mat-select//span[text()='Academic Period']")
    private WebElement academicPeriod;
    @FindBy(xpath = "(//mat-option/span)[1]")
    private WebElement academicPeriod1;
    @FindBy(xpath = "(//span[text()='Grade Level'])[1]")
    private WebElement gradeLevel;
    @FindBy(xpath = "(//mat-option//span)[2]")
    private WebElement gradeLevel2;
    @FindBy(xpath = "//div[contains(text(),'no data')]")
    public WebElement notificationMsg;
    @FindBy(xpath = "//ms-edit-button//button")
    public WebElement editButton;
    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    public WebElement noData;
    @FindBy(xpath = "(//div[contains(@class, 'mat-select-value')])[3]")
    private WebElement stageInDocTypes;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement studentRegistration;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement examination;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement employment;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    private WebElement certificate;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[5]")
    private WebElement contract;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[6]")
    private WebElement dismissal;
    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    private WebElement description;
    @FindBy(xpath = "//ms-edit-button//button")
    public WebElement editImageBtn;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement capacity;
    @FindBy(xpath = "//input[@data-placeholder='IBAN']")
    public WebElement iban;
    @FindBy(xpath = "(//span[contains(@class,'mat-select-placeholder')])[2]")
    public WebElement currency;
    @FindBy(xpath = "(//span[contains(@class,'mat-option-text')])[2]")
    public WebElement usd;
    @FindBy(xpath = "(//span[contains(@class,'mat-option-text')])[2]")
    public WebElement eur;
    @FindBy(xpath = "//td[text()='group15']/following-sibling::td[3]//ms-delete-button")
    public WebElement DeleteDepartment;
    @FindBy(xpath = "//td[text()='group15']/following-sibling::td[5]//ms-delete-button")
    public WebElement DeleteLocation;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']/input")
    public WebElement order;
    @FindBy(xpath = "(//input[@data-placeholder='Description'])[2]")
    public WebElement descriptionInDiscounts;
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Description']")
    public WebElement descriptionSearchInDiscounts;
    @FindBy(xpath = "(//input[@data-placeholder='Integration Code'])[2]")
    public WebElement integrationCodeInDiscounts;
    @FindBy(xpath = "//input[@data-placeholder='Priority']")
    public WebElement priorityInDiscounts;


    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "addButton":
                return addButton;
            case "saveButton":
                return saveButton;
            case "nameInput":
                return nameInput;
            case "codeInput":
                return codeInput;
            case "integrationCode":
                return integrationCode;
            case "priorityCode":
                return priorityCode;
            case "toggleBar":
                return toggleBar;
            case "academicPeriod":
                return academicPeriod;
            case "academicPeriod1":
                return academicPeriod1;
            case "gradeLevel":
                return gradeLevel;
            case "gradeLevel2":
                return gradeLevel2;
            case "searchInput":
                return searchInput;
            case "shortName":
                return shortName;
            case "editButton":
                return editButton;
            case "searchButton":
                return searchButton;
            case "stageInDocTypes":
                return stageInDocTypes;
            case "studentRegistration":
                return studentRegistration;
            case "examination":
                return examination;
            case "employment":
                return employment;
            case "certificate":
                return certificate;
            case "contract":
                return contract;
            case "dismissal":
                return dismissal;
            case "description":
                return description;
            case "editImageBtn":
                return editImageBtn;
            case "capacity":
                return capacity;
            case "deleteImageBtn":
                return deleteImageBtn;
            case "deleteDialogBtn":
                return deleteDialogBtn;
            case "iban":
                return iban;
            case "currency":
                return currency;
            case "usd":
                return usd;
            case "eur":
                return eur;
            case "order":
                return order;
            case "descriptionInDiscounts":
                return descriptionInDiscounts;
            case "integrationCodeInDiscounts":
                return integrationCodeInDiscounts;
            case "priorityInDiscounts":
                return priorityInDiscounts;
            case "descriptionSearchInDiscounts":
                return descriptionSearchInDiscounts;
        }
        return null;
    }

    public void deleteItem(String searchText) {
        sendkeysFunc(searchInput, searchText);
        clickFunc(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunc(deleteImageBtn);
        clickFunc(deleteDialogBtn);
    }

    public void editItem(String searchText, String nameText) {
        sendkeysFunc(searchInput, searchText);
        clickFunc(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunc(editImageBtn);
        sendkeysFunc(nameInput, nameText);
        clickFunc(saveButton);

    }

    public void editItemInDiscount(String searchText, String nameText) {
        sendkeysFunc(descriptionSearchInDiscounts, searchText);
        clickFunc(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunc(editImageBtn);
        sendkeysFunc(descriptionInDiscounts, nameText);
        clickFunc(saveButton);

    }

    public void deleteItemInDiscount(String searchText) {
        sendkeysFunc(descriptionSearchInDiscounts, searchText);
        clickFunc(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunc(deleteImageBtn);
        clickFunc(deleteDialogBtn);

    }

    public boolean FoundElement(WebElement element) {
        try {
            Actions actions = new Actions(GWD.getDriver());
            waitUntilClickable(element);
            scrollToElement(element);
            actions.moveToElement(element).release(element).click().perform();
            return true;
        } catch (Exception e) {
        }
        return false;
    }
}
