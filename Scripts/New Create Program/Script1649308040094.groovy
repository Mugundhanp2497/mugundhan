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
import java.io.File as File
import java.io.IOException as IOException
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Sheet as Sheet
import org.apache.poi.ss.usermodel.Workbook as Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileOutputStream as FileOutputStream
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.*
import java.util.*
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import java.awt.*
import java.awt.Robot as Robot
import java.awt.event.KeyEvent
import java.awt.AWTException as AWTException
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.interactions.*

WebUI.openBrowser(findTestData('Challnege Data').getValue(1, 1))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('IMobj/email'), findTestData('Challnege Data').getValue(2, 1))

WebUI.click(findTestObject('IMobj/next'))

WebUI.setText(findTestObject('IMobj/password'), findTestData('Challnege Data').getValue(3, 1))

WebUI.click(findTestObject('IMobj/sign in'))

WebUI.click(findTestObject('My project/Me'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('create program/super admin'))

WebUI.click(findTestObject('create program/manage program'))

WebUI.click(findTestObject('create program/Add new'))

Date currentdate = new Date()

CurrentEpoc = currentdate.getTime()

String Title = 'Program' + CurrentEpoc

println(Title)

WebUI.scrollToElement(findTestObject('create program/Survay Management'), 0)

WebDriver d = DriverFactory.getWebDriver()

JavascriptExecutor js = ((d) as JavascriptExecutor)

WebElement ProgramType = d.findElement(By.xpath('//span[@class=\'program-icon bg9\']'))

js.executeScript('arguments[0].click()', ProgramType)

WebElement ProgramName = d.findElement(By.xpath('//input[@id=\'title\']'))

js.executeScript(('arguments[0].setAttribute(\'value\',\' ' + Title) + ' \')', ProgramName)

WebElement submit = d.findElement(By.xpath('//input[@type=\'submit\']'))


Robot r=new Robot()
r.keyPress(KeyEvent.VK_TAB)
r.keyRelease(KeyEvent.VK_TAB)
r.keyPress(KeyEvent.VK_TAB)
r.keyRelease(KeyEvent.VK_TAB)

r.keyPress(KeyEvent.VK_SHIFT)
r.keyPress(KeyEvent.VK_I)
r.keyRelease(KeyEvent.VK_I)
r.keyPress(KeyEvent.VK_M)
r.keyRelease(KeyEvent.VK_M)
r.keyRelease(KeyEvent.VK_SHIFT)


r.keyPress(KeyEvent.VK_TAB)
r.keyRelease(KeyEvent.VK_TAB)

r.keyPress(KeyEvent.VK_SHIFT)
r.keyPress(KeyEvent.VK_I)
r.keyRelease(KeyEvent.VK_I)
r.keyPress(KeyEvent.VK_M)
r.keyRelease(KeyEvent.VK_M)
r.keyRelease(KeyEvent.VK_SHIFT)


r.keyPress(KeyEvent.VK_TAB)
r.keyRelease(KeyEvent.VK_TAB)
r.keyPress(KeyEvent.VK_TAB)
r.keyRelease(KeyEvent.VK_TAB)
r.keyPress(KeyEvent.VK_TAB)
r.keyRelease(KeyEvent.VK_TAB)
r.keyPress(KeyEvent.VK_TAB)
r.keyRelease(KeyEvent.VK_TAB)


r.keyPress(KeyEvent.VK_SHIFT)
r.keyPress(KeyEvent.VK_I)
r.keyRelease(KeyEvent.VK_I)
r.keyPress(KeyEvent.VK_M)
r.keyRelease(KeyEvent.VK_M)
r.keyRelease(KeyEvent.VK_SHIFT)

js.executeScript('arguments[0].click()', submit)