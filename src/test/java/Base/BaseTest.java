package Base;

import Enum.Browser;

import Common.Config;
import Common.DriverFactory;
import Common.UserFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;

public class BaseTest {

    protected WebDriver driver;
    protected UserFactory userFactory = new UserFactory();
    protected Config config = new Config();

    @BeforeClass
    public void setup() throws FileNotFoundException {
        DriverFactory driverFactory = new DriverFactory();
        config.loadConfig();
        driver = driverFactory.getDriver(Browser.valueOf(config.getBrowser()));
        driver.get(config.getBASE_URL());
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
