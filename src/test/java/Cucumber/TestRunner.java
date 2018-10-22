package Cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:LoginQAClickAcademy.feature" ,
        glue = "classpath:Cucumber"
)
public class TestRunner extends AbstractTestNGCucumberTests {


}
