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

WebUI.navigateToUrl('https://mail.abv.bg/')

WebUI.waitForElementVisible(findTestObject('EmailPage/CookiesAllowAll'), 5)

WebUI.click(findTestObject('EmailPage/CookiesAllowAll'))

WebUI.setText(findTestObject('EmailPage/inputUsername'), 'testmail_777@abv.bg')

WebUI.setText(findTestObject('EmailPage/inputPassword'), '123_Test_321')

WebUI.click(findTestObject('EmailPage/loginButton'))

WebUI.clickOffset(findTestObject('EmailPage/writeAnEmailButton'), 25, 10)

WebUI.waitForElementVisible(findTestObject('EmailPage/sendEmailTo'), 0)

WebUI.setText(findTestObject('EmailPage/sendEmailTo'), 'testmail_777@abv.bg')

WebUI.setText(findTestObject('EmailPage/sendEmailSubject'), 'Тест')

WebUI.setText(findTestObject('null'), 'Това е тест')

WebUI.click(findTestObject('EmailPage/sendEmailButton'))

WebUI.waitForElementVisible(findTestObject('EmailPage/emailSentSuccessfullyMessage'), 5)

WebUI.click(findTestObject('EmailPage/inboxButton'))

WebUI.waitForElementVisible(findTestObject('EmailPage/firstUnreadMail'), 5)

WebUI.click(findTestObject('EmailPage/firstUnreadMail'))

WebUI.waitForElementVisible(findTestObject('EmailPage/receiveEmailSubject'), 5)

WebUI.verifyElementText(findTestObject('EmailPage/receiveEmailSubject'), 'Тест')

WebUI.verifyElementText(findTestObject('EmailPage/receiveEmailFrom'), '(testmail_777@abv.bg)')

WebUI.verifyElementText(findTestObject('null'), 'Това е тест')

WebUI.closeBrowser()

