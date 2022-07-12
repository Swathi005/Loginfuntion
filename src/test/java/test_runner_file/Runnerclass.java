package test_runner_file;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature_File/Login.feature",glue = "step_def",stepNotifications = true, monochrome = true)
public class Runnerclass {

}
