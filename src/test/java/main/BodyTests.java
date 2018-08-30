package main;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Tools;
import utils.Variables;

public class BodyTests {

    Tools tools = new Tools();
    GooglePage googlePage = new GooglePage();


    public void loadGooglePage() {
        Assert.assertEquals("Почта", tools.myElement(googlePage.fieldMail).getText());
    }

    public void searchButton() {
        tools.clearAndFill(googlePage.fieldForEnter, "voip");
        tools.myElement(googlePage.googleLogo).click();
        tools.myElement(googlePage.buttonSeach).click();
        Assert.assertEquals("Все", tools.myElement(By.cssSelector(Variables.celectorAll)).getText());
    }

    public void iamLucky() {
        tools.clearAndFill(googlePage.fieldForEnter, "voip");
        tools.myElement(googlePage.googleLogo).click();
        tools.myElement(googlePage.buttonLuck).click();
        Assert.assertEquals("IP-телефония", tools.myElement(By.cssSelector(Variables.celectorVOIP)).getText());
    }

    public void allAboutGoogle() {
        tools.myElement(googlePage.allAboutgoogle).click();
        Assert.assertEquals("Компания", tools.myElement(By.cssSelector(Variables.celectorCompany)).getText());

    }

}
