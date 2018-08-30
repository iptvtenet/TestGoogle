package main;

import org.testng.annotations.*;
import utils.Tools;

public class TestsGoogle {

    Tools tools = new Tools();
    BodyTests body = new BodyTests();

    @Test(groups = "1")
    public void testLoadPage() throws InterruptedException {
        tools.setUp();
        body.loadGooglePage();
        tools.finish();
    }

    @Test(groups = "2")
    public void testSearchButton() throws InterruptedException {
        tools.setUp();
        body.searchButton();
        tools.finish();
    }

    @Test(groups = "3")
    public void testLuckyButton() throws InterruptedException {
        tools.setUp();
        body.iamLucky();
        tools.finish();
    }

    @Test(groups = "4")
    public void testAboutGoogle() throws InterruptedException {
        tools.setUp();
        body.allAboutGoogle();
        tools.finish();
    }


//    @BeforeMethod
//    public void setDriver() {
//        tools.setUp();
//    }
//
//    @AfterMethod
//    public void quiteDriver() throws InterruptedException {
//        tools.finish();
//    }


}
