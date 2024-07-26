package pages;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

import com.codeborne.selenide.Selenide;


public class MainPage {
  
  
  public MainPage open() {
    Selenide.open();
    
    return this;
  }
  
  public MainPage clickNextButton(){
    $(xpath("//android.widget.TextView[@text='Next']")).shouldBe(appear).click();
    
    return this;
  }
  
  public MainPage clickSkipButton(){
    $(xpath("//android.widget.TextView[@text='Skip >']")).shouldBe(appear).click();
    return this;
  }

}
