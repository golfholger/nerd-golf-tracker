package de.itagile.golf;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true, 
		tags = {"not @in_arbeit"},
		monochrome = true,
		features = "src/cucumber/resources"
)
public class AllFeatures {
}
