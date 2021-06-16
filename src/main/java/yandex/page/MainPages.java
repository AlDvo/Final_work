package yandex.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class MainPages extends BasePages {

    @FindBy(xpath = "//a[contains(@class , 'new__item_search_yes')]")
    WebElement market;

    @FindBy(xpath = "//a[contains(@class , '_3Lwc_UVFq4')]")
    WebElement catalog;

    @FindBy(xpath = "//ul[@class = '_1Y6X2G3jjK']")
    WebElement razdel;

    public MainPages(WebDriver driver){
        PageFactory.initElements(driver , this);
        this.driver = driver;
    }

    public void selectMarket(String menuItem) throws InterruptedException {
        String parentWindowContact = driver.getWindowHandle();

        market.findElement(By.xpath(".//*[text()='"+menuItem+"']")).click();
        Thread.sleep(1000);

        Set<String> handleswindow =driver.getWindowHandles();
        for(String windowHandle : handleswindow)
        {
            driver .switchTo().window(windowHandle);
        }
    }
    public void selectCatalog(String menuItem) throws InterruptedException {
        catalog.findElement(By.xpath(".//*[text()='"+menuItem+"']")).click();
    }
    public void selectRazdel(String menuItem){
        razdel.findElement(By.xpath(".//*[text()='"+menuItem+"']")).click();
    }
}
