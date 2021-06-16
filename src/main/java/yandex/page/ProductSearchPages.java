package yandex.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPages extends BasePages{

    @FindBy(xpath = "//input[contains(@name ,'Цена от')]")
    WebElement startPrice;

    @FindBy(xpath = "//div[contains(@id , 'search-prepack')]")
    WebElement maker;

    @FindBy(xpath = "//button[contains(@class ,'vLDMfabyVq')]")
    WebElement list;

    public ProductSearchPages(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fillField(String element, String value){
        fillField(startPrice , value);
    }

    public void  selectMaker(String menuItem) throws InterruptedException {
        maker.findElement(By.xpath(".//*[text()='"+menuItem+"']")).click();
        Thread.sleep(1000);
    }
}
