package pages;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.id;

public class ChatPage {
  
  public void checkChatPageOpened(){
    $(id("android:id/content")).shouldBe(appear);
  }
  
}
