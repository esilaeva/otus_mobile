package extensions;

import com.codeborne.selenide.Configuration;
import com.google.inject.Guice;
import com.google.inject.Injector;
import modules.GuiceModule;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import providers.SelenideWebDriver;

public class AppiumExtension implements BeforeAllCallback, BeforeEachCallback {
  
  private final Injector injector;
  
  public AppiumExtension() {
    this.injector = Guice.createInjector(new GuiceModule());;
  }
  
  @Override
  public void beforeAll(ExtensionContext context) {
    Configuration.browserSize = null;
    Configuration.browser = SelenideWebDriver.class.getName();
  }
  
  @Override
  public void beforeEach(ExtensionContext context) {
    Object testInstance = context.getRequiredTestInstance();
    injector.injectMembers(testInstance);
  }
  
}