package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
    WebDriver driver;
    public FacebookPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="email")
    public WebElement mainKutusu;
    @FindBy(id="pass")
    public WebElement sifreKutusu;
    @FindBy(id="login")
    public WebElement loginTusu;

    //@FindBy(className="_9ay7")

   // public void cookiesGec(){
     //   driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();
    }
//}
