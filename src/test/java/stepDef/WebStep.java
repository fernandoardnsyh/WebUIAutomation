package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;

public class WebStep {

    WebPage webPage;
    public WebStep() {
        this.webPage = new WebPage();
    }

    @Given("open web login page")
    public void openWebLoginPage() {
        webPage.openBrowser();
    }

    @And("user input username {string}")
    public void inputUsername(String username) {
        webPage.inputUsername(username);
    }


    @And("user input password {string}")
    public void inputPassword(String password) {
        webPage.inputPassword(password);
    }


    @And("user click login button")
    public void clickLoginButton() {
        webPage.clickBtnLogin();
    }

    @And("user will see icon cart")
    public void userWillSeeIconCart() {
        webPage.verifyIconCart();
    }

    @And("user will see err message {string}")
    public void userWillSeeErrMessage(String errMsg) {
        webPage.verifyErrMsg(errMsg);
    }

    @And("user add item to cart")
    public void userAddItemToCart() {
        webPage.addToCart();
    }


    @Then("verify cart item is match {string}")
    public void verifyCartItemIsMatch(String cartItem) {
        webPage.assertCartItem(cartItem);
    }

    @And("user remove item from cart")
    public void userRemoveItemFromCart() {
        webPage.removeItemFromCart();
    }
}
