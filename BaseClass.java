package appiumtest;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

public static void main(String[] args) {

//Set the Desired Capabilities

DesiredCapabilities caps = new DesiredCapabilities();

caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

caps.setCapability(MobileCapabilityType.DEVICE_NAME , "Samsung SM-A127F");

caps.setCapability("udid", "R58T102F00W"); //Give Device ID  caps.setCapability("platformName", "Android");

caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

caps.setCapability("appPackage", "com.example.android.testing.notes.mock");

caps.setCapability("appActivity", "com.example.android.testing.notes.notes.NotesActivity");


//Instantiate Appium Driver

try {
	
	AndroidDriver androiddriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	androiddriver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes")).click();
	androiddriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[1]")).sendKeys("test");
	androiddriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[2]")).sendKeys("test description");
	androiddriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ImageButton")).click();
	

} catch (MalformedURLException e) {

System.out.println(e.getMessage());

}

}

}