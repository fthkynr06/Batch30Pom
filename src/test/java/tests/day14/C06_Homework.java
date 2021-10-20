package tests.day14;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import pages.DhtmlPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C06_Homework extends TestBase {

    /*
   go to url : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
   Fill in capitals by country
    */
    @Test
    public void test(){
        driver.get(ConfigReader.getProperty("dhtmlUrl"));
        Actions actions=new Actions(driver);
        DhtmlPage homeworkPage=new DhtmlPage(driver);
        actions.dragAndDrop(homeworkPage.Copenhagenbtn,homeworkPage.denmarkBox);
        actions.dragAndDrop(homeworkPage.Washington,homeworkPage.usaBox);
        actions.dragAndDrop(homeworkPage.stockholmBtn,homeworkPage.swedenBox).perform();
        actions.dragAndDrop(homeworkPage.romeBtn,homeworkPage.romeItaly).perform();
        actions.dragAndDrop(homeworkPage.Oslo,homeworkPage.Norway).perform();
        actions.dragAndDrop(homeworkPage.seul,homeworkPage.gkBtn).perform();
        actions.dragAndDrop(homeworkPage.madridbtn, homeworkPage.spainBox).perform();
    }
}




