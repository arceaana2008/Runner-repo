package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Contact2Page {
    public SelenideElement createAccount = $(By.id("create-account"));
    public SelenideElement firstName = $(By.id("first_name"));
    public SelenideElement lastName = $(By.id("last_name"));
    public SelenideElement emailAddresse = $(By.id("email"));
    public SelenideElement password = $(By.id("password"));
    public SelenideElement createButton = $(By.xpath("//div[@class='h-captcha']"));

}
