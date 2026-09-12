package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    public SelenideElement addToCartButton=$(By.xpath("//div[@class='col-sm-12 col-md-6 col-lg-6']"));
    public SelenideElement description= $(By.xpath("//div[@class='tab-pane fade active in']"));
    public SelenideElement price = $(By.xpath("//h3[@ class='price-container']"));

}
