package com.aiite.runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/Rerun.txt",
				glue="com.aiite.pageexecution",
				plugin= {"html:Reports/HtmlReport.html", "json:Reports/JsonReport.json","rerun:target/Rerun.txt"})
public class Rerunner {

}
