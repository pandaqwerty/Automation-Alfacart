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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.String

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.alfacart.com/')

WebUI.click(findTestObject('Object Repository/Penambahan cart/Page_Alfacart - Belanja Online Jadi Dekat B_00e00e/input'))

WebUI.click(findTestObject('Object Repository/Penambahan cart/Page_Alfacart - Belanja Online Jadi Dekat B_00e00e/a_'))

WebUI.setText(findTestObject('Object Repository/Penambahan cart/Page_Alfacart - Belanja Online Jadi Dekat B_00e00e/input_Kategori_inputSearch'), 
    'susu')

WebUI.sendKeys(findTestObject('Object Repository/Penambahan cart/Page_Alfacart - Belanja Online Jadi Dekat B_00e00e/input_Kategori_inputSearch'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Penambahan cart/Page_Alfacart - Belanja Online Jadi Dekat B_00e00e/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Penambahan cart/Page_Alfacart - Belanja Online Jadi Dekat B_00e00e/button_View Cart'))

String URLLoginSuccess = WebUI.getUrl()

if (URLLoginSuccess == 'https://www.alfacart.com/customer/account') {
	FileInputStream file = new FileInputStream(new File('C:\\Users\\fuadn\\Downloads\\Automation Alfacart\\Test case Alfacart Web.xlsx'))

	XSSFWorkbook workbook = new XSSFWorkbook(file)

	XSSFSheet sheet = workbook.getSheetAt(0)

	sheet.getRow(16).createCell(9).setCellValue('Test Success')

	file.close()

	FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\fuadn\\Downloads\\Automation Alfacart\\Test case Alfacart Web.xlsx'))

	workbook.write(outFile)

	outFile.close()
} else {
	FileInputStream file = new FileInputStream(new File('C:\\Users\\fuadn\\Downloads\\Automation Alfacart\\Test case Alfacart Web.xlsx'))

	XSSFWorkbook workbook = new XSSFWorkbook(file)

	XSSFSheet sheet = workbook.getSheetAt(0)

	sheet.getRow(16).createCell(9).setCellValue('Test Failed')

	file.close()

	FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\fuadn\\Downloads\\Automation Alfacart\\Test case Alfacart Web.xlsx'))

	workbook.write(outFile)

	outFile.close()
}

WebUI.closeBrowser()


