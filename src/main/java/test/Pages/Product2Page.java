package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Product2Page {
    public SelenideElement products = $(By.xpath("//section[@ class='product-grid twelve columns alpha omega']"));
    public SelenideElement menuLink = $(By.id("main-menu"));
    public SelenideElement soldOutLink = $(By.id("product-3"));
    public SelenideElement sizeButton = $(By.id("product-select"));
    public SelenideElement colorButton = $(By.xpath("//select[@id='product-select-option-1']"));
    public SelenideElement addToCartButton = $(By.id("add"));
}
