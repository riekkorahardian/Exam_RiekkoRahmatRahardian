@Android
  Feature: ToDoApp
    @Check
    Scenario: Check User is on To-Do Task Homepage
      Given User is on To-Do Task Homepage

    @CreateToDoOlahraga
    Scenario: User create a to-do task
      Given User is on To-Do Task Homepage
      When User click create To-Do button
      And User Type "Olahraga Pagi" on text field
      Then User see the "Olahraga Pagi" task has been created

    @CreateToDoBelanja
    Scenario: User create a to-do task
      Given User is on To-Do Task Homepage
      When User click create To-Do button
      And User Type "Belanja" on text field
      Then User see the "Belanja" task has been created

    @CompleteToDo
    Scenario: User complete the To-Do task
      Given User already create "Olahraga Pagi" To-Do Task
      When User check the checklist button on Olahraga Pagi Task
      Then User see the Olahraga Pagi task has been checked

    @UncheckToDo
    Scenario: User uncheck the To-Do task
      Given User already create "Olahraga Pagi" To-Do Task
      Given User already check the task has been checked
      When User uncheck the checklist button on Olahraga Pagi Task
     Then User see the Olahraga Pagi task has been unchecked

    @FilterActive//
    Scenario: User filter the Active To-Do task
      Given User already create "Olahraga Pagi" To-Do Task
      When User filter the To-Do task to Active To-Do Task only
      Then User see the Active To-Do Task list only

    @FilterComplete//
    Scenario: User filter the Completed To-Do Task
      Given User already create "Olahraga Pagi" To-Do Task
      Given User check the checklist button on Olahraga Pagi Task
      When User filter the To-Do task to Completed To-Do Task only
      Then User see the Completed To-Do Task list only

    @RefreshToDo
    Scenario: User refresh the To-Do Task
      Given User already create "Olahraga Pagi" To-Do Task
      When User click the option icon
      And User refresh the To-Do Task list
      Then User see the "Olahraga Pagi" To-Do Task has been refreshed

    @ClearComplete
    Scenario: User clear the completed To-Do Task
      Given User already create "Olahraga Pagi" To-Do Task
      Given User check the checklist button on Olahraga Pagi Task
      When User click the option icon
      And User clear the Completed To-Do Task
      Then User see the complete To-Do Task has been cleared

    @CheckStatistic
    Scenario: User check statistic of To-Do Task
      Given User already create "Olahraga Pagi" To-Do Task
      When User click the hamburger menu
      When User click the statistics menu
      Then User see the statistics of the To-Do Task