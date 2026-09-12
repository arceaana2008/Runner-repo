package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement userNameField = $(By.id("loginusername"));
    public SelenideElement passwordField = $(By.id("loginpassword"));
    public SelenideElement closeButton = $(By.xpath("//div[@id='logInModal']/button[text()='Close']"));
    public SelenideElement loginButton=$(By.xpath("//div[@id='logInModal']//button[text()='Log in']"));
}
