package com.walmart.oms.testing.picocontainer;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"html:target/test-report"}, 
features = { "src/test/resources/PicoContainerTest.feature"}, 
glue = {"com.walmart.oms.testing.picocontainer"},
tags = {})
public class PicoContainerTestNG extends AbstractTestNGCucumberTests{

}