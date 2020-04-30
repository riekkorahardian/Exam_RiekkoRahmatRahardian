package demo.steps;

import demo.pages.AllToDo;
import demo.pages.CreateToDo;
import demo.pages.StatisticToDo;
import demo.pages.ToDoHomepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ToDoStepsDefinition {
    ToDoHomepage toDoHomepage = new ToDoHomepage();
    StatisticToDo statisticToDo = new StatisticToDo();
    CreateToDo createToDo = new CreateToDo();
    AllToDo allToDo = new AllToDo();

    @Given("User is on To-Do Task Homepage")
    public void userIsOnToDoTaskHomepage() {
        boolean result = toDoHomepage.isOnPage();
        Assert.assertTrue(result);
    }

    @And("User click create To-Do button")
    public void userClickCreateToDoButton() {
        toDoHomepage.addToDo();

    }

    @And("User Type {string} on text field")
    public void userTypeOnTextField(String Text) {
        createToDo.inputTask(Text);
        createToDo.clickCreateToDo();

    }


    @Then("User see the {string} task has been created")
    public void userSeeTheTaskHasBeenCreated(String Text) {
        String actual = allToDo.getTask();
        Assert.assertEquals(Text, actual);
    }


    @Given("User already create {string} To-Do Task")
    public void userAlreadyCreateToDoTask(String Text) {
        userIsOnToDoTaskHomepage();
        userClickCreateToDoButton();
        userTypeOnTextField(Text);

    }
    @When("User check the checklist button on Olahraga Pagi Task")
    public void userCheckTheChecklistButtonOnOlahragaPagiTask() {
        allToDo.clickCheck();
    }

    @Then("User see the Olahraga Pagi task has been checked")
    public void userSeeTheOlahragaPagiTaskHasBeenChecked() {
        allToDo.getChecked();
    }

    @Given("User already check the task has been checked")
    public void userAlreadyCheckTheTaskHasBeenChecked() {
        allToDo.clickCheck();
    }

    @When("User uncheck the checklist button on Olahraga Pagi Task")
    public void userUncheckTheChecklistButtonOnOlahragaPagiTask() {
        allToDo.clickCheck();
    }

    @Then("User see the Olahraga Pagi task has been unchecked")
    public void userSeeTheOlahragaPagiTaskHasBeenUnchecked() {
        allToDo.getUnchecked();
    }


    @Given("User already Create {string} To-Do Task")
    public void useralreadyCreateToDoTask(String Text) {
        userIsOnToDoTaskHomepage();
        userClickCreateToDoButton();
        userTypeOnTextField(Text);
    }

    @When("User filter the To-Do task to Active To-Do Task only")
    public void userFilterTheToDoTaskToActiveToDoTaskOnly() {
        allToDo.clickFilter();
        allToDo.ActiveFilter();
    }

    @Then("User see the Active To-Do Task list only")
    public void userSeeTheActiveToDoTaskListOnly() {
        allToDo.checkActiveFilter();
    }

    @When("User filter the To-Do task to Completed To-Do Task only")
    public void userFilterTheToDoTaskToCompletedToDoTaskOnly() {
        allToDo.clickFilter();
        allToDo.CompletedFilter();
    }

    @Then("User see the Completed To-Do Task list only")
    public void userSeeTheCompletedToDoTaskListOnly() {
        allToDo.checkCompletedFilter();
    }

    @When("User refresh the To-Do Task list")
    public void userRefreshTheToDoTaskList() {
        allToDo.clickRefresh();
    }
    

    @Then("User see the {string} To-Do Task has been refreshed")
    public void userSeeTheToDoTaskHasBeenRefreshed(String Text) {
        String actual = allToDo.getTask();
        Assert.assertEquals(Text, actual);
    }

    @When("User click the option icon")
    public void userClickTheOptionIcon() {
        allToDo.clickoption();
    }

    @And("User clear the Completed To-Do Task")
    public void userClearTheCompletedToDoTask() {
        allToDo.clearCompleted();
    }

    @Then("User see the complete To-Do Task has been cleared")
    public void userSeeTheCompleteToDoTaskHasBeenCleared() {
        
    }

    @When("User click the hamburger menu")
    public void userClickTheHamburgerMenu() {
        allToDo.clickHamburger();
    }


    @When("User click the statistics menu")
    public void userClickTheStatisticsMenu() {
        allToDo.clickStatistic();
    }

    @Then("User see the statistics of the To-Do Task")
    public void userSeeTheStatisticsOfTheToDoTask() {
        statisticToDo.isOnPage();

    }
}
