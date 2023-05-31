package casoCucumber
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import navigate.NavigateTo

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


import cucumber.api.java.es.Dado
import cucumber.api.java.es.Entonces
import cucumber.api.java.es.Y
import cucumber.api.java.es.Cuando


class BuscarEmpleadoStepDefs {

	BuscarEmpleadoTask buscar = new BuscarEmpleadoTask()
	AgregarEmpleadoInteractions agregarEmpleado = new AgregarEmpleadoInteractions()
	
	@Cuando("quiero buscar un empleado con sus datos (.*) y (.*)")
	public void ingreso_los_datos_del_nuevo_empleado(nombreApellido,idEmpleado) {
		agregarEmpleado.ingresarAlModuloInformacionPersonal()
		buscar.ingresarDatosABuscar(nombreApellido, idEmpleado)
		buscar.presionarBotonBuscar()
	}

	@Entonces("Se verifica que se encontro el empleado buscado (.*)")
	public void se_verifica_que_se_agrego_el_empleado_de_forma_correcta(idEmpleado) {
		buscar.verificarBusquedaEmpleadoCorrecta(idEmpleado)
	}
}