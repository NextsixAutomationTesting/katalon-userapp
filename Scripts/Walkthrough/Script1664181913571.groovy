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

Mobile.startApplication('C:\\Users\\user\\Downloads\\nextsix_base(1).apk', true)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Lets Get Started (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Ampang'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.view.ViewGroup (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Youre all set'), 'You\'re all set!')

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - OK (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Home'), 'Home')

Mobile.closeApplication()

Mobile.startExistingApplication('com.nextsix.property')

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (7)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (8)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Contu M Hei'), 'Contu M Hei')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - contumheigmail.com'), 'contumhei@gmail.com')

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (9)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In (4)'), 'Sign In')

Mobile.closeApplication()

