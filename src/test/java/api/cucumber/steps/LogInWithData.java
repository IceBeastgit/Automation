package api.cucumber.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;

public class LogInWithData {
    @Given("User is at Log in Page of application")
    public void userIsAtLogInPageOfApplication() {
        
    }

    @When("User Logs in with following username and passwords")
    public void userLogsInWithFollowingUsernameAndPasswords(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> list_of_rows = dataTable.asLists();
        for (List<String> row: list_of_rows){
            for (String str: row){
                System.out.println("data: "+ str);
            }

        }
        
    }

    @Then("User should be able to log in with correct username and password")
    public void userShouldBeAbleToLogInWithCorrectUsernameAndPassword() {
    }
}
