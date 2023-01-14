package Base;

import Pages.Basket.CartPage;
import Pages.Checkout.CheckoutComplete;
import Pages.Checkout.CheckoutOne;
import Pages.Checkout.CheckoutTwo;
import Pages.Main.MainPage;
import Pages.User.LogInPage;
import org.testng.annotations.BeforeMethod;

public class Pages extends BaseTest {
    public LogInPage logInPage;
    public MainPage mainPage;
    public CartPage cartPage;
    public CheckoutOne checkoutOnePage;
    public CheckoutTwo checkoutTwoPage;
    public CheckoutComplete checkoutCompletePage;

    @BeforeMethod
    public void pageSetup() {
        logInPage = new LogInPage(driver);
        mainPage = new MainPage(driver);
        cartPage = new CartPage(driver);
        checkoutOnePage = new CheckoutOne(driver);
        checkoutTwoPage = new CheckoutTwo(driver);
        checkoutCompletePage = new CheckoutComplete(driver);
    }
}
