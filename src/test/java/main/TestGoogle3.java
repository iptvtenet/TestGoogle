package main;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Tools;

public class TestGoogle3 {

    Tools tools = new Tools();
    BodyTests body = new BodyTests();

    @Test()
    public void testLuckyButton() throws InterruptedException {
        body.iamLucky();
    }


    @BeforeMethod
    public void setDriver() {
        tools.setUp();
    }

    @AfterMethod
    public void quiteDriver() throws InterruptedException {
        tools.finish();
    }
}
