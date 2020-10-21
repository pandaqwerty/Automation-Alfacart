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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String

def info = [('username') : '', ('keterangan') : '']

def data = TestDataFactory.findTestData('Data Files/Test Script Data')

info.username = data.getValue(1, 1)

info.keterangan = data.getValue(2, 1)

String Username = info.username.toString()

String keterangan = info.keterangan.toString()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.alfacart.com/')

WebUI.click(findTestObject('Object Repository/Alfacart/Page_Alfacart - Belanja Online Jadi Dekat B_00e00e/input'))
WebUI.click(findTestObject('Object Repository/Alfacart/Page_Alfacart - Belanja Online Jadi Dekat B_00e00e/a_'))
WebUI.click(findTestObject('Object Repository/Alfacart/Page_Alfacart - Belanja Online Jadi Dekat B_00e00e/button_Masuk  Daftar'))

WebUI.setText(findTestObject('Object Repository/Alfacart/Page_Alfacart_Login/input_Email  Nomor Ponsel_email'), Username)

WebUI.setText(findTestObject('Object Repository/Alfacart/Page_Alfacart_Login/input_Password_password'), '**********')

WebUI.click(findTestObject('Object Repository/Alfacart/Page_Alfacart_Login/input_Password_btn btn-login masuk'))

WebUI.delay(5)

String URLLoginSuccess = WebUI.getUrl()

if (URLLoginSuccess == 'https://www.alfacart.com/customer/account') {
    FileInputStream file = new FileInputStream(new File('C:\\Users\\fuadn\\Downloads\\Automation Alfacart\\Test case Alfacart Web.xlsx'))

    XSSFWorkbook workbook = new XSSFWorkbook(file)

    XSSFSheet sheet = workbook.getSheetAt(0)

    sheet.getRow(6).createCell(9).setCellValue('Test Success')

    file.close()

    FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\fuadn\\Downloads\\Automation Alfacart\\Test case Alfacart Web.xlsx'))

    workbook.write(outFile)

    outFile.close()
} else {
    FileInputStream file = new FileInputStream(new File('C:\\Users\\fuadn\\Downloads\\Automation Alfacart\\Test case Alfacart Web.xlsx'))

    XSSFWorkbook workbook = new XSSFWorkbook(file)

    XSSFSheet sheet = workbook.getSheetAt(0)

    sheet.getRow(6).createCell(9).setCellValue('Test Failed')

    file.close()

    FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\fuadn\\Downloads\\Automation Alfacart\\Test case Alfacart Web.xlsx'))

    workbook.write(outFile)

    outFile.close()
}

WebUI.acceptAlert()

