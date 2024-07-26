import com.google.inject.Inject;
import components.Alert;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.ChatPage;
import pages.MainPage;

@ExtendWith(AppiumExtension.class)
public class MobileTest {
  
  @Inject
  private MainPage mainPage;
  @Inject
  private Alert alert;
  @Inject
  private ChatPage chatPage;
  
  @Test
  public void firstTest() {
    mainPage.open()
        .clickNextButton()
        .clickNextButton()
        .clickSkipButton();
    
    alert.clickButtonOK();
    
    chatPage.checkChatPageOpened();
  }
  
}
