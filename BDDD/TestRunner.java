package com.cg.capgemini.cap_product;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 * public class TestRunner {
 * 
 * }
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java"
        )

public class TestRunner {

}