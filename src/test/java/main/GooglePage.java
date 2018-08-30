package main;

import org.openqa.selenium.By;

public class GooglePage {

    By buttonSeach = By.cssSelector(".jsb > center:nth-child(1) > input:nth-child(1)");
    By buttonLuck = By.cssSelector(".jsb > center:nth-child(1) > input:nth-child(2)");
    By fieldForEnter = By.cssSelector("#lst-ib");
    By fieldMail = By.cssSelector("div.gb_Q:nth-child(1) > a:nth-child(1)");
    By googleLogo = By.cssSelector("#hplogo");
    By allAboutgoogle = By.cssSelector("a.Fx4vi:nth-child(3)");

}
