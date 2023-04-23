package apiApril.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrelloSteps {

    @Given ("The board exists and contains the correct information")
    public void getBoardDataAndCheckInfo() {
        System.out.println("This is the first step");
    }

    @When("I change the board title to {string}")
    public void iChangeTheBoardTitleTo(String title) {
        System.out.println("This is the second step");
    }

    @And("I check that the board name is updated to {string}")
    public void iCheckThatTheBoardNameIsUpdatedTo(String title) {
        System.out.println("This is the third step");
    }

    @Then("I add a list named {string} to the board")
    public void iAddAListNamedToTheBoard(String listName) {
        System.out.println("This is the fourth step");
    }
}

