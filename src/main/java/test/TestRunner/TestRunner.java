package test.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
features = {"src/Automation_Test"},
        glue = {"test"}
       // tags = "@LogIn or @SignUp or @AddToCart or @Card"
)
public class TestRunner extends AbstractTestNGCucumberTests {
@Override
    @DataProvider(parallel = true)
    public Object[][]scenarios(){
    return super.scenarios();

    }
}
