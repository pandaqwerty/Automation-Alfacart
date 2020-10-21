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
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.alfacart.com/')

WebUI.click(findTestObject('kategori/Page_Alfacart - Belanja Online/input'))

WebUI.click(findTestObject('kategori/Page_Alfacart - Belanja Online/a_'))

WebUI.click(findTestObject('kategori/Page_Alfacart - Belanja Online/i_Daftar Jadi Penjual_demo-icon icon-list'))

WebUI.click(findTestObject('kategori/Page_Alfacart - Belanja Online Jadi Dekat Bersama Toko Alfamart/a_Makanan Anak'))

WebUI.click(findTestObject('kategori/Page_Alfacart - Belanja Online Jadi Dekat Bersama Toko Alfamart/a_Sereal Anak'))

WebUI.click(findTestObject('Object Repository/kategori/Page_Jual Produk Sereal Anak untuk Sarapan _a37986/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/kategori/Page_Jual Produk Sereal Anak untuk Sarapan _a37986/button_View Cart'))

WebUI.click(findTestObject('Object Repository/kategori/Page_Keranjang Belanja - Shopping Cart  Alfacart/button_Lanjut Checkout'))

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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.alfacart.com/')

WebUI.click(findTestObject('Object Repository/kategori/Page_Alfacart - Belanja Online/input'))

WebUI.click(findTestObject('Object Repository/kategori/Page_Alfacart - Belanja Online/a_'))

WebUI.click(findTestObject('Object Repository/kategori/Page_Alfacart - Belanja Online/i_Daftar Jadi Penjual_demo-icon icon-list'))

WebUI.click(findTestObject('Object Repository/kategori/Page_Alfacart - Belanja Online Jadi Dekat Bersama Toko Alfamart/a_Makanan Anak'))

WebUI.click(findTestObject('Object Repository/kategori/Page_Alfacart - Belanja Online Jadi Dekat Bersama Toko Alfamart/a_Sereal Anak'))

WebUI.click(findTestObject('Object Repository/kategori/Page_Jual Produk Sereal Anak untuk Sarapan _a37986/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/kategori/Page_Jual Produk Sereal Anak untuk Sarapan _a37986/button_View Cart'))

WebUI.click(findTestObject('Object Repository/kategori/Page_Keranjang Belanja - Shopping Cart  Alfacart/button_Lanjut Checkout'))

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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.alfacart.com/')

WebUI.click(findTestObject('Pusat Informasi/input'))

WebUI.click(findTestObject('Pusat Informasi/a_'))

WebUI.click(findTestObject('Pusat Informasi/i_Kategori_demo-icon icon-up-down'))

WebUI.click(findTestObject('Pusat Informasi/a_Perlengkapan Luar Rumah'))

WebUI.click(findTestObject('Object Repository/Page_Jual Peralatan Rumah Tangga Modern dan_34b1e1/i_Kategori_demo-icon icon-up-down'))

WebUI.click(findTestObject('Object Repository/Page_Jual Peralatan Rumah Tangga Modern dan_34b1e1/a_Jam'))

WebUI.click(findTestObject('Object Repository/Page_Jual Jam Tangan Pria dan Wanita Terlen_94a099/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Jual Jam Tangan Pria dan Wanita Terlen_94a099/button_View Cart'))

WebUI.closeBrowser()

