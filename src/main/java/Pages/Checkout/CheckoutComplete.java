package Pages.Checkout;

import Pages.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutComplete extends BasePage {

    @FindBy(css = ".complete-header")
    WebElement completePageElement;

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backToProductsButton;


    public CheckoutComplete(WebDriver driver) {
        super(driver);
    }

    public boolean pageLoaded() {
        return completePageElement.isDisplayed();
    }

    public void BackToProducts() {
        backToProductsButton.click();
    }
}
