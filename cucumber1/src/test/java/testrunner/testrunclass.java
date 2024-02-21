package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\feature\\cucumber.feature",glue={"stepdefinition"},monochrome= true,
//plugin= {"pretty","junit:target/jUnit1reports/report.xml"}	
//plugin= {"pretty","html:target/htmlreports/reportshtml.xml"}
plugin= {"pretty","json:target/jsonreports/reportsjson.xml"}
		)

public class testrunclass {


}
