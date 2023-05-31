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

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Nombre de usuario'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Ingresar_Login'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Modulo_Informacion_Personal'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Agregar_Empleado'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Full_Name_firstName'), 'Juan Cruz')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Full_Name_lastName'), 'Mouhape')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Id del empleado'), '0258')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Guardar_Informacion_Empleado'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/verificar_carga_Empleado'))

WebUI.closeBrowser()

