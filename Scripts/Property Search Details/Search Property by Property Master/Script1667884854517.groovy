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

response = WS.sendRequest(findTestObject('Search property by name'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def name = result.documents[0].name

println(name)

Mobile.startApplication('C:\\Users\\user\\Downloads\\TesterSearchAdvanced.apk', true)

WebUI.callTestCase(findTestCase('Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Get Agent Nearby'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Property'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Rent'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/Property search by area/android.widget.EditText - Search property here'), 
    'kuchai east', 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - kuchai East - Serviced Residence'), 
    0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.view.View'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - 7 Properties in kuchai East'), 
    '7 Properties in kuchai East')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - kuchai East'), 
    'kuchai East')

Mobile.swipe(835, 2023, 39, 2023)

Mobile.swipe(835, 2023, 39, 2023)

Mobile.swipe(835, 2023, 39, 2023)

Mobile.swipe(835, 2023, 39, 2023)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Kuchai East 17 (Rent)'), 
    'Kuchai East 17 (Rent)')

Mobile.swipe(489, 1651, 489, 289)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - kuchai East (1)'), 
    'kuchai East')

Mobile.swipe(51, 1651, 462, 289)

Mobile.swipe(51, 1651, 462, 289)

Mobile.swipe(51, 1651, 462, 289)

Mobile.swipe(51, 1651, 462, 289)

Mobile.swipe(51, 1651, 462, 289)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Kuchai East 17 (Rent) (1)'), 
    'Kuchai East 17 (Rent)')

Mobile.closeApplication()

