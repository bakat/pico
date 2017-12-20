package com.walmart.oms.testing.picocontainer;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/test-report"}, 
features = { "src/test/resources/PicoContainerTest.feature"}, 
glue = {"com.walmart.oms.testing.picocontainer"},
tags = {})
public class PicoContainerTest {

}
