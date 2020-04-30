package demo.pages;

import demo.driver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class CreateToDo {

    public void inputTask(String Keyword) {
        AndroidElement inputTask = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_title"));
        inputTask.sendKeys(Keyword);
    }

    public void clickCreateToDo(){
        AndroidDriverInstance.androidDriver.findElement(By.id("fab_edit_task_done")).click();
    }
}
