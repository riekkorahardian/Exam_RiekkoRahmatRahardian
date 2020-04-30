package demo.pages;

import demo.driver.AndroidDriverInstance;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDoHomepage {

    public boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }

    public void addToDo(){
        AndroidDriverInstance.androidDriver.findElement(By.id("fab_add_task")).click();
    }

}
