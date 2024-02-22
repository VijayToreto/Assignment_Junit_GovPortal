package govRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\Spring Tool\\CucumberJunit_Assignment\\src\\test\\resources\\form\\gov_SimpleForm.feature"},
glue = {"step_definition"})

public class GovLogin_Runner {

}
