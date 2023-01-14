package Pages.Checkout;

import Common.User;
import Pages.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOne extends BasePage {

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postalCodeInput;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    public CheckoutOne(WebDriver driver) {
        super(driver);
    }

    public void FillInInformations(User user) {
        firstNameInput.sendKeys(user.getFirstName());
        lastNameInput.sendKeys(user.getLastName());
        postalCodeInput.sendKeys(user.getZipCode());
        checkoutButton.click();
    }
}
