package test.Steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import org.junit.Assert;
import test.Pages.CartPage;

public class CartSteps {
    @And("click on the {string}button from Cart page")
    public void clickOnThePlaceOrderButtonFromCartPage(String button) {
        // Write code here that turns the phrase above into concrete actions
        CartPage cartPage = new CartPage();
        switch (button){
            case "Place Order":
                cartPage.placeOrderButton.click();
                Selenide.sleep(2000);
                break;
        }
    }
}
