package cucumber.pages;

import cucumber.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RecruitmentPage {

    private WebDriver driver;

    private WebElement selectjobtitle;
    private WebElement selectvacancy;
    private WebElement selecthiringmanager;
    private WebElement selectstatus;

    public RecruitmentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);


    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div")
    WebElement jobtitle;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")
    WebElement vacancy;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div")
    WebElement hiringmanager;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
    WebElement status;

    @FindBy(name = "candidatename")
    WebElement candidatename;

    @FindBy(name = "keywords")
    WebElement keywords;

    @FindBy(name = "datefrom")
    WebElement datefrom;

    @FindBy(name = "dateto")
    WebElement dateto;

    @FindBy(name = "method")
    WebElement method;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]")
    WebElement btnRecruitment;

    public void recruitment(String candidatename, String keywords, String datefrom, String dateto, String method){

        this.candidatename.sendKeys(candidatename);
        this.keywords.sendKeys(keywords);
        this.datefrom.sendKeys(datefrom);
        this.dateto.sendKeys(dateto);
        this.method.sendKeys(method);


    }
    public void selectjobtitle1(String jobtitle){
        this.selectjobtitle.sendKeys(Keys.ARROW_DOWN);
    }
    public void selectvacancy1(String vacancy){
        this.selectvacancy.sendKeys(Keys.ARROW_DOWN);
    }
    public void selecthiringmanager1(String hiringmanager){
        this.selecthiringmanager.sendKeys(Keys.ARROW_DOWN);
    }
    public void selectstatus1(String status){
        this.selectstatus.sendKeys(Keys.ARROW_DOWN);
    }

    public void clickBtnRecruitment() { btnRecruitment.click(); }

}
