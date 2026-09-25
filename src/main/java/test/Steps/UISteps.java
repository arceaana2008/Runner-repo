package test.Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.PendingException;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import test.Pages.CartPage;
import test.Pages.HomePage;
import org.junit.Assert;
import test.Pages.PlaceOrderPage;
import test.Pages.ProductPage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Selenide.switchTo;

public class UISteps {
    @Then("the navigation bar links {string} should be displayed")
    public void theNavigationBarLinksShouldBeDysplayed(String link) {
        // Write code here that turns the phrase above into concrete actions

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.homeLink.isDisplayed());
        Assert.assertTrue(homePage.contactLink.isDisplayed());
        Assert.assertTrue(homePage.aboutUsLink.isDisplayed());
        Assert.assertTrue(homePage.cartLink.isDisplayed());
        Assert.assertTrue(homePage.loginlink.isDisplayed());
        Assert.assertTrue(homePage.singUp.isDisplayed());

    }


    @And("the categories  {string} should be displayed")
    public void theCategoriesShouldBeDysplayed(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.phonesLink.isDisplayed());
        Assert.assertTrue(homePage.laptopsLink.isDisplayed());
        Assert.assertTrue(homePage.monitorsLink.isDisplayed());
    }


    @And("the products should be displayed")
    public void theProductsShouldBeDysplayed() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        for (SelenideElement i : homePage.products) {
            Assert.assertTrue(i.isDisplayed());
        }
    }

    @And("the aboutUs should be displayed")
    public void theAboutUsShouldBeDysplayed() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.aboutUs.isDisplayed());
        System.out.println("About US" + homePage.aboutUs.getText());
        Assert.assertTrue(homePage.aboutUs.getText().contains("We believe performance needs to be validated at every stage of the software development cycle and our open source compatible, massively scalable platform makes that a reality.\n"));


    }

    @And("the getInTouch should be displayed")
    public void theGetInTouchShouldBeDysplayed() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.getInTouch.isDisplayed());
        System.out.println("TOUCH" + homePage.getInTouch.getText());
        Assert.assertTrue(homePage.getInTouch.getText().contains("Address: 2390 El Camino Real\n" +
                "Phone: +440 123456\n" +
                "Email: demo@blazemeter.com"));
    }

    @And("the PRODUCTSTORE should be displayed")
    public void thePRODUCTSTOREShouldBeDysplayed() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.PRODUCTSTORE.isDisplayed());
    }

    @And("the copyrightProductStore should be displayed")
    public void theCopyrightProductStoreShouldBeDysplayed() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.copyrightProductStore.isDisplayed());
    }

    @Then("select product is displyaed")
    public void selectProductIsDisplyaed() {
        Selenide.sleep(2000);
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.selectProduct.isDisplayed());
    }

    @And("name product is displayed")
    public void nameProductIsDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.nameProduct.isDisplayed());
    }

    @And("price product is displayed")
    public void priceProductIsDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.priceProduct.isDisplayed());
    }

    @And("product description is displayed")
    public void productDescriptionIsDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.productDescription.isDisplayed());
    }

    @And("add to card button is displayed in green color")
    public void addToCardButtonIsDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.addToCartButton.isDisplayed());
        homePage.addToCartButton.shouldHave(cssValue("background-color", "rgba(52, 168, 83, 1)"));
        System.out.println("Add to cart button " + homePage.addToCartButton.getText());
        Assert.assertTrue(homePage.addToCartButton.getText().contains("Add to cart"));
    }

    @And("product image is displayed")
    public void productImageIsDisplayed() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.image.isDisplayed());
    }

    @And("add product in the cart")
    public void addProductInTheCart() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        homePage.addToCartButton.click();
        Selenide.sleep(2000);
    }

    @Then("appear allert with message {string}")
    public void appearAllertWithMessage(String message) {
        // Write code here that turns the phrase above into concrete actions
        String actualMessage = switchTo().alert().getText();
        Assert.assertTrue(message.equals(actualMessage));
        switchTo().alert().accept();

    }

    // @When("user navigate to the {string} link")
    //   HomePage homePage = new HomePage();
