package test.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    public SelenideElement loginlink = $(By.id("login2"));
    public ElementsCollection products = $$(By.xpath("//div[@class='col-lg-4 col-md-6 mb-4']"));
    public SelenideElement logo = $(By.xpath("//a[@ class='navbar-brand']"));
    public SelenideElement homeLink = $(By.xpath("//a[@ class='nav-link'and text()='Home ']"));
    public SelenideElement contactLink = $(By.xpath("//a[@ class='nav-link'and text()='Contact']"));
    public SelenideElement aboutUsLink = $(By.xpath("//a[@ class='nav-link'and text() ='About us']"));
    public SelenideElement cartLink = $(By.xpath("//a[@class='nav-link' and text()='Cart']"));
    public SelenideElement logInLink = $(By.id("login2"));
    public SelenideElement singUp = $(By.id("signin2"));
    public SelenideElement categoriesLink = $(By.id("cat"));
    public SelenideElement phonesLink = $(By.xpath("// a[@ class='list-group-item'and text()='Phones']"));
    public SelenideElement laptopsLink = $(By.xpath("//a [@ class='list-group-item'and text()='Laptops']"));
    public SelenideElement monitorsLink = $(By.xpath("//a[@ class='list-group-item'and text()='Monitors']"));
    public SelenideElement aboutUs = $(By.id("fotcont"));
    public SelenideElement getInTouch = $(By.xpath("//div[@class='col-sm-3 col-lg-3 col-md-3']"));
    public SelenideElement PRODUCTSTORE = $(By.xpath("//a[contains(text(),'PRODUCT STORE')]"));
    public SelenideElement copyrightProductStore = $(By.xpath("//footer[@class='py-5 bg-inverse']"));
    public SelenideElement selectProduct = $(By.xpath("//a[text()='Samsung galaxy s6']"));
    public SelenideElement nameProduct = $(By.xpath("//h2[@class='name']"));
    public SelenideElement priceProduct = $(By.xpath("//h3[@class='price-container']"));
    public ElementsCollection priceProducts = $$(By.xpath("//h5[contains(text(),'$')]"));
    public SelenideElement productDescription =$(By.id("myTabContent"));
    public SelenideElement addToCartButton = $(By.xpath("//a[@href='#'and text()='Add to cart']"));
    public  SelenideElement image=$(By.xpath("//div[@class='product-image']"));
    public SelenideElement welcomeLink = $(By.xpath("//a[@class='nav-link' and contains( text(),'Welcome')]"));
    public SelenideElement nextButton = $(By.xpath("//button[text()='Next']"));
    public SelenideElement previousButton = $(By.id("prev2"));
    public ElementsCollection productsFromSecondPage = $$(By.xpath("//h4[@class='card-title']"));

}
