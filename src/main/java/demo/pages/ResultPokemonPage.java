package demo.pages;

import demo.driver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPokemonPage {

    public String checkPokemonNumber() {

        WebDriverWait wait = new WebDriverWait(WebDriverInstance.driver, 10);
        WebElement PokemonNumber = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//center//b")));
        String number = PokemonNumber.getText();
        return number;
    }
    public String checkPokemonName() {
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.driver, 10);
        WebElement PokemonNumber = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
        String name = PokemonNumber.getText();
        return name;
    }
}
