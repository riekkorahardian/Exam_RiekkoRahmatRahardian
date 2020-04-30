package demo.pages;

import demo.driver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllToDo {

    public String getTask(){
        AndroidElement text = AndroidDriverInstance.androidDriver.findElement(By.id("title"));
        String findText = text.getText();
        return findText;

    }

    public void clickCheck(){
        AndroidDriverInstance.androidDriver.findElement(By.id("complete")).click();
    }
    public void getChecked(){
        String isChecked = AndroidDriverInstance.androidDriver.findElement(By.id("complete")).getAttribute("Checked");
        boolean data = Boolean.valueOf(isChecked);
        Assert.assertTrue(data);
    }

    public void getUnchecked(){
        String isChecked = AndroidDriverInstance.androidDriver.findElement(By.id("complete")).getAttribute("Checked");
        boolean data = Boolean.valueOf(isChecked);
        Assert.assertFalse(data);

    }

    public void clickFilter(){
        AndroidDriverInstance.androidDriver.findElement(By.id("menu_filter")).click();
    }

    public void ActiveFilter(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]"
        )).click();
    }

    public void checkActiveFilter(){
      getUnchecked();

    }

    public void CompletedFilter(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]]"
        )).click();
    }

    public void checkCompletedFilter(){
        getChecked();
    }

    public void clickoption() {
        AndroidDriverInstance.androidDriver.findElement(By.xpath("\t//android.widget.ImageView[@content-desc=\"More options\"]"
        )).click();
    }

    public void clickRefresh(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]\n"
        )).click();
    }


    public void clearCompleted(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]\n"
        )).click();
    }

    public void clickHamburger(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"
        )).click();
    }

    public void clickStatistic(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView\n"
        )).click();
    }

}

