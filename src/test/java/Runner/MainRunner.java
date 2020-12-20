package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith (Cucumber.class)

@CucumberOptions (
		features={"src/test/java/EcommerceFramework/FeaturesFile"},
		glue= {"EcommerceFramework.Steps"},
		monochrome=true,
		tags= {},
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		)
public class MainRunner {
	 @AfterClass
	    public static void writeExtentReport() {
	        Reporter.loadXMLConfig(new File("config/report.xml"));
	 }
	    
	    	
}