//switch (link){case "Home":
    //    homePage.homeLink.click();
    //  break;
    //case "Contact":
    //  homePage.contactLink.click();
    //  break;
    // case "About us":
    //   homePage.aboutUsLink.click();
    //  break;
    // case "Cart":
    // homePage.cartLink.click();
    // break;
    //case "Log in":
    //  homePage.loginlink.click();
    // break;

    //}
    @When("user navigate to the {string} link")

    public void userNavigateToThenLink(String link) {

        HomePage homePage = new HomePage();

        if (link.equals("Home")) {
            homePage.homeLink.click();
        } else if (link.equals("Contact")) {
            homePage.contactLink.click();
        } else if (link.equals("About us")) {
            homePage.aboutUsLink.click();
        } else if (link.equals("Cart")) {
            homePage.cartLink.click();
            Selenide.sleep(2000);
        } else if (link.equals("Log in")) {
            homePage.loginlink.click();
        } else {
            System.out.println("Link-ul nu există: " + link);
        }
    }

    @Then("products text is displayed")
    public void productsTextIsDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        CartPage cartPage = new CartPage();
        Assert.assertTrue(cartPage.productsText.isDisplayed());
    }

    @And("place order button is displayed")
    public void placeOrderButtonIsDisplayed() {
        // Write code here that turns the phrase above into concrete actions
       CartPage cartPage = new CartPage();
       Assert.assertTrue(cartPage.placeOrderButton.isDisplayed());
    }

    @And("tabel is displayed")
    public void tabelIsDisplayed() {
        Selenide.sleep(2000);
        // Write code here that turns the phrase above into concrete actions
      CartPage cartPage = new CartPage();
      Assert.assertTrue(cartPage.tabel.isDisplayed());
    }

    @And("delete text is displayed")
    public void deleteTextIsDisplayed() {
        // Write code here that turns the phrase above into concrete actions
       CartPage cartPage = new CartPage();
       Assert.assertTrue(cartPage.deleteText.isDisplayed());
    }

    @And("click on the order place button")
    public void clickOnTheOrderPlaceButton() {
        // Write code here that turns the phrase above into concrete actions
        CartPage cartPage = new CartPage();
        cartPage.placeOrderButton.click();
        Selenide.sleep(2000);
    }

    @Then("fields is displayed")
    public void fieldsIsDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        PlaceOrderPage placeOrderPage = new PlaceOrderPage();
        Assert.assertTrue(placeOrderPage.nameField.isDisplayed());
        Assert.assertTrue(placeOrderPage.countryField.isDisplayed());
        Assert.assertTrue(placeOrderPage.cityField.isDisplayed());
        Assert.assertTrue(placeOrderPage.cardField.isDisplayed());
        Assert.assertTrue(placeOrderPage.monthField.isDisplayed());
        Assert.assertTrue(placeOrderPage.yearField.isDisplayed());
    }

    @And("click on the close button")
    public void clickOnTheCloseButton() {
        // Write code here that turns the phrase above into concrete actions
       PlaceOrderPage placeOrderPage = new PlaceOrderPage();
       placeOrderPage.closeButton.shouldBe(Condition.visible).click();
       Selenide.sleep(2000);
    }

    @And("click on the purchase button")
    public void clickOnThePurchaseButton() {
        // Write code here that turns the phrase above into concrete actions
       PlaceOrderPage placeOrderPage = new PlaceOrderPage();
       placeOrderPage.purchaseButton.shouldBe(Condition.visible).click();
       Selenide.sleep(2000);
    }


    @Then("Thank you for your purchase! is displayed")
    public void thankYouForYourPurchaseIsDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        PlaceOrderPage placeOrderPage = new PlaceOrderPage();
        Assert.assertTrue(placeOrderPage.successfulMessage.isDisplayed());
    }

    @And("complete the name and credit card fields")
    public void completeTheNameAndCreditCardFields() {
        // Write code here that turns the phrase above into concrete actions
        PlaceOrderPage placeOrderPage = new PlaceOrderPage();
        Assert.assertTrue(placeOrderPage.nameField.isDisplayed());
        placeOrderPage.nameField.sendKeys("Ana");
        Assert.assertTrue(placeOrderPage.cardField.isDisplayed());
        placeOrderPage.cardField.sendKeys("2345678909876");
        Selenide.sleep(2000);
    }

    @When("Count products from the site")
    public void countProductsFromTheSite() {
        // Write code here that turns the phrase above into concrete actions
       HomePage homePage = new HomePage();
       Selenide.sleep(2000);
       //System.out.println(homePage.products.stream().count());
      // Assert.assertTrue(homePage.products.stream().count()==9);
        ElementsCollection productsList = homePage.products;
          for (SelenideElement product : productsList) {
              System.out.println(productsList.size());
              Assert.assertTrue(homePage.products.size()==9);
          }

    }

    @And("Click on the next button")
    public void clickOnTheNextButton() {
        // Write code here that turns the phrase above into concrete actions
       Selenide.sleep(2000);
        HomePage homePage = new HomePage();
       homePage.nextButton.click();
       Selenide.sleep(3000);
    }


    @And("Count products from the second page")
    public void countProductsFromTheSecondPage() {
        // Write code here that turns the phrase above into concrete actions
       HomePage homePage = new HomePage();
       Selenide.sleep(2000);
       // System.out.println(homePage.products.stream().count());
       // Assert.assertTrue(homePage.products.size()==6);
        ElementsCollection productsList = homePage.products;
        for (SelenideElement product : productsList){
            System.out.println(productsList.size());
            Assert.assertTrue(homePage.products.size()==6);
        }
    }

    @And("Click on the previous button")
    public void clickOnThePreviousButton() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        homePage.previousButton.click();
        Selenide.sleep(2000);
    }

    @And("Second page contains Asus")
    public void secondPageContainsAsus() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        boolean Asus = false;
        HomePage homePage = new HomePage();
        Selenide.sleep(2000);
        for (SelenideElement i : homePage.productsFromSecondPage){
            String productsName = i.getText();
            Selenide.sleep(2000);
            System.out.println("Products" + productsName);
            if(productsName.contains("ASUS")){
                Asus = true;
                break;

            }

         Assert.assertTrue(Asus);

        }
    }
}


