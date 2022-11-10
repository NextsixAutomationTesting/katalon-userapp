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
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.iproperty.com.my/sale/kuchai-lama/all-residential/')

String propertyname1 = WebUI.getText(findTestObject('Object Repository/crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/h2_Kuchai Avenue, Kuchai Entrepreneurs Park_a27fb6'))

GlobalVariable.propertyname = propertyname1

//String div = WebUI.getText(findTestObject('Object Repository/crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/div_Kuchai Lama, Kuala Lumpur (1)'))
//println(div)
//WebUI.scrollToElement(findTestObject('Object Repository/crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/h2_Arte Condominium, Kuchai Lama'), 
//   0)
String propertyname2 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/1'))

String propertyname3 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/2'))

String propertyname4 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/3'))

String propertyname5 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/4'))

String propertyname6 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/5'))

String propertyname7 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/6'))

String propertyname8 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/7'))

String propertyname9 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/8'))

String propertyname10 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/9'))

String propertyname11 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/10'))

String propertyname12 = WebUI.getText(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/11'))

println(propertyname2)

println(propertyname3)

println(propertyname4)

println(propertyname5)

println(propertyname6)

println(propertyname7)

println(propertyname8)

println(propertyname9)

println(propertyname10)

println(propertyname11)

//println(GlobalVariable.propertyname)
CustomKeywords.'myPack.WriteExcel.demoKey'(propertyname1)

CustomKeywords.'myPack.WriteExcel.demoKey'(propertyname2)

CustomKeywords.'myPack.WriteExcel.demoKey'(propertyname3)

CustomKeywords.'myPack.WriteExcel.demoKey'(propertyname4)

CustomKeywords.'myPack.WriteExcel.demoKey'(propertyname5)

CustomKeywords.'myPack.WriteExcel.demoKey'(propertyname6)

CustomKeywords.'myPack.WriteExcel.demoKey'(propertyname7)

CustomKeywords.'myPack.WriteExcel.demoKey'(propertyname8)

CustomKeywords.'myPack.WriteExcel.demoKey'(propertyname9)

CustomKeywords.'myPack.WriteExcel.demoKey'(propertyname10)

WebUI.click(findTestObject('crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/1'))

//String price = WebUI.getText(findTestObject('Object Repository/crawl/Page_Kuchai Lama, Kuala Lumpur residential _8ba40c/li_RM 1,398,000'))
//println price
String address = WebUI.getText(findTestObject('Object Repository/crawl/Page_GenKL Condominium 41 bedrooms for sale_2e3f79/span_Jalan Kuchai Lama, Taman Lien Hoe, Kuc_0e7f6c'))

println(address)

String built = WebUI.getText(findTestObject('Object Repository/crawl/Page_GenKL Condominium 41 bedrooms for sale_2e3f79/li_Built-up  1,894 sq. ft'))

println(built)

WebUI.click(findTestObject('Object Repository/crawl/Page_GenKL Condominium 41 bedrooms for sale_2e3f79/a_Show more'))

String des = WebUI.getText(findTestObject('crawl/Page_Arte Condominium Condominium 31 bedrooms for sale in Kuchai Lama, Kuala Lumpur  iProperty.com.my/description'))

println(des)
CustomKeywords.'myPack.WriteExcel.demoKey'(des)

WebUI.click(findTestObject('Object Repository/crawl/Page_GenKL Condominium 41 bedrooms for sale_2e3f79/a_Show more'))

