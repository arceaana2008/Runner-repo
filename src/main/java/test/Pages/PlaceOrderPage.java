package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PlaceOrderPage{
    public SelenideElement placeOrderButton = $(By.xpath("//button[text()='Place Order']"));
    public SelenideElement nameField = $(By.id("name"));
    public SelenideElement countryField = $(By.id("country"));
    public SelenideElement cityField = $(By.id("city"));
    public SelenideElement cardField = $(By.id("card"));
    public SelenideElement monthField = $(By.id("month"));
    public SelenideElement yearField = $(By.id("year"));
    public SelenideElement closeButton = $(By.xpath("//div[@id='orderModal']//button[text()='Close']"));
    public SelenideElement purchaseButton = $(By.xpath("//button[text()='Purchase']"));
    public SelenideElement successfulMessage = $(By.xpath("//h2[text()='Thank you for your purchase!']"));

    }

