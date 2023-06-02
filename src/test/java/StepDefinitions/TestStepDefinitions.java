package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utility.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TestStepDefinitions {
    LeftNav ln = new LeftNav();

    DialogContent dc = new DialogContent();

    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = ln.getWebElement(strButton);
            ln.clickFunc(element);
        }
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {

            WebElement element = dc.getWebElement(strButton);
            dc.clickFunc(element);
        }
    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendkeysFunc(element, items.get(i).get(1));

        }
    }


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage, "success");
    }

    @And("Click key on the keyboard")
    public void clickKeyOnTheKeyboard(DataTable dt) {
        List<String> keyList = dt.asList(String.class);
        for (String key : keyList) {
            dc.clickOnTheKeyboard(key);
        }
    }


    @And("User delete item from Dialog Content")
    public void userDeleteItemFromDialogContent(DataTable dt) {
        List<String> items = dt.asList(String.class);

        for (String str : items) {
            dc.deleteItem(str);
        }
    }

    @And("User edit item on Dialog Content")
    public void userEditItemOnDialogContent(DataTable dt) {
        List<String> items = dt.asList(String.class);
        String searchText = items.get(0);
        String nameText = items.get(1);

        dc.editItem(searchText, nameText);

    }

    @Then("Already Exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExist, "already");
    }

    @Then("No data message should be displayed")
    public void noDataMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.noData, "There is no data to display");
    }

    @And("User found delete item from Dialog Content")
    public void userFoundDeleteItemFromDialogContent(DataTable dt) {
        List<String> items = dt.asList(String.class);
        for (String str : items) {
            switch (str) {
                case "Locations":
                    dc.clickFunc(dc.DeleteLocation);
                    break;
                case "Departments":
                    dc.clickFunc(dc.DeleteDepartment);
                    break;
            }
        }
        dc.clickFunc(dc.deleteDialogBtn);
    }

    @And("User edit item on Dialog Content in Discounts")
    public void userEditItemOnDialogContentInDiscounts(DataTable dt) {
        List<String> items = dt.asList(String.class);
        String searchText = items.get(0);
        String nameText = items.get(1);

        dc.editItemInDiscount(searchText, nameText);
    }

    @And("User delete item from Dialog Content in Discounts")
    public void userDeleteItemFromDialogContentInDiscounts(DataTable dt) {
        List<String> items = dt.asList(String.class);

        for (String str : items) {
            dc.deleteItemInDiscount(str);
        }
    }
}




