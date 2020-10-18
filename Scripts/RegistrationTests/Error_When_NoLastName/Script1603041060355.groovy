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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://passport.abv.bg/app/profiles/registration')

WebUI.waitForElementVisible(findTestObject('RegistrationPage/cookiesAllowAll'), 5)

WebUI.click(findTestObject('RegistrationPage/cookiesAllowAll'))

WebUI.waitForElementVisible(findTestObject('RegistrationPage/inputUsername'), 5)

WebUI.setText(findTestObject('RegistrationPage/inputUsername'), 'abc_123456')

WebUI.setText(findTestObject('RegistrationPage/inputPassword'), 'Abcd1234')

WebUI.setText(findTestObject('RegistrationPage/inputPasswordRepeat'), 'Abcd1234')

WebUI.setText(findTestObject('RegistrationPage/inputPhoneNumber'), '881234123')

WebUI.setText(findTestObject('RegistrationPage/inputFirstName'), 'abc')

WebUI.clearText(findTestObject('RegistrationPage/inputLastName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('RegistrationPage/submitButton'), 1)

WebUI.click(findTestObject('RegistrationPage/submitButton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('RegistrationPage/errorMessage'), 5)

WebUI.scrollToElement(findTestObject('RegistrationPage/errorMessage'), 0)

WebUI.verifyElementText(findTestObject('RegistrationPage/errorMessage'), 'Моля попълнете полето Фамилия.')

WebUI.closeBrowser()

