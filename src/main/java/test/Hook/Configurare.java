package test.Hook;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.Before;

import java.util.ResourceBundle;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Configurare {
    @Before
    public void openSide(){
        ResourceBundle config=ResourceBundle.getBundle("config");
        Configuration.baseUrl=config.getString("url");
        Configuration.browser=config.getString("browser");
        Selenide.open("/");
        getWebDriver().manage().window().maximize();
    }
}
