package main;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Tools;

public class TestsGoogle {

    Tools tools = new Tools();



   @Test
   public void testLoadPage()
   {

   }

    @Test
    public void testSearchButton()
    {

    }

    @Test
    public void testLuckyButton()
    {

    }

    @Test
    public void testChangeLanguage()
    {

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
