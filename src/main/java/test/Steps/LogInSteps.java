package test.Steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import test.Pages.HomePage;
import test.Pages.LoginPage;
import test.Pages.SignUpPage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LogInSteps {
    public LogInSteps() throws FileNotFoundException {
    }

    @When("user fill log in form")
    public void userFillLogInForm() throws IOException {

        String fille1 = "src/main/java/test/TestData/LogIn.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fille1));
        String line;

        while ((line = reader.readLine()) != null) {
            {
                String[] values = line.split(",");
                LoginPage loginPage = new LoginPage();
                loginPage.userNameField.click();
                loginPage.userNameField.sendKeys(values[0]);
                Selenide.sleep(2000);
                loginPage.passwordField.click();
                loginPage.passwordField.sendKeys(values[1]);
                Selenide.sleep(2000);
            }
        }

    }

    @And("click on the button {string}")
    public void clickOnTheButton(String button) {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage();
        switch (button) {
            case "Log in":
                loginPage.loginButton.click();
                Selenide.sleep(2000);
                break;
            case "Close":
                loginPage.closeButton.click();
                Selenide.sleep(2000);
                break;

        }
    }

    @And("user fill username field log in form")
    public void userFillUsernameFieldLogInForm() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        String fille2 = "src/main/java/test/TestData/LogIn.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fille2));
        String line;

        while ((line = reader.readLine()) != null) {
            {
                String[] values = line.split(",");
                LoginPage loginPage = new LoginPage();
                loginPage.userNameField.click();
                loginPage.userNameField.sendKeys(values[0]);
                Selenide.sleep(2000);

            }
        }
    }


    @And("user the wrong password")
    public void userClicksTheWrongPassword() {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage();
        loginPage.passwordField.click();
        loginPage.passwordField.sendKeys("0");
        Selenide.sleep(2000);
    }

    @And("user the wrong username")
    public void userTheWrongUsername() {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage();
        loginPage.userNameField.click();
        loginPage.userNameField.sendKeys("1");
        Selenide.sleep(2000);
    }

    @And("user fill password field log in form")
    public void userFillPasswordFieldLogInForm() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        String fille2 = "src/main/java/test/TestData/LogIn.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fille2));
        String line;

        while ((line = reader.readLine()) != null) {
            {
                String[] values = line.split(",");
                LoginPage loginPage = new LoginPage();
                loginPage.passwordField.click();
                loginPage.passwordField.sendKeys(values[1]);
                Selenide.sleep(2000);
            }
        }
    }




    @Then("appear Welcome")
    public void appearWelcome() {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Selenide.sleep(2000);
        Assert.assertTrue(homePage.welcomeLink.isDisplayed());
        Selenide.sleep(2000);
    }

    @And("user fill random username for login")
    public void userFillRandomUsernameForLogin() throws IOException {
        // Write code here that turns the phrase above into concrete actions
LoginPage loginPage = new LoginPage();
FileReader fileReader = new FileReader("src/Automation_Test/java/GenrateData/data.txt");
BufferedReader bufferedReader = new BufferedReader(fileReader);
String username = bufferedReader.readLine();
        System.out.println("Numele" + username);
        loginPage.userNameField.click();
        loginPage.userNameField.sendKeys(username);
        Selenide.sleep(2000);
    }

    @And("user fill random password for login")
    public void userFillRandomPasswordForLogin() throws IOException {
        // Write code here that turns the phrase above into concrete actions
       LoginPage loginPage = new LoginPage();
       FileReader fileReader = new FileReader("src/Automation_Test/java/GenrateData/data.txt");
       BufferedReader bufferedReader = new BufferedReader(fileReader);
       String password = new BufferedReader(new FileReader("src/Automation_Test/java/GenrateData/data.txt")).lines().skip(1).findFirst().orElse("");
        System.out.println("Parola" + password);
        loginPage.passwordField.click();
        loginPage.passwordField.sendKeys(password);
        Selenide.sleep(2000);
    }
}







