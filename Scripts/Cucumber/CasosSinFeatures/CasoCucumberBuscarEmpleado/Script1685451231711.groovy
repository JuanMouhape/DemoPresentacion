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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_Search_Empleado/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Search_Empleado/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_Search_Empleado/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Search_Empleado/Page_OrangeHRM/a_PIM'))

WebUI.setText(findTestObject('Object Repository/Page_Search_Empleado/Page_OrangeHRM/input'), 'Juan Cruz Mouhape')

WebUI.setText(findTestObject('Object Repository/Page_Search_Empleado/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    '03100258')

WebUI.click(findTestObject('Object Repository/Page_Search_Empleado/Page_OrangeHRM/button_Search'))

WebUI.scrollToElement(findTestObject('Page_Search_Empleado/Page_OrangeHRM/usuarioEncontrado'), 10)

salida = WebUI.getText(findTestObject('Page_Search_Empleado/Page_OrangeHRM/usuarioEncontrado'))

WebUI.verifyMatch(salida, '03100258', false)

WebUI.closeBrowser()

