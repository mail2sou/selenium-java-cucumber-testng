package MyRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/main/java/Features",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/index.html","json:target/cucumber-reports/CucumberTestReport.json"},
        tags = {"~@Ignore"},
        monochrome = true

)

public class TestRunner {
    TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setup(){
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider="features")
    public void feature(CucumberFeatureWrapper cucumberFeatureWrapper) {
        testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void teardown(){
        testNGCucumberRunner.finish();
    }
}
