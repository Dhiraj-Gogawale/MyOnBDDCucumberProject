package YouTubeVideo;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(
		features = "YouTubeVideo",//features means Path or Package name of Feature File
		glue= {"YouTubeVideo"}, //glue means path or package name of step defination file
		format = {"pretty", "html:target/cucumber"}, //this option is use to generate report in various format like json, html, xml file.
		monochrome = true, //monochrome display the consol output in proper readable format
        //strict = true, //strict this opition will fail if there are any pending steps. Means if strict is equale to ture then  it will check if any step is not define in step defination file & it will fail the exectuion compulsary if any step is not define in stepdefination file.
		dryRun = false //dryRun is use to check the maping is proper between step Defination file and Feature file
		)



public class TestRunner {

}
