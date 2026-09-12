package test.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContactPage {
    public SelenideElement contactEmail = $(By.id("recipient-email"));
    public SelenideElement contactName=$(By.id("recipient-name"));
    public SelenideElement messageField=$(By.id("message-text"));
    public SelenideElement closeButton=$(By.cssSelector("#exampleModal button[class='btn btn-secondary']"));
    public SelenideElement sendMessageButton=$(By.xpath("//div[@id='exampleModal']//button[text()='Send message']"));
}
