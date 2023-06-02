package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    public WebElement setupTwo;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenShip;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    private WebElement nationalities;
    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement fees;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsFunc;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExams;


    @FindBy(xpath = "//span[text()='Human Resources'][1]")
    public WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setupHR;
    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    public WebElement positions;
    @FindBy(xpath = "//span[text()='Document Types']")
    public WebElement documentTypes;
    @FindBy(xpath = "//span[text()='Education']")
    public WebElement education;
    @FindBy(xpath = "//span[text()='Subject Categories']")
    public WebElement subjectCategories;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement setupInSubjectCat;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement attestations;

    @FindBy(xpath = "(//span[text()='Fields'])")
    private WebElement fields;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    public WebElement locations;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    public WebElement positionCat;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement departments;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    public WebElement bankAccounts;
    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Discounts']")
    public WebElement discounts;

    public WebElement getWebElement(String strButton) {
        switch (strButton) {
            case "setup":
                return setup;
            case "parameters":
                return parameters;
            case "countries":
                return countries;
            case "citizenship":
                return citizenShip;
            case "nationalities":
                return nationalities;
            case "fees":
                return fees;
            case "entranceExamsFunc":
                return entranceExamsFunc;
            case "entranceExams":
                return entranceExams;
            case "setupTwo":
                return setupTwo;

            case "humanResources":
                return humanResources;
            case "setupHR":
                return setupHR;
            case "positions":
                return positions;
            case "fields":
                return fields;
            case "positionCat":
                return positionCat;

            case "documentTypes":
                return documentTypes;
            case "education":
                return education;
            case "subjectCategories":
                return subjectCategories;
            case "setupInSubjectCat":
                return setupInSubjectCat;
            case "attestations":
                return attestations;
            case "schoolSetup":
                return schoolSetup;
            case "locations":
                return locations;
            case "departments":
                return departments;
            case "bankAccounts":
                return bankAccounts;
            case "gradeLevels":
                return gradeLevels;
            case "discounts":
                return discounts;

        }
        return null;
    }
}
