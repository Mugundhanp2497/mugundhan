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

WebUI.click(findTestObject('My project/Me'))

WebUI.click(findTestObject('survey/admin'))

WebUI.click(findTestObject('survey/customize survey form'))

WebUI.click(findTestObject('survey/Tab management'))

WebUI.click(findTestObject('survey/delete1'))

WebUI.click(findTestObject('survey/delete1'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('survey/update'))

WebUI.refresh()

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('survey/Add new Tab'))

WebUI.setText(findTestObject('survey/tab name'), 'Innovation Minds')

WebUI.setText(findTestObject('survey/display order'), '1')

WebUI.click(findTestObject('survey/ok'))

WebUI.click(findTestObject('survey/text field'))

WebUI.click(findTestObject('survey/edit'))

WebUI.click(findTestObject('survey/required'))

WebUI.setText(findTestObject('survey/Text-Label'), 'Innovation mind')

WebUI.click(findTestObject('survey/text area'))

WebUI.click(findTestObject('survey/edit 2'))

WebUI.click(findTestObject('survey/required 2'))

WebUI.setText(findTestObject('survey/text area label'), 'Innovtion')

WebUI.click(findTestObject('survey/checkbox group'))

WebUI.click(findTestObject('survey/edit 3'))

WebUI.click(findTestObject('survey/required 3'))

WebUI.setText(findTestObject('survey/checkbox label'), 'jhjgfjavgjfh')

WebUI.setText(findTestObject('survey/option 1'), 'fsdfkjsdhf')

WebUI.setText(findTestObject('survey/option 2'), 'fefbwjhfewhf')

WebUI.click(findTestObject('survey/add option'))

WebUI.setText(findTestObject('survey/option 3'), 'fdsgvdfgfd')

WebUI.click(findTestObject('survey/save'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('survey/radio group'))

WebUI.click(findTestObject('survey/edit 4'))

WebUI.click(findTestObject('survey/required 4'))

WebUI.setText(findTestObject('survey/radio group label'), 'fewfrgregeetg')

WebUI.setText(findTestObject('survey/option 1'), 'fsdfkjsdhf')

WebUI.setText(findTestObject('survey/option 2'), 'fefbwjhfewhf')

WebUI.click(findTestObject('survey/add option'))

WebUI.setText(findTestObject('survey/option 3'), 'fdsgvdfgfd')

WebUI.click(findTestObject('survey/save'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('survey/select box'))

WebUI.click(findTestObject('survey/edit 5'))

WebUI.click(findTestObject('survey/required 5'))

WebUI.setText(findTestObject('survey/selectbox label'), 'fsefgsdgdhgfthf')

WebUI.click(findTestObject('survey/allow multiple select'))

WebUI.setText(findTestObject('survey/option 1'), 'fsdfkjsdhf')

WebUI.setText(findTestObject('survey/option 2'), 'fefbwjhfewhf')

WebUI.click(findTestObject('survey/add option'))

WebUI.setText(findTestObject('survey/option 3'), 'fdsgvdfgfd')

WebUI.click(findTestObject('survey/save'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('survey/header'))

WebUI.click(findTestObject('survey/edit 6'))

WebUI.setText(findTestObject('survey/header label'), 'ghfjhgyjghjmkhkmhj')

WebUI.click(findTestObject('survey/paragraph'))

WebUI.click(findTestObject('survey/edit 7'))

WebUI.setText(findTestObject('survey/paragraph label'), 'fddfdsgsdncvmdsvn,mdvnfkdhb,mdfnb,dfnk')

WebUI.click(findTestObject('survey/save'))

