package com.qait.tatocAdvance.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/**
 * This is a test Runner class which have the information about where to look for feature file
 * and Step Definitions
 * @author shivambharadwaj
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/tatocAdvance.feature",
                  glue = { "stepDefs" })

public class TestRunner {

}