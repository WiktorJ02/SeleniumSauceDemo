package Common;

import Enum.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class DriverFactory {

    public WebDriver getDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFireFoxDriver();
            case EDGE:
                return getEdgeDriver();
            case IE:
                return getIEDriver();
            default:
                throw new IllegalStateException("Unexpected browser");
        }
    }

    private WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private WebDriver getFireFoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    private WebDriver getIEDriver() {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }


}
