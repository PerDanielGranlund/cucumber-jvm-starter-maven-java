package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opentest4j.TestAbortedException;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.print(int1 + " hour later...");
//      while (cukes > 0) {
        Belly stomach = new Belly();
        stomach.eat(int1);
//        }
        //throw new TestAbortedException("TODO");
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        System.out.print("Belly says growl!/n");
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Given("I have {int} energy")
    public void i_have_energy(Integer kcal) {
        Integer energy = kcal / 1000;
        System.out.println(energy);
        System.out.println(kcal);
    }

    @When("I run {int} mile")
    public void i_run_a_mile(Integer int2) {
        Belly training = new Belly();
        training.comsume(int2);
        //System.out.print(temp);
    }

    @Then("I should need to eat")
    public void i_should_need_to_eat() {
        System.out.println("Eee-nerd-gy!");
    }

}
