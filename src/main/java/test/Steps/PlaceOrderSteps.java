package test.Steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import test.Pages.PlaceOrderPage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PlaceOrderSteps {
    @And("fill all fields from Place Order Page")
    public void fillAllFieldsFromPlaceOrderPage() {
        // Write code here that turns the phrase above into concrete actions
        PlaceOrderPage placeOrderPage = new PlaceOrderPage();
        placeOrderPage.nameField.click();
        placeOrderPage.nameField.sendKeys("Ana");
        placeOrderPage.countryField.click();
        placeOrderPage.countryField.sendKeys("Cehia");
        placeOrderPage.cityField.click();
        placeOrderPage.cityField.sendKeys("Praga");
        placeOrderPage.cardField.click();
        placeOrderPage.cardField.sendKeys("234567889986");
        placeOrderPage.monthField.click();
        placeOrderPage.monthField.sendKeys("7");
        placeOrderPage.yearField.click();
        placeOrderPage.yearField.sendKeys("2026");

    }

    @And("click on the {string} button from Place Order page")
    public void clickOnThePurchaseButtonFromPlaceOrderPage(String button) {
        // Write code here that turns the phrase above into concrete actions
        PlaceOrderPage placeOrderPage = new PlaceOrderPage();
        switch (button) {
            case "Purchase":
                placeOrderPage.purchaseButton.click();
                Selenide.sleep(2000);
                break;
        }
    }
    @And("fill all fields from file in Place Order Page")
    public void fillFormPlaceOrder() throws IOException {
        String testData = "src/main/java/test/TestData/testData.txt";
        BufferedReader reader = new BufferedReader(new FileReader(testData));
        String line;
        while ((line=reader.readLine())!=null) {
            String[] values = line.split(",");
      PlaceOrderPage placeOrderPage = new PlaceOrderPage();
placeOrderPage.nameField.sendKeys(values[0]);
placeOrderPage.countryField.sendKeys(values[1]);
placeOrderPage.cityField.sendKeys(values[2]);
placeOrderPage.cardField.sendKeys(values[3]);
placeOrderPage.monthField.sendKeys(values[4]);
placeOrderPage.yearField.sendKeys(values[5]);
        }
    }


        // Write code here that turns the phrase above into concrete actions

    }

