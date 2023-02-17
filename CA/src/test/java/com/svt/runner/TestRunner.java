package com.svt.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "",
        features = "src/test/resources/features\\TestStore.feature",
        glue = "com.svt.definitions",
        stepNotifications=true,
        plugin = {}
)
public class TestRunner {
}


