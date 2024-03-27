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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://rahulshettyacademy.com/client/')

WebUI.setText(findTestObject('Object Repository/Page_Lets Shop/input_Email_userEmail'), 'anshika@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lets Shop/input_Password_userPassword'), 'VhOGoIbq1ebZ2Sfaadxugg==')

WebUI.click(findTestObject('Object Repository/Page_Lets Shop/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_Lets Shop/b_ZARA COAT 3'))

WebUI.click(findTestObject('Object Repository/Page_Lets Shop/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_Lets Shop/button_Cart 1'))

WebUI.click(findTestObject('Object Repository/Page_Lets Shop/h3_ZARA COAT 3'))

WebUI.click(findTestObject('Object Repository/Page_Lets Shop/button_Sign Out'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Lets Shop/h1_Log in'), 'Log in')

WebUI.closeBrowser()

WebUI.acceptAlert()



