package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@Cucumber.Options(
		features = "com.qa.runner",//features means Path or Package name of Feature File
		glue= {"com.qa.runner"}, //glue means path or package name of step defination file
		format = {"pretty", "html:target/cucumber"}, //this option is use to generate report in various format like json, html, xml file.
		monochrome = true, //monochrome display the consol output in proper readable format
        //strict = true, //strict this opition will fail if there are any pending steps. Means if strict is equale to ture then  it will check if any step is not define in step defination file & it will fail the exectuion compulsary if any step is not define in stepdefination file.
		dryRun = true //dryRun is use to check the maping is proper between step Defination file and Feature file
		//tags = {"@SmokeTest"} //Note --> If no tags keyword is use in testrunner class then by default all the scenrio from feature file will get run
		//tags = {"@SmokeTest, @RegressionTest"} //Note --> here when we use , in between two or more annotation then all scenario under this annotations will get executed.
	    //tags = {"@SmokeTest" , "@RegressionTest"} // Note --> here when we right two or more annotation inside "" with , sepration then only those scenario who has all this annotation will get executed.
		//tags = {"~@SmokeTest" , "@RegressionTest"} //Note --> here we have use ~ to ignore particular annotation scenario.
		)


public class pomTestRunner {

}
