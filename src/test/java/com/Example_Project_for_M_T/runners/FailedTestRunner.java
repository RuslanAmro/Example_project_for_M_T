package com.Example_Project_for_M_T.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/Example_Project_for_M_T/step_definitions"
)
public class FailedTestRunner {
}


