package Pages.Main;

import Pages.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOutButton;

    @FindBy(css = ".inventory_list")
    WebElement products;

    @FindBy(css = ".app_logo")
    WebElement mainPageElement;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartButton;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addBackpackToCartButton;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean pageLoaded() { return mainPageElement.isDisplayed();
    }

    public void addBackpacktoCart() {
        addBackpackToCartButton.click();
    }
    public void removeBackpackFromCart() {
        addBackpackToCartButton.click();
    }

    public void openCart() {
        cartButton.click();
    }

    public void logOut() {
        menuButton.click();
        click(logOutButton);
    }




}
