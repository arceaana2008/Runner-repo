package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Home2Page {
public SelenideElement logo = $(By.xpath("//div[@ class='table logo-tagline']"));
public SelenideElement searchButton = $(By.xpath("//input[@id ='search-submit']"));
public SelenideElement logLink = $(By.id("customer"));
public SelenideElement signUp = $(By.xpath("//a[@id='customer_register_link' and text()='Sign up']"));
public SelenideElement myCart = $(By.xpath("//a[@class='checkout']"));
public SelenideElement homeLink = $(By.id("toggle-menu"));
public SelenideElement catalogLink = $(By.xpath("//a[@ class='mobile']"));
public SelenideElement blogLink = $(By.id("toggle-menu"));
public SelenideElement aboutUsLink = $(By.xpath("//a[@class='mobile']"));
public SelenideElement wishListLink = $(By.id("social"));
public SelenideElement referAFriendLink = $(By.xpath("//a[@href='#sauce-show-refer-friend'and text()='Refer a friend']"));
public SelenideElement createAccountLink = $(By.xpath("//a[@ id='customer_register_link' and text()='Create account']"));
public SelenideElement product = $(By.id("tbodyid"));

public SelenideElement priceProduct = $(By.xpath("//h3[@class='price-container']"));
public SelenideElement productDescription = $(By.id("myTabContent"));
public  SelenideElement image=$(By.xpath("//div[@class='product-image']"));



}
