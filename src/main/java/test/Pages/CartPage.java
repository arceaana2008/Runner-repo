package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
        public SelenideElement placeOrderButton = $(By.xpath("//button[text()='Place Order']"));
        public SelenideElement productsText = $(By.xpath("//h2[text()='Products']"));
        public SelenideElement tabel = $(By.id("tbodyid"));
        public SelenideElement deleteText = $(By.xpath("//tr[@class='success']"));





    }