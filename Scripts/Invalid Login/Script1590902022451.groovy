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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Invalid Login Elements/i_Contact_far fa-user'))

WebUI.click(findTestObject('Object Repository/Invalid Login Elements/button_Log in'))

WebUI.click(findTestObject('Object Repository/Invalid Login Elements/strong_Error'))

WebUI.verifyTextPresent('Error: Username is required', false)

WebUI.setText(findTestObject('Object Repository/Invalid Login Elements/input__username'), 'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Invalid Login Elements/input__password'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/Invalid Login Elements/span__show-password-input'))

WebUI.scrollToElement(findTestObject('Invalid Login Elements/span_Remember me'), 10)

WebUI.click(findTestObject('Object Repository/Invalid Login Elements/span_Remember me'))

WebUI.click(findTestObject('Object Repository/Invalid Login Elements/button_Log in'))

WebUI.verifyTextPresent('Unknown username. Check again or try your email address.', false)

