import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.Given
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import internal.GlobalVariable
import customeKeyword.Customkeywords
import dataenum.DataFiles
import pagesgroovy.GetGroupAndTC

class LaunchApplication {
	
	
	
		private String dataSheetPath = GlobalVariable.TestData['Group'] + "/" + DataFiles.LAUNCHAPP.getSheetName();
	
		private HashMap pageData;
	
		public LaunchApplication() {
			GlobalVariable.TestData['Group'] = "MSL"
			GlobalVariable.TestData['Test Case'] = "TC01"
	
			pageData = new Customkeywords().retrieveTestCaseData(dataSheetPath, GlobalVariable.TestData['Test Case']);
			
			}
			def launchApplication(String index) {
			WebUI.callTestCase(findTestCase('Test Cases/MSLScreens/NewQuote'), ['pageData' :pageData, 'index' :1])
			}
	
	}
	