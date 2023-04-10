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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://copychecker.com/')

WebUI.click(findTestObject('Object Repository/Page_100 Free SEO Tools - CopyChecker.com/a_Plagiarism Checker'))

WebUI.setText(findTestObject('Object Repository/Page_Plagiarism Checker - 100 Free Plagiari_6cbd26/textarea_Total Character_text'), 
    'lorem ipsum lorem ipsum lorem ipsum lorem ipsm lorem ipsum')

WebUI.click(findTestObject('Object Repository/Page_Plagiarism Checker - 100 Free Plagiari_6cbd26/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Page_Plagiarism Checker - 100 Free Plagiari_6cbd26/input_Total Character_submit'))

WebUI.click(findTestObject('Object Repository/Page_Plagiarism Checker - 100 Free Plagiari_6cbd26/a_Reverse Image Search'))

WebUI.click(findTestObject('Object Repository/Page_Reverse Image Search  Find Similar Ima_6bb4f0/img'))

WebUI.click(findTestObject('Object Repository/Page_Reverse Image Search  Find Similar Ima_6bb4f0/a_PDF Editor'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/button_Start With Blank PDF'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/svg_Sign_MuiSvgIcon-root MuiSvgIcon-fontSiz_a04bd5'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/button_New Signature'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/button_Draw'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/canvas_Upload Image_signature-pad'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/canvas_Upload Image_signature-pad'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/canvas'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/svg_Apply changes_MuiSvgIcon-root MuiSvgIco_dacf22'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/button_Download'))

WebUI.click(findTestObject('Object Repository/Page_Free Online PDF Editor - CopyChecker.com/button_Back to editing'))

WebUI.closeBrowser()

