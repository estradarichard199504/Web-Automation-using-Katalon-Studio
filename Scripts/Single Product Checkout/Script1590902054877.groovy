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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/ecommerce/')

WebUI.click(findTestObject('Object Repository/Checkout Objects/span_Go shopping'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/button_1Shop sidebar'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/a_View cart'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/td_Nike Epic React Flyknit quantity'))

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input_Nike Epic React Flyknit quantity_cart_9a55fd'), '4')

WebUI.click(findTestObject('Object Repository/Checkout Objects/div_Cart'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/button_Update cart'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/a_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/a_Click here to login'))

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Checkout Objects/input__password'), 'IFWTPptq1GY=')

WebUI.click(findTestObject('Object Repository/Checkout Objects/button_Login'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/a_Click here to login'))

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Checkout Objects/input__password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Checkout Objects/button_Login'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/input__billing_first_name'))

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input__billing_first_name'), 'Marie')

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input__billing_last_name'), 'Doe')

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input_(optional)_billing_company'), 'Company Inc.')

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input__billing_address_1'), '12332 Sto. Domingo Street')

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input__billing_city'), 'Texas')

WebUI.click(findTestObject('Object Repository/Checkout Objects/span_Misamis Oriental'))

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input_Checkout_select2-search__field'), 'Mountain Province')

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input__billing_postcode'), '9000')

WebUI.setText(findTestObject('Object Repository/Checkout Objects/input__billing_phone'), '+6395452145475')

WebUI.click(findTestObject('Object Repository/Checkout Objects/li_Cash on delivery Pay with cash upon delivery'))

WebUI.setText(findTestObject('Object Repository/Checkout Objects/textarea_(optional)_order_comments'), 'Test12')

WebUI.click(findTestObject('Object Repository/Checkout Objects/button_Place order'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/h1_Order received'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/p_Thank you Your order has been received'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/h2_Order details'))

WebUI.click(findTestObject('Object Repository/Checkout Objects/h2_Billing address'))

