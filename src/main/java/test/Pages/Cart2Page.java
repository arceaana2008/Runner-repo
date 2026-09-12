package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Cart2Page {
    public SelenideElement remoteButton = $(By.xpath("//a[@ class='removeLine']"));
    public SelenideElement checkOut = $(By.xpath("//input[@ value='Check Out']"));
    public SelenideElement shoppingCartByShopify = $(By.xpath("//div[@ class='six columns offset-by-one']"));
    public SelenideElement myCartButton = $(By.xpath("//a[@class='cart mobile  cart-target']"));
    public SelenideElement continueShopping = $(By.xpath("//div[@class='six columns omega cart total']"));
    public SelenideElement price = $(By.xpath("//a[@class='mobile']"));
    public SelenideElement upDate = $(By.xpath("//input[@id='checkout']"));



}
