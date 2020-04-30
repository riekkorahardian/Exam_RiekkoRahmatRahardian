package demo.pages;
import demo.driver.WebDriverInstance;
import org.openqa.selenium.By;

public class SearchResultPage {

    public void FirstResult(){
        WebDriverInstance.driver.findElement(By.xpath("//body[@id='gsr']/div[@id='main']/div[@id='cnt']/div[@class='mw']/div[@id='rcnt']/div[@class='col']/div[@id='center_col']/div[@id='res']/div[@id='search']/div/div[@id='rso']/div[1]/div[1]/div[1]/a[1]")).click();
    }
}