import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.support.ui.Select

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver


import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl(url)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/TC_Approval_CESCOM/Page_HRMS/input_Login to HRMS_UserName'), username)

WebUI.setText(findTestObject('Object Repository/TC_Approval_CESCOM/Page_HRMS/input_Login to HRMS_Password'), password)

//WebUI.setText(findTestObject('Object Repository/TC_Approval_CESCOM/Page_HRMS/input__submit__input'), '12')
int a = Integer.parseInt(driver.findElement(By.xpath('/html/body/div/div[1]/div[2]/div[2]/div/div/form/label/div/span[1]')).getText())

int b = Integer.parseInt(driver.findElement(By.xpath('/html/body/div/div[1]/div[2]/div[2]/div/div/form/label/div/span[2]')).getText())

String output = String.valueOf(a + b)

driver.findElement(By.className('submit__input')).sendKeys(output)

WebUI.click(findTestObject('Object Repository/TC_Approval_CESCOM/Page_HRMS/input__BtnLogin'))

WebUI.click(findTestObject('Object Repository/TC_Approval_CESCOM/Page_HRMS/p'))

//WebUI.click(findTestObject('Object Repository/TC_Approval_CESCOM/Page_HRMS/span_-Select-'))
Select se2 = new Select(driver.findElement(By.xpath('//*[@id="ddlSubject"]')))

b3 = Subject

se2.selectByVisibleText(b3)

WebUI.sendKeys(findTestObject('Object Repository/TC_Approval_CESCOM/Page_HRMS/Page_HRMS/Search_Box_Approval'), Search_Box)

WebUI.click(findTestObject('Approval/Page_HRMS/approver'))

WebUI.sendKeys(findTestObject('Approval/Page_HRMS/remark'), remarks)

WebUI.scrollToElement(findTestObject('Approval/Page_HRMS/remark'),30)

WebUI.click(findTestObject('Approval/Page_HRMS/submit'))

WebUI.acceptAlert()
	


