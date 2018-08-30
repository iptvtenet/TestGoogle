package main;

import org.testng.annotations.*;
import utils.Tools;

public class TestsGoogle {

    Tools tools = new Tools();
    BodyTests body = new BodyTests();

    @Test(groups = "1")
    public void testLoadPage() throws InterruptedException {
        body.loadGooglePage();
    }

    @Test(groups = "2")
    public void testSearchButton() throws InterruptedException {
        body.searchButton();
    }

    @Test(groups = "3")
    public void testLuckyButton() throws InterruptedException {
        body.iamLucky();
    }

    @Test(groups = "4")
    public void testAboutGoogle() throws InterruptedException {
        body.allAboutGoogle();
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
