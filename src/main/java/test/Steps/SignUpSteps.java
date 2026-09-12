package test.Steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import test.Pages.SignUpPage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SignUpSteps {
    @And("user fill sign up form")
    public void userFillSignUpForm() throws IOException {
        String fille = "src/main/java/test/TestData/SighUp.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fille));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            SignUpPage signUpPage = new SignUpPage();
            signUpPage.usernamefield.click();
            signUpPage.usernamefield.sendKeys(values[0]);
            Selenide.sleep(2000);
            signUpPage.passwordField.click();
            signUpPage.passwordField.sendKeys(values[1]);
            Selenide.sleep(2000);

        }
    }

    @And("click on the {string} button")
    public void clickOnTheButton(String button) {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage signUpPage = new SignUpPage();
        switch (button) {
            case "Sign up":
                signUpPage.signUpButton.click();
                Selenide.sleep(2000);
                break;
            case "Close":
                signUpPage.closeButton.click();
                Selenide.sleep(2000);
                break;

        }
    }

    @And("user fill username field Sign up form")
    public void userFillUsernameFieldSignUpForm() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        String fille = "src/main/java/test/TestData/SighUp.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fille));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            SignUpPage signUpPage = new SignUpPage();
            signUpPage.usernamefield.click();
            signUpPage.usernamefield.sendKeys(values[0]);
            Selenide.sleep(2000);
        }
    }

    @And("user fill password field Sign up form")
    public void userFillPasswordFieldSignUpForm() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        String fille = "src/main/java/test/TestData/SighUp.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fille));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            SignUpPage signUpPage = new SignUpPage();
            signUpPage.passwordField.click();
            signUpPage.passwordField.sendKeys(values[1]);
            Selenide.sleep(2000);

        }
    }

    {
    }
}