package test.Steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.When;
import test.Pages.HomePage;
import test.Pages.PlaceOrderPage;

import static com.codeborne.selenide.files.DownloadActions.click;

public class MainSteps {
    @When("user navigate to then {string} link")
    public void userNavigateToThenLogInLink(String link) {
        HomePage homePage = new HomePage();
        switch (link) {
            case "Log in":
                homePage.loginlink.click();
                Selenide.sleep(2000);
                break;
            case "Sign up":
                homePage.singUp.click();
                Selenide.sleep(2000);
                break;
        }

    }

    @When("user select {int} product from Main Page")
    public void userSelectProductFromMainPage(int arg0) {
        // Write code here that turns the phrase above into concrete actions

            HomePage homePage = new HomePage();
            homePage.products.get( arg0).click();
            Selenide.sleep(4000);
        }
        @When("user fills order details and completes purchase")
    public void userFillsOrderDetailsAndCompletesPurchase(){
        PlaceOrderPage placeOrderPage = new PlaceOrderPage();
            placeOrderPage.purchaseButton.click();
        Selenide.sleep(3000);
        }
}