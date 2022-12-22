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

Mobile.startApplication('C:\\Users\\user\\Downloads\\newAPK (1).apk', true)

WebUI.callTestCase(findTestCase('Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Get Agent'), 'Get Agent')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Property'), 'Property')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - My Likes'), 'My Likes')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Zero Deposit'), 'Zero Deposit')

'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(799, 828, 300, 828)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Home Pro'), 'Home Pro')

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Device Width and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX,endX values by dividing device height by 2 Because Y coordinates are constant'
int startY = 828

'Here endY and startY values are equal for vertical Swiping for that assigning startY value to endY'
int endY = startY

'Storing the startX value'
int startX = device_Width * 0.74

'Storing the endX value'
int endX = device_Width * 0.30

WebUI.delay(6)

'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Home Mall (1)'), 'Home Mall')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Calculator (1)'), 'Calculator')

/*'Storing the startX,endX values by dividing device height by 2 Because Y coordinates are constant'
int startY = 828

'Here endY and startY values are equal for vertical Swiping for that assigning startY value to endY'
int endY = startY

'Storing the startX value'
int startX = device_Width * 0.30

'Storing the endX value'
int endX = device_Width * 0.74*/
'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(300, 828, 799, 828)

Mobile.tap(findTestObject('mobile/Shortcut/android.widget.TextView - Get Agent (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Kuchai Lama (1)'), 
    'Kuchai Lama')

Mobile.getText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - 15 Agents Nearby (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Property (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - 50 Properties Nearby (1)'), 
    '50+ Properties Nearby')

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - My Likes (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Email'), 'peter@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Password'), '2', 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - The email or password you entered is incorrect'), 
    'The email or password you entered is incorrect.')

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Try Again'), 0)

Mobile.clearText(findTestObject('Object Repository/mobile/android.widget.EditText -'), 0)

Mobile.setText(findTestObject('mobile/android.widget.EditText - Password'), '1', 0)

Mobile.tap(findTestObject('mobile/android.widget.TextView - Sign In (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - My Likes (2)'), 'My Likes')

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Zero Deposit (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - BlueDuck Registration'), 
    'BlueDuck Registration')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.EditText - 883999-39-9393'), '883999-39-9393')

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Home Pro (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - HomePro'), 'HomePro')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Banker'), 'Banker')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Lawyer'), 'Lawyer')

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - (4)'), 0)

WebUI.delay(6)

'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(startX, startY, endX, endY)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Calculator (1)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('mobile/Shortcut/android.widget.TextView - Mortgage Loan Calculator (1)'), 'Mortgage Loan Calculator')

Mobile.tap(findTestObject('mobile/Shortcut/back button mortagage'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Calculator (1)'), 'Calculator')

