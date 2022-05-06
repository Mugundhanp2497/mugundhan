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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(findTestData('Challnege Data').getValue(1, 1))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('IMobj/email'), findTestData('Challnege Data').getValue(2, 1))

WebUI.click(findTestObject('IMobj/next'))

WebUI.setText(findTestObject('IMobj/password'), findTestData('Challnege Data').getValue(3, 1))

WebUI.click(findTestObject('IMobj/sign in'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('IMobj/test automation'))

WebUI.click(findTestObject('My project/Me'))

WebUI.click(findTestObject('My project/Me,My project'))

WebUI.click(findTestObject('ListView card/first Project click'))

WebUI.click(findTestObject('ListView card/ListView'))

WebUI.click(findTestObject('ListView card/New Card 1'))

Date d = new Date()

Epoc = d.getTime()

CardTitle = ('My Card' + Epoc)

WebUI.setText(findTestObject('ListView card/Card Summary'), CardTitle)

WebUI.click(findTestObject('ListView card/card type'))

WebUI.click(findTestObject('ListView card/pop up'))

WebUI.click(findTestObject('ListView card/Description'))

WebUI.switchToFrame(findTestObject('My project/iframe'), 0)

WebUI.setText(findTestObject('My project/Project Description'), 'My Star Card ')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('ListView card/Task Menber click'))

WebUI.setText(findTestObject('My project/Task member'), 'a')

WebUI.click(findTestObject('My project/Member suggestion'))

//WebUI.click(findTestObject('ListView card/card type click'))
//WebUI.click(findTestObject('My project/Card type-epic'))
WebUI.click(findTestObject('ListView card/Page_Innovation Minds/i_Priority_medium-priority'))

//WebUI.click(findTestObject('ListView card/high priority'))

WebUI.click(findTestObject('My project/Create Task-submit'))

