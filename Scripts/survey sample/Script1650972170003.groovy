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

WebUI.click(findTestObject('survey sample1/program name'))

WebUI.click(findTestObject('My project/Me'))

WebUI.click(findTestObject('survey/admin'))

WebUI.click(findTestObject('survey/customize survey form'))

WebUI.click(findTestObject('survey/Tab management'))

WebUI.click(findTestObject('survey/delete1'))

WebUI.click(findTestObject('survey/delete1'))

WebUI.click(findTestObject('survey/update'))

WebUI.refresh()

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

WebUI.scrollToPosition(0, 4)

WebUI.waitForPageLoad(5)

WebUI.waitForElementVisible(findTestObject('survey/checkbox group'), 5)

WebUI.click(findTestObject('survey/checkbox group'))

WebUI.click(findTestObject('survey/edit 3'))

WebUI.click(findTestObject('survey/required 3'))

WebUI.setText(findTestObject('survey/checkbox label'), 'jhjgfjavgjfh')

WebUI.setText(findTestObject('survey/option 1'), 'fsdfkjsdhf')

WebUI.setText(findTestObject('survey/option 2'), 'fefbwjhfewhf')

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('survey/radio group'))

WebUI.click(findTestObject('survey/edit 4'))

WebUI.click(findTestObject('survey/required 4'))

WebUI.setText(findTestObject('survey/radio group label'), 'fewfrgregeetg')

WebUI.setText(findTestObject('survey/option 1'), 'fsdfkjsdhf')

WebUI.setText(findTestObject('survey/option 2'), 'fefbwjhfewhf')

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('survey/select box'))

WebUI.click(findTestObject('survey/edit 5'))

WebUI.click(findTestObject('survey/required 5'))

WebUI.setText(findTestObject('survey/selectbox label'), 'fsefgsdgdhgfthf')

WebUI.click(findTestObject('survey/allow multiple select'))

WebUI.setText(findTestObject('survey/option 1'), 'fsdfkjsdhf')

WebUI.setText(findTestObject('survey/option 2'), 'fefbwjhfewhf')

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('survey/header'))

WebUI.scrollToPosition(0, 12)

WebUI.click(findTestObject('survey/edit 6'))

WebUI.setText(findTestObject('survey/header label'), 'ghfjhgyjghjmkhkmhj')

WebUI.scrollToPosition(0, 7)

WebUI.enableSmartWait()

WebUI.click(findTestObject('survey/paragraph'))

WebUI.scrollToPosition(0, 10)

WebUI.click(findTestObject('survey/edit 7'))

WebUI.setText(findTestObject('survey/paragraph label'), 'fddfdsgsdncvmdsvn,mdvnfkdhb,mdfnb,dfnk')

WebUI.scrollToPosition(0, 4)

WebUI.click(findTestObject('survey/date field'))

WebUI.scrollToPosition(0, 15)

WebUI.click(findTestObject('survey/edit 8'))

WebUI.click(findTestObject('survey/required 8'))

WebUI.setText(findTestObject('survey/date field label'), 'jghjkhkhjljklkljljklklkcbncgfhjg')

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('survey/number'))

WebUI.scrollToPosition(0, 15)

WebUI.click(findTestObject('survey/edit 9'))

WebUI.click(findTestObject('survey/required 9'))

WebUI.setText(findTestObject('survey/number label'), 'hfjghjghkhjkhjklhlkll')

WebUI.scrollToPosition(0, 5)

WebUI.click(findTestObject('survey/Add new Tab'))

WebUI.setText(findTestObject('survey/tab name'), 'comments')

WebUI.setText(findTestObject('survey/display order'), '2')

WebUI.click(findTestObject('survey/ok'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('survey/page 2 text field'))

WebUI.click(findTestObject('survey/page 2 edit 1'))

WebUI.click(findTestObject('survey/page 2 required 1'))

WebUI.setText(findTestObject('survey/page 2 text label'), 'casdvcdsbvfdbfgnhngf gfnbgfnfgn')

WebUI.click(findTestObject('survey/save'))

