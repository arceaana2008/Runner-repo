package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Login2Page {
    public SelenideElement emailAddress = $(By.id("updates_611931337"));
    public SelenideElement password = $(By.id("customer_password"));
    public SelenideElement signIn = $(By.xpath("//input[@value='Sign In']"));

}
