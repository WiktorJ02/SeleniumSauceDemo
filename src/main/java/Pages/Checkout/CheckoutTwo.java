package Pages.Checkout;

import Pages.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutTwo extends BasePage {

    @FindBy(css = ".summary_total_label")
    WebElement totalPrice;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    public CheckoutTwo(WebDriver driver) {
        super(driver);
    }

    public void totalPriceHolder() {
        totalPrice.getText();
    }

    public void Finish() {
        finishButton.click();
    }
}
