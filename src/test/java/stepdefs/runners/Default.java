package stepdefs.runners;

import io.cucumber.java.Before;
import io.cucumber.java.After;

import io.cucumber.testng.CucumberOptions;
import utils.SeleniumDriver;


//@CucumberOptions(glue = {"stepdefs"}, plugin = {"html:target/cucumber-reports/cucumber-pretty","json:target/json-cucumber-reports/default/cukejson.json",
//        "testng:target/testng-cucumber-reports/cuketestng.xml" }, features = {"src/test/resources/features"})


@CucumberOptions(

        features = {"src/test/resources/features/"},
        glue = "stepdefs",
        tags = "@Smoke",
        plugin = {"html:target/cucumber-reports/cucumber-pretty","json:target/json-cucumber-reports/default/cukejson.json","testng:target/testng-cucumber-reports/cuketestng.xml" }

)



public class Default extends AbstractTestNGCucumberParallelTests {

    private static long duration;

//@BeforeClass
 @Before
    public static void before() {
        duration = System.currentTimeMillis();
        System.out.println("Thread Id  | Scenario Num       | Step Count");
        SeleniumDriver.setUpDriver();
    }

@After
   // @AfterClass
    public static void after() {
        duration = System.currentTimeMillis() - duration;
        SeleniumDriver.tearDown();
        System.out.println("DURATION - " + duration);
    }
}

