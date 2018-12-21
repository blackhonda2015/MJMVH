package com.syntax.runners;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features"}
				, glue= {""}
				, dryRun=false)

public class TestRunner {

}

