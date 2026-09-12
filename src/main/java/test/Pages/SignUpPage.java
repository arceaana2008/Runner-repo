package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {
   public SelenideElement usernamefield = $(By.id("sign-username"));
   public SelenideElement passwordField = $(By.id("sign-password"));
   public SelenideElement closeButton = $(By.xpath("(//div[@class='modal-footer']//button[text()='Close'])[2]"));
   public SelenideElement signUpButton = $(By.xpath("//button[text()='Sign up']"));
}
