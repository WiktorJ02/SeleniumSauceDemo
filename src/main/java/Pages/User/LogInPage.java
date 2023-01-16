package Pages.User;

import Common.User;
import Pages.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userNameInput;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement logInButton;

    @FindBy(xpath = "//div[@class='login_logo']")
    WebElement logInPageElement;

    public LogInPage(WebDriver driver) {
        super(driver);

    }

    public LogInPage sendKeysToElement(WebElement webElement, String keys) {
        webElement.sendKeys(keys);
        return this;
    }

    public void logInUser(User user) {
        userNameInput.sendKeys(user.getUserName());
        passwordInput.sendKeys(user.getPassword());
        logInButton.click();
    }
    public boolean pageLoaded(){
        return logInPageElement.isDisplayed();
    }
}
