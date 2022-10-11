import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.Select

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI 
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

WebUI.setText(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/input_Login to HRMS_UserName'), username)

WebUI.setText(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/input_Login to HRMS_Password'), password)

//WebUI.setText(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/input__submit__input'), '12')
int a = Integer.parseInt(driver.findElement(By.xpath('/html/body/div/div[1]/div[2]/div[2]/div/div/form/label/div/span[1]')).getText())

int b = Integer.parseInt(driver.findElement(By.xpath('/html/body/div/div[1]/div[2]/div[2]/div/div/form/label/div/span[2]')).getText())

String output = String.valueOf(a + b)

driver.findElement(By.className('submit__input')).sendKeys(output)

WebUI.click(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/input__BtnLogin'))

//WebUI.click(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/input_Accounts_undefined'))
//WebUI.click(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/button_Proceed'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/input_Accounts_undefined'), 10, FailureHandling.OPTIONAL)) 
{
    WebUI.click(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/input_Accounts_undefined'))

    WebUI.click(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/button_Proceed'))
}

WebUI.click(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/p'))

WebUI.click(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/input_Leave Calender_Leave Request'))

Select se2 = new Select(driver.findElement(By.xpath('//*[@id="ddlLeaveType"]')))

b3 = leavetype

se2.selectByVisibleText(b3)

WebUI.setText(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/Page_HRMS/input__Leave_Requested'), leavesrequired)

WebUI.setText(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/textarea__EmpComments'), reason)

//WebUI.selectOptionByValue(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/select_-Select-DomesticMedical'),  '1', true)
Select se21 = new Select(driver.findElement(By.xpath('//*[@id="ddlLeaveGround"]')))

b31 = leavegrounds

se21.selectByVisibleText(b31)

WebUI.click(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/input__StartDate'))

String monthYear = 'August 2022'

date = startdate

WebUI.click(findTestObject('Object Repository/TC_Apply_CESCOM/DatePicker'))

for(int i=1;i<=12;i++) {
	String Mon="(//span[@class='month'])[ "+ i +"]"
	TestObject to = new TestObject("Object Repository/TC_Apply_CESCOM/DatePickerMonth")
	to.addProperty("xpath", ConditionType.EQUALS, Mon)
	aa=WebUI.getText(to)
	
	if(aa==Month1) {
		WebUI.click(to)
		
		String date="(//td[text()=" + date + "])[1]"
		TestObject to1 = new TestObject("Object Repository/TC_Apply_CESCOM/DatePickerDate")
		to1.addProperty("xpath", ConditionType.EQUALS, date)
		WebUI.click(to1)
		break
		}
	}
	
WebUI.click(findTestObject('Object Repository/TC_Apply_CESCOM/Page_HRMS/input__btnSave'))

WebUI.acceptAlert()

