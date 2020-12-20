package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class MasterHook extends DriverFactory {
@Before
public void setup()
{
	driver=getDriver();
}
@After()
public void tearDown()
{
	driver.close();
	driver.quit();
}
}
