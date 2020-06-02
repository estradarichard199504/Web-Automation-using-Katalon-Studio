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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Valid and Invalid Login Objects/span_My account'))

WebUI.click(findTestObject('Valid and Invalid Login Objects/button_Log in'))

WebUI.verifyTextPresent('Error: Username is required.', false)

WebUI.setText(findTestObject('Valid and Invalid Login Objects/input__username'), 'jonh')

WebUI.setEncryptedText(findTestObject('Valid and Invalid Login Objects/input__password'), '92k8Vv0gU28=')

WebUI.click(findTestObject('Valid and Invalid Login Objects/span__show-password-input'))

WebUI.click(findTestObject('Valid and Invalid Login Objects/button_Log in'))

WebUI.verifyTextPresent('Unknown username. Check again or try your email address.', false)

WebUI.setText(findTestObject('Valid and Invalid Login Objects/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('Valid and Invalid Login Objects/input__password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Valid and Invalid Login Objects/button_Log in'))

WebUI.click(findTestObject('Valid and Invalid Login Objects/a_Log out'))

WebUI.click(findTestObject('Valid and Invalid Login Objects/span_Home'))

WebUI.closeBrowser()

