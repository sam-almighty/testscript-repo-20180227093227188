package com.testdroid.appium.android.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testdroid.appium.BaseAndroidTest;
import com.testdroid.appium.ServerUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SampleSauceCheckBoxTest extends BaseAndroidTest {

  public static final String USERNAME = "nostanle";
  public static final String ACCESS_KEY = "5631607a-dccd-4bc2-8f96-50ce1f84058c";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
  WebDriver driver;

  @BeforeClass
  public void setUp() throws Exception {

  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void mainPageTest() throws IOException, InterruptedException {

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
    capabilities.setCapability("platformVersion", "4.4");
    capabilities.setCapability("app", "http://saucelabs.com/example_files/ContactManager.apk");
    capabilities.setCapability("browserName", "");
    capabilities.setCapability("name", "Java Sample Test");
    capabilities.setCapability("deviceOrientation", "portrait");
    capabilities.setCapability("appiumVersion", "1.5.3");
    driver = new AndroidDriver<>(new URL(URL), capabilities);
  }

}
