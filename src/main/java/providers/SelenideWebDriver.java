package providers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Nonnull;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

public class SelenideWebDriver implements WebDriverProvider {
  
  @Nonnull
  @Override
  public WebDriver createDriver(@Nonnull Capabilities capabilities) {
    UiAutomator2Options options = new UiAutomator2Options();
    options.merge(capabilities);
    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
    options.setPlatformName(System.getProperty("platformName", "Android"));
    options.setDeviceName(System.getProperty("deviceName", "Samsung Galaxy S6"));
    options.setPlatformVersion(System.getProperty("platformVersion", "7.1.1"));
    options.setApp("src/main/resources/andy.apk");
    
    try {
      return new AndroidDriver(new URL("http://192.168.88.208:4723/wd/hub"), options);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

}
