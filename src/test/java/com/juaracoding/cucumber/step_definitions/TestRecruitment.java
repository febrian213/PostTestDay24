package com.juaracoding.cucumber.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.pages.RecruitmentPage;
import cucumber.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRecruitment {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Test Case One
    @When("User on Dashboard")
    public void user_on_Dashboard() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
        recruitmentPage.recruitment("IT","Software Quality Assurance","01-11-2022","20-11-2022","manual");

    }

    @And("input complete job title")
    public void admin_input_complete_jobtitle() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
        recruitmentPage.selectjobtitle1("Account Assistent");
        extentTest.log(LogStatus.PASS, "input complete job title");
    }

    @And("input complete job vacancy")
    public void admin_input_complete_vacancy() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
        recruitmentPage.selectvacancy1("Junior Account Assistent");
        extentTest.log(LogStatus.PASS, "input complete vacancy");
    }

    @And("input complete hiring manager")
    public void admin_input_complete_hiringmanager() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
        recruitmentPage.selecthiringmanager1("Odis Adalwin");
        extentTest.log(LogStatus.PASS, "input complete hiring manager");
    }

    @And("input complete status")
    public void admin_input_complete_status() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
        recruitmentPage.selectstatus1("Application Initiated");
        extentTest.log(LogStatus.PASS, "input complete status");
    }

    @Then("User click button search valid")
    public void user_click_button_search_valid() {
        recruitmentPage.clickBtnRecruitment();
        extentTest.log(LogStatus.PASS, "User click button login valid");
    }



}


