package Pages.Basket;

import Pages.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    @FindBy(css = ".cart_quantity")
    WebElement quantity;

    @FindBy(css = ".inventory_item_name")
    WebElement name;

    @FindBy(css = ".inventory_item_price")
    WebElement price;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void NameHolder() {
        name.getText();
    }

    public void QuantityHolder() {
        quantity.getText();
    }

    public void PriceHolder() {
        price.getText();
    }

}
