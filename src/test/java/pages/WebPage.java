package pages;

import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebPage {
    By input_username = By.id("user-name");
    By input_pwd = By.id("password");
    By btn_login = By.id("login-button");
    By icon_cart = By.xpath("//a[@class='shopping_cart_link']");
    By icon_cart_item = By.xpath("//span[@class='shopping_cart_badge']");
    By add_item = By.xpath("(//*[text()='Add to cart'])[1]");
    By remove_item = By.xpath("(//*[text()='Remove'])[1]");


    By err_msg(String errMsg) {
        return By.xpath("//*[contains(text(),' " + errMsg + "')]");
    }
    public void openBrowser() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPassword(String pwd) {
        driver.findElement(input_pwd).sendKeys(pwd);
    }

    public void clickBtnLogin() {
        driver.findElement(btn_login).click();
    }

    public void verifyIconCart() {
        driver.findElement(icon_cart).isDisplayed();
    }

    public void verifyErrMsg(String errMsg) {
        driver.findElement(err_msg(errMsg)).isDisplayed();
    }

    public void addToCart() {
        driver.findElement(add_item).click();
    }

    public void assertCartItem(String cartItem) {
        String itemExpected = cartItem;
        String itemActual = driver.findElement(icon_cart_item).getText();
        assertThat(itemActual).isEqualTo(itemExpected);
    }

    public void removeItemFromCart() {
        driver.findElement(remove_item).click();
    }
}
