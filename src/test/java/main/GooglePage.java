package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

    By buttonSeach = By.cssSelector(".jsb > center:nth-child(1) > input:nth-child(1)");
    By buttonLuck = By.cssSelector(".jsb > center:nth-child(1) > input:nth-child(2)");
    By fieldForEnter = By.cssSelector("#lst-ib");


    private final WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }
}
