package demo.pages;

import demo.driver.AndroidDriverInstance;
import org.openqa.selenium.By;

public class SearchResultPage {

    public void clickResultPikachu(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("//h3[contains(text(),'Pikachu - Wikipedia bahasa Indonesia, ensiklopedia')]")).click();
    }

    public void clickResultCharizard(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("//h3[contains(text(),'Charizard - Wikipedia bahasa Indonesia, ensiklopedia')]")).click();
    }

    public void clickResultBulbasaur(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("//h3[contains(text(),'Bulbasaur - Wikipedia bahasa Indonesia, ensiklopedia')]")).click();
    }

    public void clickResultMewTwo(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("//h3[contains(text(),'MewTwo - Wikipedia bahasa Indonesia, ensiklopedia')]")).click();

    }

}

