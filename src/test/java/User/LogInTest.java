package User;

import Base.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends Pages {

    @BeforeMethod
    public void InitPage() {
        driver.get(config.getLOG_IN_URL());
    }

    @Test
    public void LogInPageLoaded() {
        Assert.assertTrue(logInPage.pageLoaded());
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, config.getLOG_IN_URL());
    }

    @Test
    public void LogInStandardUser() {
        logInPage.logInUser(userFactory.getStandardUser());
        Assert.assertTrue(mainPage.pageLoaded());
        Assert.assertEquals(driver.getCurrentUrl(), config.getBASE_URL());
    }

    @Test
    void SignOutUser() {
        driver.get(config.getBASE_URL());
        mainPage.logOut();
        Assert.assertTrue(logInPage.pageLoaded());
        Assert.assertEquals(driver.getCurrentUrl(), config.getLOG_IN_URL());
    }
}
