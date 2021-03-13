package assignment;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autotask {

public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Launch the URL
		driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		  //Clear and type in the from station text field
		  driver.findElementById("txtOriginGeneral").clear();
		  driver.findElementById("txtOriginGeneral").sendKeys("Cameron Highlands",Keys.ENTER);
		  //Clear and type in the to station text field
		  driver.findElementById("txtDestinationGeneral").clear();
		  driver.findElementById("txtDestinationGeneral").sendKeys("Kaula Lampur",Keys.ENTER); 
		  Thread.sleep(2000);
		  driver.findElementById("txtDepartDateBooking").click();
		  driver.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a").click();
		  Thread.sleep(2000);
          driver.findElementByXPath("//*[@id=\"btnBusSearchNewGeneral\"]").click();
		  Thread.sleep(3000);
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[1]/td[6]/a").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[2]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[3]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[4]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[5]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[6]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[7]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/input").click();
		  Thread.sleep(3000);
		  WebElement eleFullname = driver.findElementById("Full name");
			eleFullname.sendKeys("abcd");
			WebElement eleMobileno = driver.findElementById("Mobile no");
			eleMobileno.sendKeys("00001111");
			WebElement eleEmail = driver.findElementById("Email");
			eleEmail.sendKeys("abcd*******@emailid.com");
			WebElement eleReenteremail = driver.findElementById("Re-enter email");
			eleReenteremail.sendKeys("abcd*******@emailid.com");
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"ContentPlaceHolder1_btnProceedPayment\"]").click();
			System.out.println("image " + driver.getTitle());
			TakesScreenshot TS3=(TakesScreenshot)driver;
			File src3= TS3.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src3, new File("./Screenshots1/image.png"));
			Thread.sleep(3000);
			driver.close();
}}
		  
		