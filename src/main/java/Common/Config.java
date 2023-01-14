package Common;

import Enum.Browser;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private String browser;
    @JsonProperty("BASE_URL")
    private String BASE_URL;
    @JsonProperty("LOG_IN_URL")
    private String LOG_IN_URL;
    @JsonProperty("PRODUCTS_PAGE_URL")
    private String PRODUCTS_PAGE_URL;
    @JsonProperty("BASKET_URL")
    private String BASKET_URL;
    @JsonProperty("CHECKOUT_URL")
    private String CHECKOUT_URL;
    @JsonProperty("CHECKOUT_TWO_URL")
    private String CHECKOUT_TWO_URL;
    @JsonProperty("CHECKOUT_COMPLETE_URL")
    private String CHECKOUT_COMPLETE_URL;
    @JsonProperty("prefixOneProductInBasket")
    private String prefixOneProductInBasket;
    @JsonProperty("suffixOneProductInBasket")
    private String suffixOneProductInBasket;
    @JsonProperty("prefixProductsInBasket")
    private String prefixProductsInBasket;
    @JsonProperty("suffixProductsInBasket")
    private String suffixProductsInBasket;

    public void loadConfig() throws FileNotFoundException {
        InputStream input = new FileInputStream("src/main/resources/config.json");
        Properties properties = new Properties();

        try {
            properties.load(input);
            this.setBrowser(properties.getProperty("browser"));
            this.setBASE_URL(properties.getProperty("BASE_URL"));
            this.setLOG_IN_URL(properties.getProperty("LOG_IN_URL"));
            this.setPRODUCTS_PAGE_URL(properties.getProperty("PRODUCTS_PAGE_URL"));
            this.setBASKET_URL(properties.getProperty("BASKET_URL"));
            this.setCHECKOUT_URL(properties.getProperty("CHECKOUT_URL"));
            this.setCHECKOUT_TWO_URL(properties.getProperty("CHECKOUT_TWO_URL"));
            this.setCHECKOUT_COMPLETE_URL(properties.getProperty("CHECKOUT_COMPLETE_URL"));
            this.setPrefixOneProductInBasket(properties.getProperty("prefixOneProductInBasket"));
            this.setPrefixProductsInBasket(properties.getProperty("prefixProductsInBasket"));
            this.setSuffixOneProductInBasket(properties.getProperty("suffixOneProductInBasket"));
            this.setSuffixProductsInBasket(properties.getProperty("suffixProductsInBasket"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
        this.browser = browser;
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
    public String getPrefixOneProductInBasket() {
        return prefixOneProductInBasket;
    }
    public void setPrefixOneProductInBasket(String prefixOneProductInBasket) {
        this.prefixOneProductInBasket = prefixOneProductInBasket;
    }
    public String getSuffixOneProductInBasket() {
        return suffixOneProductInBasket;
    }
    public void setSuffixOneProductInBasket(String suffixOneProductInBasket) {
        this.suffixOneProductInBasket = suffixOneProductInBasket;
    }
    public String getPrefixProductsInBasket() {
        return prefixProductsInBasket;
    }
    public void setPrefixProductsInBasket(String prefixProductsInBasket) {
        this.prefixProductsInBasket = prefixProductsInBasket;
    }
    public String getSuffixProductsInBasket() {
        return suffixProductsInBasket;
    }
    public void setSuffixProductsInBasket(String suffixProductsInBasket) {
        this.suffixProductsInBasket = suffixProductsInBasket;
    }

}
