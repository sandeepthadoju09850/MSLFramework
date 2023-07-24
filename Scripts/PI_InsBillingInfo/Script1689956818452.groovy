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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def strIndex = "$index"

def hash_map = pageData.get(((GlobalVariable.TestData['Test Case']) + '-') + strIndex)

if ((hash_map.get('IB_Agency') != null) && (hash_map.get('IB_Agency').length() > 0)) {	
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_AgencyName'))
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_AgencyName'), hash_map.get('IB_Agency'))
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Sel_PI_AgencyName'))
	
	}
		
if ((hash_map.get('IB_PolicyType') != null) && (hash_map.get('IB_PolicyType').length() > 0)) {		
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_PolicyType'))	
	CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_PolicyType'), hash_map.get('IB_PolicyType'))	
	CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Sel_PI_PolicyType'))
		
		}
		
if ((hash_map.get('IB_PayPlan') != null) && (hash_map.get('IB_PayPlan').length() > 0)) {
			CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_PolicyPlan'))
			CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Btn_PI_PolicyPlan'), hash_map.get('IB_PayPlan'))
			CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('Object Repository/MSLink/PI_InsBillingInfo/Sel_PI_PolicyPlan'))
				
				}
