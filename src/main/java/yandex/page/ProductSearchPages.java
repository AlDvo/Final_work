package yandex.page;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yandex.step.BaseStep;

public class ProductSearchPages extends BasePages{

    @FindBy(xpath = "//input[contains(@name ,'Цена от')]")
    WebElement startPrice;

    @FindBy(xpath = "//div[contains(@id , 'search-prepack')]")
    WebElement maker;

    @FindBy(xpath = "//button[contains(@class ,'vLDMfabyVq')]")
    WebElement list;

    @FindBy(xpath = "//article[@data-autotest-id = 'product-snippet'][1]//*[@data-zone-name = 'title']")
    WebElement firstElement;

    @FindBy(xpath = "//*[@id = 'header-search']")
    WebElement find;

    @FindBy(xpath = "//*[@data-r = 'search-button']")
    WebElement findButton;


    public ProductSearchPages(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fillField(String element, String value){
        fillField(startPrice , value);
    }

    public void  selectMaker(String menuItem) throws InterruptedException {
        maker.findElement(By.xpath(".//*[text()='"+menuItem+"']")).click();
        Thread.sleep(5000);
    }

    public void remember () throws InterruptedException {
        String product = firstElement.getText();
        fillField(find , product);
        findButton.click();
        Thread.sleep(1000);
    }

    public void contrast(){
        String xpath = "//input[@id = 'header-search']";
        String findValue = BaseStep.getDriver().findElement(By.xpath(xpath)).getText();
        String actualValue = firstElement.getText();
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualValue, findValue),actualValue.contains(findValue));
    }
}
