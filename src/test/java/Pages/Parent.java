package Pages;

import Utility.GWD;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.time.Duration;

public class Parent {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void sendkeysFunc(WebElement element, String text) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void clickFunc(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }


    public void verifyContainsTextFunction(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()), "successfully");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    public void verifyElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue((element.isDisplayed()));
    }


    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickOnTheKeyboard(String keyName) {
        try {
            Robot robot = new Robot();
            switch (keyName) {
                case "ESC":
                    robot.keyPress(KeyEvent.VK_ESCAPE);
                    robot.keyRelease(KeyEvent.VK_ESCAPE);

                    break;
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public String findFromExcel(String text) {

        String returnData = "";

        String path = ".idea/loginData.xlsx";

        Sheet sheet = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e) {

        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(text)) {
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    returnData += sheet.getRow(i).getCell(j);

                }
            }
        }

        return returnData;
    }

}

