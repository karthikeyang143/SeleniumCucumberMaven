package com.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinitions {
        @Given("sample feature file is ready")
        public void sample_feature_file_is_ready() {
            // Write code here that turns the phrase above into concrete actions
             System.out.println("Given statement is executed");
        }

        @When("I run the feature file")
        public void i_run_the_feature_file() {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("When statement is executed");
        }

        @Then("run should be successful")
        public void run_should_be_successful() {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Then statement is executed");
        }
    }

