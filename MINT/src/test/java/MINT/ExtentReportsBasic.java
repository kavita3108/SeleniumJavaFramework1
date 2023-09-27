package MINT;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class ExtentReportsBasic {

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
		
		// TODO Auto-generated method stub

	}


