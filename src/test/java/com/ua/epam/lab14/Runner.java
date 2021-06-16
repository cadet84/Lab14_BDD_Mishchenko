package com.ua.epam.lab14;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/ua/epam/lab14/features",glue = {"com/ua/epam/lab14/steps/StepDefinition.java"}, publish = true)

public class Runner {
}
