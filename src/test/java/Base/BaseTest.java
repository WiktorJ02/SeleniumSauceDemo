package Base;


import Common.Config;
import Common.DriverFactory;
import Common.UserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;

public class BaseTest {

    protected WebDriver driver;
    protected UserFactory userFactory = new UserFactory();
    protected Config config = new Config();

    @BeforeClass
    public void setup() throws FileNotFoundException {
        DriverFactory driverFactory = new DriverFactory();
        config.loadConfig();
        driver = driverFactory.getDriver(config.getBrowser());
        driver.get(config.getLOG_IN_URL());
        driver.manage().window().maximize();
    }

    @AfterClass
    public void quit() {
        driver.quit();
    }
    public void backToPreviousPage() {
        driver.navigate().back();
    }
}
