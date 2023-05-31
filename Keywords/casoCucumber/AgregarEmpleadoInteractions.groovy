package casoCucumber

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

//esta clase representa las acciones

public class AgregarEmpleadoInteractions {

	def ingresarUsuario(usuario) {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Nombre de usuario'), usuario)
	}

	def ingresarContraseña(clave) {
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password'), clave)
	}

	def presionarBotonIngresarLogin() {
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Ingresar_Login'))
	}


	def ingresarAlModuloInformacionPersonal() {
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Modulo_Informacion_Personal'))
	}

	def presionarBotonAgregarEmpleado() {
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Agregar_Empleado'))
	}

	def ingresarNombre(nombre) {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Full_Name_firstName'), nombre)
	}

	def ingresarApellido(apellido) {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Full_Name_lastName'), apellido)
	}

	def ingresarIDEmpleado(idEmpleado) {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Id del empleado'), idEmpleado)
	}

	def presionarBotonGuardarInformacionEmpleado() {
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Guardar_Informacion_Empleado'))
	}

	def cargaEmpleadoCorrecta() {
		WebUI.delay(5)
		WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/verificar_carga_Empleado'))
	}

}
