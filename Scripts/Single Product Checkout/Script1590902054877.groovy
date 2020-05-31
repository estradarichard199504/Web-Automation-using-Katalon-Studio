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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/ecommerce/')

WebUI.click(findTestObject('Object Repository/Single Product Checkout/a_Products'))

WebUI.click(findTestObject('Object Repository/Single Product Checkout/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Single Product Checkout/a_View cart'))

WebUI.click(findTestObject('Object Repository/Single Product Checkout/tr_ADILETTE COMFORT SLIDES100000ADILETTE CO_f6f973'))

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input_ADILETTE COMFORT SLIDES quantity_cart_32f9bc'), 
    '5')

WebUI.click(findTestObject('Object Repository/Single Product Checkout/button_Update cart'))

WebUI.click(findTestObject('Object Repository/Single Product Checkout/div_Cart updated'))

WebUI.click(findTestObject('Object Repository/Single Product Checkout/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__billing_first_name'), 'Robert')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__billing_last_name'), 'Hall')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input_(optional)_billing_company'), 'Company Inc.')

WebUI.click(findTestObject('Object Repository/Single Product Checkout/span_Philippines'))

WebUI.setText(findTestObject('Page_Checkout  ecommerce/input_Terms and Conditions_select2-search__field'), 'Australia')

WebUI.click(findTestObject('Object Repository/Single Product Checkout/span_Australia'))

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__billing_address_1'), '3124 Hickory Hieght')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__billing_city'), 'Bali')

WebUI.click(findTestObject('Object Repository/Single Product Checkout/span_Select an option'))

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input_Terms and Conditions_select2-search__field'), 
    'Queensland')

WebUI.click(findTestObject('Object Repository/Single Product Checkout/span_Queensland'))

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__billing_postcode'), '21202')

WebUI.switchToWindowTitle('Checkout – ecommerce')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__billing_postcode'), '21202')

WebUI.switchToWindowTitle('Checkout – ecommerce')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__billing_phone'), '997-564-4556')

WebUI.switchToWindowTitle('Checkout – ecommerce')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__billing_phone'), '997-564-4556')

WebUI.switchToWindowTitle('Checkout – ecommerce')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__billing_phone'), '997-564-4556')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__billing_email'), 'robert213@hotmail.com')

WebUI.click(findTestObject('Object Repository/Single Product Checkout/span_Ship to a different address'))

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__shipping_first_name'), 'Robert')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__shipping_last_name'), 'Hall')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input_(optional)_shipping_company'), 'Company Inc.')

WebUI.click(findTestObject('Object Repository/Single Product Checkout/span_Philippines_1'))

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input_Terms and Conditions_select2-search__field'), 
    'Philippines')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__shipping_address_1'), '1232 Pablo Street')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__shipping_city'), 'Cagayan de Oro City')

WebUI.click(findTestObject('Object Repository/Single Product Checkout/span_Misamis Oriental'))

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input_Terms and Conditions_select2-search__field'), 
    'Misamis Oriental')

WebUI.sendKeys(findTestObject('Object Repository/Single Product Checkout/input_Terms and Conditions_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/input__shipping_postcode'), '77445')

WebUI.setText(findTestObject('Object Repository/Single Product Checkout/textarea_(optional)_order_comments'), 'This is a test order')

WebUI.click(findTestObject('Object Repository/Single Product Checkout/label_Cash on delivery'))

WebUI.click(findTestObject('Object Repository/Single Product Checkout/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Single Product Checkout/button_Place order'))

WebUI.click(findTestObject('Object Repository/Single Product Checkout/h1_Order received'))

WebUI.click(findTestObject('Object Repository/Single Product Checkout/li_Order number138'))

WebUI.verifyTextPresent('', false)

WebUI.click(findTestObject('Object Repository/Single Product Checkout/h2_Order details'))

WebUI.click(findTestObject('Object Repository/Single Product Checkout/p_Thank you Your order has been received'))

