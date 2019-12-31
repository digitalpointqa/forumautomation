package digitalpoint.mobiledemo1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class demo1 {
	
	public AndroidDriver<AndroidElement> mdriver;
	
	@BeforeTest
	public void beforesetup() throws MalformedURLException
	{
	DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("chromedriverExecutable", "C:\\AllJava\\drivers\\Chrome_79\\chromedriver.exe");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//capabilities.setCapability("newCommandTimeout", 2000);
		mdriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	
	}

	

	@Test
	public void loginpage() {
		mdriver.get("https://m.facebook.com/");
		//mdriver.findElement(By.xpath("//*[@id='text-fade']/div[1]/div/div[3]/div/a[2]")).click();
		//mdriver.findElement(By.name("email")).sendKeys("nizam@digitalpoint.tech");
		//mdriver.findElement(By.name("password")).sendKeys("abcdef*123456");
		//driver.findElement(By.xpath("(//*[@type='submit'")).click();
		//mdriver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
		//Assert.assertEquals(mdriver.getCurrentUrl(), "http://forum.digitalpoint.tech/user/index.php/login", "URL Mismatch");
		//Assert.assertEquals(mdriver.getTitle(), "Digital Point - Forum | User Login", "Title Mismatch");
		
		//mdriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_username\")").sendKeys("xxxxxx@gmail.com");
		//mdriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_password\")").sendKeys("xxxxxx");
		// mdriver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("Nizam");
		// mdriver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("abcde");
		
		
		
		//mdriver.findElementsById("")
		//mdriver.findElementById("m_login_email").sendKeys("Nizam");
	
	    // mdriver.findElement(By.name("email")).sendKeys("nizam@digitalpoint.tech");
	    //mdriver.findElementByXPath("//*[@class='android.widget.EditText']").sendKeys("nizam@gmail.com");
	    
	 
	    		
	    //mdriver.findElement(By.name("password")).sendKeys("abcdef*123456");
	   //mdriver.findElement(By.xpath("//*[@id='m_login_email']")).sendKeys("nizam@fmail.com");
	   // mdriver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
	  //  mdriver.findElement(By.xpath("//*[@id=\"navbar-right\"]/li/ul/li/a"));
	    
	    //mdriver.findElementByXPath("/html/body/div[2]/div/div/form/div/div[2]/div[1]/input").sendKeys("nizam");
	    
	    //mdriver.findElement(By.name("email")).sendKeys("xyz");
	    //mdriver.findElements(By.tagname("textfield")).get(2).sendkeys("abc");
	    
	    //mdriver.findElementByName("email").sendKeys("nizam");
	    // mdriver.findElementByXPath("//*[@id='m_login_email']").sendKeys("nizam@gmail.com");
	}
	
	

	


	@AfterTest
	public void afterTest( ) {
		//mdriver.quit();
	}



}
