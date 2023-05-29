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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Elements'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/li_Text Box'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Full Name_userName'), 'Juan Cruz Mouhape')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'pruebademo@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), 'Pasaje San Luis 252')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Permanent Address_permanentAddress'), 'Pasaje San Luis 252')

WebUI.scrollToElement(findTestObject('Page_DEMOQA/button_Submit'), 4)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

retornoFullName = WebUI.getText(findTestObject('Object Repository/Page_DEMOQA/p_NameJuan Cruz Mouhape'))

String[] fullNameLoad = retornoFullName.split(':')

WebUI.verifyMatch(fullName, fullNameLoad[1], false)

retornoEmail = WebUI.getText(findTestObject('Object Repository/Page_DEMOQA/p_Emailpruebademogmail.com'))

String[] emailLoad = retornoEmail.split(':')

WebUI.verifyMatch(email, emailLoad[1], false)

retornoAddress = WebUI.getText(findTestObject('Object Repository/Page_DEMOQA/p_Current Address Pasaje San Luis 252'))

String[] addressLoad = retornoAddress.split(':')

WebUI.verifyMatch(currentAddress, addressLoad[1], false)

retornoAddressPermanent = WebUI.getText(findTestObject('Object Repository/Page_DEMOQA/p_Permananet Address Pasaje San Luis 252'))

String[] addressPermanentLoad = retornoAddressPermanent.split(':')

WebUI.verifyMatch(permanentAddress, addressPermanentLoad[1], false)

WebUI.closeBrowser()

