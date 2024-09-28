package com.aiite.runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\AzharudeenJaferali\\eclipse-workspace\\JuneBDDAutomation\\src\\test\\resources\\Features",
				glue={"com.aiite.pageexecution","com.aiite.hookspackage"},
				dryRun = true,
				tags="@Smoke",
				plugin= {"html:Reports/HtmlReport.html", "json:Reports/JsonReport.json","rerun:target/Rerun.txt"})
public class Runner {

}
