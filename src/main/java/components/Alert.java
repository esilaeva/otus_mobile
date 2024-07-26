package components;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.id;

public class Alert {
  
  public void clickButtonOK(){
    $(id("android:id/button1")).click();
  }
  
}
