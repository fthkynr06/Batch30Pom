package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
    WebDriver driver;
    public AmazonPage(WebDriver driver){
        // bir page sayfasi olusturuldugunda mutlaka yapmamiz gereken sey
        // bir constructor olusturup driver'a ilk degeri atamaktir (instantiate)
        //C01 deki driveri parametre olarak buraya gonderiyoruz
        this.driver=driver;
        //driverleri esitliyoruz
        PageFactory.initElements(driver,this);
        //bu mutlaka her page sayfasi icin olmasi gereken satir bunu bir constraction'un icine yaziyoruz
        //driver'e ilk degerini atamak
    }
//bos consraction uretelim
    public AmazonPage(){
    }
    //WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;

    @FindBy(id="searchDropdownBox")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public WebElement ilkUrun;
}
