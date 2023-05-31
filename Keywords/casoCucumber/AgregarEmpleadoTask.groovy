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
import casoCucumber.AgregarEmpleadoInteractions

public class AgregarEmpleadoTask {

	AgregarEmpleadoInteractions agregarEmpleado = new AgregarEmpleadoInteractions()

	def hacerLogin(usuario,clave) {
		agregarEmpleado.ingresarUsuario(usuario)
		agregarEmpleado.ingresarContraseña(clave)
		agregarEmpleado.presionarBotonIngresarLogin()
	}

	def ingresarAAgregarUnNuevoEmpleado() {
		agregarEmpleado.ingresarAlModuloInformacionPersonal()
		agregarEmpleado.presionarBotonAgregarEmpleado()
	}

	def cargarDatosDelNuevoEmpleado(nombre,apellido,idEmpleado) {
		agregarEmpleado.ingresarNombre(nombre)
		agregarEmpleado.ingresarApellido(apellido)
		agregarEmpleado.ingresarIDEmpleado(idEmpleado)
	}

	def guardarDatosDelNuevoEmpleado() {
		agregarEmpleado.presionarBotonGuardarInformacionEmpleado()
	}

	def verificarCargaDelNuevoEmpleado() {
		agregarEmpleado.cargaEmpleadoCorrecta()
	}
}
