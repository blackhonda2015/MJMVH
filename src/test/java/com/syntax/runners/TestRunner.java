package com.syntax.runners;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features= {"src/test/resources/features"}
=======
@CucumberOptions(features= {"src/test/resources/features/AddCustomer.feature"}
>>>>>>> Mudassar
				, glue= {""}
				, dryRun=false)

public class TestRunner {

}

