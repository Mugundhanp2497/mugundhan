import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(findTestData('IM01data').getValue(1, 1))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('IMobj/email'), findTestData('IM01data').getValue(2, 1))

WebUI.click(findTestObject('IMobj/next'))

WebUI.setText(findTestObject('IMobj/password'), findTestData('IM01data').getValue(3, 1))

WebUI.click(findTestObject('IMobj/sign in'))

WebUI.click(findTestObject('IMobj/test automation'))

WebUI.click(findTestObject('Event/events'))

WebUI.click(findTestObject('Event/add new'))

WebUI.setText(findTestObject('Event/event title'), 'New Event M01')

WebUI.click(findTestObject('event try/Page_Innovation Minds/span_Event Start Date and Time_input-group-addon'))

WebUI.click(findTestObject('event try/Page_Innovation Minds/td_1'))

WebUI.click(findTestObject('event try/Page_Innovation Minds/span_Event End Date and Time_input-group-addon'))

WebUI.click(findTestObject('event try/Page_Innovation Minds/td_31'))

WebUI.setText(findTestObject('Event/venue'), 'Marina mall')

WebUI.setText(findTestObject('Event/city'), 'Chennai')

WebUI.click(findTestObject('Event/isupcoming'))

WebUI.takeScreenshot()

WebUI.uploadFile(findTestObject('Event/upload image'), 'C:\\katalon proojets\\2.png')

WebUI.switchToFrame(findTestObject('Event/iframe'), 0)

WebUI.setText(findTestObject('Event/body'), 'New EventM01')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Event/save'))

