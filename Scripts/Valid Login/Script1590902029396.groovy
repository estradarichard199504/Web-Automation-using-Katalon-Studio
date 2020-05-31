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

WebUI.click(findTestObject('Valid Login Elements/my_account_link'))

WebUI.click(findTestObject('Valid Login Elements/button_Log in'))

WebUI.setText(findTestObject('Valid Login Elements/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('Valid Login Elements/input__password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Valid Login Elements/span__show-password-input'))

WebUI.scrollToElement(findTestObject('Valid Login Elements/input__rememberme'), 5)

WebUI.click(findTestObject('Valid Login Elements/input__rememberme'))

WebUI.click(findTestObject('Valid Login Elements/button_Log in'))

WebUI.click(findTestObject('Valid Login Elements/a_Log out'))

