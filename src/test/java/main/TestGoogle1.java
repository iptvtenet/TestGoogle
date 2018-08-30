package main;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Tools;

public class TestGoogle1 {

    Tools tools = new Tools();
    BodyTests body = new BodyTests();

    @Test()
    public void testLoadPage() throws InterruptedException {
        body.loadGooglePage();
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
