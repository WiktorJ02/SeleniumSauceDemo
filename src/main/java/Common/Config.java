package Common;

import Enum.Browser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Config {


    private Browser browser;
    private String BASE_URL;
    private String LOG_IN_URL;
    private String PRODUCTS_PAGE_URL;
    private String BASKET_URL;
    private String CHECKOUT_URL;
    private String CHECKOUT_TWO_URL;
    private String CHECKOUT_COMPLETE_URL;
    private String prefixOneProductInBasket;
    private String suffixOneProductInBasket;
    private String prefixProductsInBasket;
    private String suffixProductsInBasket;

    public void loadConfig() throws FileNotFoundException {

        JSONObject a = new JSONObject();
        JSONParser parser = new JSONParser();
        try {
            a = (JSONObject) parser.parse(new FileReader("src/main/resources/config.json"));
            System.out.println(a);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject b = (JSONObject) a.get("Browser");

        this.setBrowser(a.get("browser").toString());
        this.setBASE_URL(a.get("BASE_URL").toString());
        this.setLOG_IN_URL(a.get("LOG_IN_URL").toString());
        this.setPRODUCTS_PAGE_URL(a.get("PRODUCTS_PAGE_URL").toString());
        this.setBASKET_URL(a.get("CART_URL").toString());
        this.setCHECKOUT_URL(a.get("CHECKOUT_URL").toString());
        this.setCHECKOUT_TWO_URL(a.get("CHECKOUT_TWO_URL").toString());
        this.setCHECKOUT_COMPLETE_URL(a.get("CHECKOUT_COMPLETE_URL").toString());
//        this.setPrefixOneProductInBasket(a.get("PrefixOneProductInBasket").toString());
//        this.setSuffixOneProductInBasket(a.get("SuffixOneProductInBasket").toString());
//        this.setPrefixProductsInBasket(a.get("PrefixProductsInBasket").toString());
//        this.setSuffixProductsInBasket(a.get("SuffixProductsInBasket").toString());
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = Browser.valueOf(browser);
    }

    public String getBASE_URL() {
        return BASE_URL;
    }

    public void setBASE_URL(String BASE_URL) {
        this.BASE_URL = BASE_URL;
    }

    public String getLOG_IN_URL() {
        return LOG_IN_URL;
    }

    public void setLOG_IN_URL(String LOG_IN_URL) {
        this.LOG_IN_URL = LOG_IN_URL;
    }

    public String getPRODUCTS_PAGE_URL() {
        return PRODUCTS_PAGE_URL;
    }

    public void setPRODUCTS_PAGE_URL(String PRODUCTS_PAGE_URL) {
        this.PRODUCTS_PAGE_URL = PRODUCTS_PAGE_URL;
    }

    public String getBASKET_URL() {
        return BASKET_URL;
    }

    public void setBASKET_URL(String BASKET_URL) {
        this.BASKET_URL = BASKET_URL;
    }

    public String getCHECKOUT_URL() {
        return CHECKOUT_URL;
    }

    public void setCHECKOUT_URL(String CHECKOUT_URL) {
        this.CHECKOUT_URL = CHECKOUT_URL;
    }

    public String getCHECKOUT_TWO_URL() {
        return CHECKOUT_TWO_URL;
    }

    public void setCHECKOUT_TWO_URL(String CHECKOUT_TWO_URL) {
        this.CHECKOUT_TWO_URL = CHECKOUT_TWO_URL;
    }

    public String getCHECKOUT_COMPLETE_URL() {
        return CHECKOUT_COMPLETE_URL;
    }

    public void setCHECKOUT_COMPLETE_URL(String CHECKOUT_COMPLETE_URL) {
        this.CHECKOUT_COMPLETE_URL = CHECKOUT_COMPLETE_URL;
    }

//    public String getPrefixOneProductInBasket() {
//        return prefixOneProductInBasket;
//    }
//
//    public void setPrefixOneProductInBasket(String prefixOneProductInBasket) {
//        this.prefixOneProductInBasket = prefixOneProductInBasket;
//    }
//
//    public String getSuffixOneProductInBasket() {
//        return suffixOneProductInBasket;
//    }
//
//    public void setSuffixOneProductInBasket(String suffixOneProductInBasket) {
//        this.suffixOneProductInBasket = suffixOneProductInBasket;
//    }
//
//    public String getPrefixProductsInBasket() {
//        return prefixProductsInBasket;
//    }
//
//    public void setPrefixProductsInBasket(String prefixProductsInBasket) {
//        this.prefixProductsInBasket = prefixProductsInBasket;
//    }
//
//    public String getSuffixProductsInBasket() {
//        return suffixProductsInBasket;
//    }
//
//    public void setSuffixProductsInBasket(String suffixProductsInBasket) {
//        this.suffixProductsInBasket = suffixProductsInBasket;
//    }

}
