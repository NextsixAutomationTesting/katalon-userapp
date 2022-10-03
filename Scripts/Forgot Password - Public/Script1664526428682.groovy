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

Mobile.startApplication('C:\\Users\\user\\Downloads\\nextsix_base(1).apk', true, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Lets Get Started'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Skip'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Profile 2'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/forgot password/android.widget.TextView - forgot password'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Forgot'), 'Forgot')

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Password'), 'Password')

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Dont worry we got you covered, just enter your registered email'), 
    'Don\'t worry we got you covered, just enter your registered email.')

Mobile.setText(findTestObject('Object Repository/forgot password/android.widget.EditText - Email'), 'fnextsix@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/forgot password/android.widget.TextView - Send'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Reset'), 'Reset')

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Password (1)'), 'Password')

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - An email with instructions to reset your password has been sent to your email account'), 
    'An email with instructions to reset your password has been sent to your email account.')

Mobile.tap(findTestObject('Object Repository/forgot password/android.widget.TextView - Ok'), 0)

email = CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent'('fnextsix@gmail.com', 'nextsix123', 
    '')

println(email)

Mobile.closeApplication()

