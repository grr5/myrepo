package com.OHRM;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Shohil on 24/08/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features",
                 format   = "html:target/CucumberReports1",
                 tags     = "@login" )

public class RunTest {

}
