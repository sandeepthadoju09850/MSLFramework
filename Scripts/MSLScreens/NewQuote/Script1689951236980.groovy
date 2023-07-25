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

Windows.startApplicationWithTitle('N:\\MSLink\\_Test\\MS-Link.exe', 'MSL')

Windows.click(findWindowsObject('MSLink/AppLaunch/btnOk'))

Windows.switchToWindowTitle('SECURA\'s MILE-STONe Link')

Windows.click(findWindowsObject('MSLink/AppLaunch/btnMaxWindow'))

if ((hash_map.get('NewQuote') != null) && (hash_map.get('NewQuote').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('MSLink/AppLaunch/btnNewQuote'))
}

if ((hash_map.get('StateButton') != null) && (hash_map.get('StateButton').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.click'(findWindowsObject('MSLink/AppLaunch/ChooseState'))
}

if ((hash_map.get('SelectState') != null) && (hash_map.get('SelectState').length() > 0)) {
    CustomKeywords.'customeKeyword.Customkeywords.sendKeys'(findWindowsObject('MSLink/AppLaunch/ChooseState'), hash_map.get(
            'SelectState'))

    Windows.click(findWindowsObject('MSLink/AppLaunch/listState'))

    Windows.click(findWindowsObject('MSLink/AppLaunch/btnOk'))

    Windows.waitForElementPresent(findWindowsObject('MSLink/AppLaunch/PreFillCancel'), 5)

    Windows.click(findWindowsObject('MSLink/AppLaunch/PreFillCancel'))
}


